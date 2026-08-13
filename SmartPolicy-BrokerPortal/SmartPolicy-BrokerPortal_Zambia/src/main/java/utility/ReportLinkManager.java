package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReportLinkManager {

    private static final String FILE_PATH = "target/All_Report_Links.xlsx";

    // ✅ Thread-safe method
    public synchronized static void addReportLink(String reportName, String pdfUrl) {
    	System.out.println("🔥 addReportLink() method called");

        try {

            File file = new File(FILE_PATH);
            Workbook workbook;
            Sheet sheet;

            // If file exists → open it
            if (file.exists()) {

                FileInputStream fis = new FileInputStream(file);
                workbook = new XSSFWorkbook(fis);
                sheet = workbook.getSheetAt(0);
                fis.close();

            } else {

                // Create new file
                workbook = new XSSFWorkbook();
                sheet = workbook.createSheet("Report Links");

                // Create Header
                Row header = sheet.createRow(0);
                header.createCell(0).setCellValue("Report Name");
                header.createCell(1).setCellValue("PDF URL");
                header.createCell(2).setCellValue("Execution Time");
            }

            // Append new row
            int lastRow = sheet.getLastRowNum();
            Row row = sheet.createRow(lastRow + 1);

            row.createCell(0).setCellValue(reportName);
            row.createCell(1).setCellValue(pdfUrl);
            row.createCell(2).setCellValue(
                    LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"))
            );

            // Auto-size columns
            sheet.autoSizeColumn(0);
            sheet.autoSizeColumn(1);
            sheet.autoSizeColumn(2);

            FileOutputStream fos = new FileOutputStream(FILE_PATH);
            workbook.write(fos);
            fos.close();
            workbook.close();

            System.out.println("✅ Link added to Excel: " + pdfUrl);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
