package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Utility class for reading numeric values from UI.
 *
 * Supports:
 *  - Input textbox
 *  - Label
 *  - Span
 *  - Div
 *
 * Removes:
 *  - Comma (,)
 *  - Percentage (%)
 *  - Currency symbols
 *  - Spaces
 *
 * Returns double value.
 *
 * @author Praveen
 */
public final class NumberUtil {

	private static WebDriver d() {
	    return SeleniumOperations.getDriver();
	}
    private NumberUtil() {

    }

    /**
     * Read amount from locator.
     *
     * @param locator Selenium locator
     * @return double value
     */
    public static double getAmount(By locator) {

        WebElement element =
                d().findElement(locator);

        return getAmount(element);
    }

    /**
     * Read amount from WebElement.
     */
    public static double getAmount(WebElement element) {

        String value = "";

        // First preference : value attribute
        value = element.getAttribute("value");

        // Second preference : visible text
        if (value == null || value.trim().isEmpty()) {

            value = element.getText();

        }

        value = clean(value);

        if (value.isEmpty()) {

            return 0;

        }

        return Double.parseDouble(value);

    }

    /**
     * Remove comma, currency, %, spaces etc.
     */
    public static String clean(String value) {

        if (value == null) {

            return "";

        }

        return value
                .replace(",", "")
                .replace("%", "")
                .replace("$", "")
                .replace("₹", "")
                .trim();

    }

    /**
     * Convert String to double.
     */
    public static double toDouble(String value) {

        value = clean(value);

        if (value.isEmpty()) {

            return 0;

        }

        return Double.parseDouble(value);

    }

    /**
     * Compare two double values after rounding.
     */
    public static boolean equals(double expected,
                                 double actual) {

        return Double.compare(

                CalculationUtil.round(expected),

                CalculationUtil.round(actual)

        ) == 0;

    }
    /**
     * Format value for reporting.
     */
    public static String format(double value) {

        return String.format("%,.2f", value);

    }

}