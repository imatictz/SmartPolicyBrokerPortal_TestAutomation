package utility;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Utility class for all insurance premium calculations.
 *
 * This class contains ONLY business calculation formulas.
 * No Selenium code.
 * No Assertions.
 * No Reporting.
 *
 * @author Praveen
 */
public final class CalculationUtil {

    private CalculationUtil() {
        // Prevent object creation
    }

    /**
     * Round value to 2 decimal places.
     */
    public static double round(double value) {

        return BigDecimal.valueOf(value)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();

    }

    /**
     * Actual Premium
     *
     * Formula:
     * Contract Value × Rate /100
     */
    public static double calculateActualPremium(double contractValue,
                                                double rate) {

        return round((contractValue * rate) / 100);

    }

    /**
     * Total Premium
     *
     * Formula:
     * Actual Premium + Adjust Premium
     */
    public static double calculateTotalPremium(double actualPremium,
                                               double adjustPremium) {

        return round(actualPremium + adjustPremium);

    }

    /**
     * VAT Amount
     *
     * Formula:
     * Total Premium × VAT %
     */
    public static double calculateVAT(double totalPremium,
                                      double vatRate) {

        return round((totalPremium * vatRate) / 100);

    }

    /**
     * Levy
     *
     * Formula:
     * Total Premium × Levy %
     */
    public static double calculateLevy(double totalPremium,
                                       double levyRate) {

        return round((totalPremium * levyRate) / 100);

    }

    /**
     * Withholding Tax
     *
     * Formula:
     * Total Premium × WHT %
     */
    public static double calculateWithholdingTax(double totalPremium,
                                                 double whtRate) {

        return round((totalPremium * whtRate) / 100);

    }

    /**
     * Gross Premium
     *
     * Formula:
     * Total Premium
     * + VAT
     * + Other Fee
     * + Levy
     * + Stamp Duty
     * - Withholding Tax
     */
    public static double calculateGrossPremium(
            double totalPremium,
            double vat,
            double otherFee,
            double levy,
            double stampDuty,
            double withholdingTax) {

        return round(
                totalPremium
                        + vat
                        + otherFee
                        + levy
                        + stampDuty
                        - withholdingTax);

    }

    /**
     * Broker Commission
     *
     * Formula:
     * Total Premium × Commission %
     */
    public static double calculateBrokerCommission(
            double totalPremium,
            double commissionRate) {

        return round((totalPremium * commissionRate) / 100);

    }

    /**
     * VAT On Commission
     *
     * Formula:
     * Commission × VAT %
     */
    public static double calculateVATOnCommission(
            double commission,
            double vatRate) {

        return round((commission * vatRate) / 100);

    }

    /**
     * Insurer Settlement
     *
     * Formula:
     * Gross Premium
     * - Broker Commission
     * - VAT On Commission
     */
    public static double calculateInsurerSettlement(
            double grossPremium,
            double brokerCommission,
            double vatOnCommission) {

        return round(
                grossPremium
                        - brokerCommission
                        - vatOnCommission);

    }

    /**
     * Total Receivable
     *
     * Formula:
     * Settlement
     * + Administration Charges
     * - Discount On Commission
     * - Discount On Premium
     * + Addon Premium
     */
    public static double calculateTotalReceivable(
            double settlement,
            double administrationCharges,
            double discountOnCommission,
            double discountOnPremium,
            double addonPremium) {

        return round(
                settlement
                        + administrationCharges
                        - discountOnCommission
                        - discountOnPremium
                        + addonPremium);

    }

}