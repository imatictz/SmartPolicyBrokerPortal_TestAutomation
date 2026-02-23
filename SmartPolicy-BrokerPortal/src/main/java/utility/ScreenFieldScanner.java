package utility;

	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
	import java.util.List;

	public class ScreenFieldScanner {
		public static WebDriver driver=null;
	    public static void main(String[] args) throws InterruptedException {
	    	 WebDriverManager.chromedriver().setup();
	    	  driver = new ChromeDriver();
	        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();

	        try {
	            // --------------------------------------------------
	            // STEP 1: YOU NAVIGATE TO REQUIRED SCREEN
	            // --------------------------------------------------
	            driver.get("https://apps.itl.co.tz/broker/"); // already navigated
	            driver.findElement(By.xpath("//*[@id='usercode']")).sendKeys("PravinS");
	            driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Wa@12345");
	            driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	            //Open Quotation Screen
	            driver.findElement(By.xpath("//*[@id='MNU_WFCLNT_2']")).click();
	            //Click on ADD
	            driver.findElement(By.xpath("//*[@id='MainContent_btnAdd']")).click();
               /* Thread.sleep(15000);
	            //Select Insurance Type
	            driver.findElement(By.xpath("//*[contains(@aria-controls,'MainContent_cmbPopInsuranceType')]")).click();
	            Thread.sleep(7000);
	            driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("Marine - Containerized ICC Clause (A)(Less Than 500M)");
	            driver.findElement(By.xpath("//*[contains(@id,'select2-MainContent_cmbPopInsuranceType-result-')]")).click();
	            Thread.sleep(10000);*/

	         // --------------------------------------------------
	            // STEP 2: Collect all visible fields
	            // --------------------------------------------------
	            List<WebElement> fields = driver.findElements(
	                    By.xpath("//input[not(@type='hidden')] | //select | //textarea")
	            );

	            System.out.println("Total Fields Found: " + fields.size());
	            System.out.println("--------------------------------------------------");

	            // --------------------------------------------------
	            // STEP 3: Process each field
	            // --------------------------------------------------
	            for (WebElement field : fields) {

	                String tag = field.getTagName();
	                String type = field.getAttribute("type");

	                String function = getFieldFunction(tag, type);
	                String fieldName = getFieldName(field);
	                boolean isMandatory = isMandatory(field);
	                String xpath = buildXPath(field, tag);

	                // 🔥 ONLY DROPDOWN ENHANCEMENT
	                if ("Dropdown".equalsIgnoreCase(function)) {

	                    String searchXPath = getDropdownSearchXPath();
	                    String resultXPath = getDropdownResultXPath(field);

	                    System.out.println(
	                            "Field Name : " + fieldName +
	                            " | Function : " + function +
	                            " | Mandatory : " + isMandatory +
	                            " | XPath : " + xpath +
	                            " | Search XPath : " + searchXPath +
	                            " | Result XPath : " + resultXPath
	                    );

	                } else {

	                    System.out.println(
	                            "Field Name : " + fieldName +
	                            " | Function : " + function +
	                            " | Mandatory : " + isMandatory +
	                            " | XPath : " + xpath
	                    );
	                }
	            }

	        } finally {
	            // driver.quit();
	        }
	    }

	    // ==================================================
	    // Identify field function
	    // ==================================================
	    private static String getFieldFunction(String tag, String type) {

	        if ("select".equalsIgnoreCase(tag))
	            return "Dropdown";

	        if ("textarea".equalsIgnoreCase(tag))
	            return "Textarea";

	        if ("input".equalsIgnoreCase(tag)) {
	            if ("checkbox".equalsIgnoreCase(type))
	                return "Checkbox";
	            if ("radio".equalsIgnoreCase(type))
	                return "Radio Button";
	            return "Text Input";
	        }

	        return "Unknown";
	    }

	    // ==================================================
	    // Detect mandatory using preceding *
	    // ==================================================
	    private static boolean isMandatory(WebElement field) {

	        List<WebElement> star = field.findElements(
	                By.xpath("preceding-sibling::span[contains(normalize-space(), '*')][1]")
	        );

	        return !star.isEmpty();
	    }

	    // ==================================================
	    // Extract field name
	    // ==================================================
	    private static String getFieldName(WebElement field) {

	        List<WebElement> labelSpan = field.findElements(
	                By.xpath("preceding::span[not(contains(text(), '*'))][1]")
	        );

	        if (!labelSpan.isEmpty()) {
	            return labelSpan.get(0).getText().trim();
	        }

	        if (field.getAttribute("placeholder") != null &&
	                !field.getAttribute("placeholder").isEmpty()) {
	            return field.getAttribute("placeholder");
	        }

	        if (field.getAttribute("name") != null &&
	                !field.getAttribute("name").isEmpty()) {
	            return field.getAttribute("name");
	        }

	        return "Unknown Field";
	    }

	    // ==================================================
	    // Build XPath locator
	    // ==================================================
	    private static String buildXPath(WebElement field, String tag) {

	        String id = field.getAttribute("id");
	        if (id != null && !id.isEmpty()) {
	            return "//" + tag + "[@id='" + id + "']";
	        }

	        String name = field.getAttribute("name");
	        if (name != null && !name.isEmpty()) {
	            return "//" + tag + "[@name='" + name + "']";
	        }

	        String placeholder = field.getAttribute("placeholder");
	        if (placeholder != null && !placeholder.isEmpty()) {
	            return "//" + tag + "[@placeholder=\"" + placeholder + "\"]";
	        }

	        List<WebElement> labelSpan = field.findElements(
	                By.xpath("preceding::span[not(contains(text(), '*'))][1]")
	        );

	        if (!labelSpan.isEmpty()) {
	            String label = labelSpan.get(0).getText().trim();
	            return "//span[normalize-space(text())='" + label + "']/following::" + tag + "[1]";
	        }

	        return getAbsoluteXPath(field);
	    }

	    // ==================================================
	    // DROPDOWN: Search input XPath
	    // ==================================================
	    private static String getDropdownSearchXPath() {
	        return "//*[@class='select2-search__field']";
	    }

	    // ==================================================
	    // DROPDOWN: Result list XPath
	    // ==================================================
	    private static String getDropdownResultXPath(WebElement field) {

	        String id = field.getAttribute("id");
	        if (id != null && !id.isEmpty()) {
	            return "(//*[contains(@data-select2-id,'" + id + "-result')])";
	        }

	        String name = field.getAttribute("name");
	        if (name != null && !name.isEmpty()) {
	            return "(//*[contains(@data-select2-id,'" + name + "-result')])";
	        }

	        return "(//*[@class='select2-results__option'])";
	    }

	    // ==================================================
	    // Absolute XPath (fallback)
	    // ==================================================
	    private static String getAbsoluteXPath(WebElement element) {

	        String script =
	                "function absoluteXPath(element) {" +
	                        "var comp, comps = [];" +
	                        "var parent = null;" +
	                        "var xpath = '';" +
	                        "var getPos = function(element) {" +
	                        "var position = 1, curNode;" +
	                        "if (element.nodeType == Node.ATTRIBUTE_NODE) return null;" +
	                        "for (curNode = element.previousSibling; curNode; curNode = curNode.previousSibling) {" +
	                        "if (curNode.nodeName == element.nodeName) ++position;" +
	                        "}" +
	                        "return position;" +
	                        "};" +
	                        "if (element instanceof Document) return '/';" +
	                        "for (; element && !(element instanceof Document); element = element.nodeType == Node.ATTRIBUTE_NODE ? element.ownerElement : element.parentNode) {" +
	                        "comp = comps[comps.length] = {};" +
	                        "comp.name = element.nodeName;" +
	                        "comp.position = getPos(element);" +
	                        "}" +
	                        "for (var i = comps.length - 1; i >= 0; i--) {" +
	                        "comp = comps[i];" +
	                        "xpath += '/' + comp.name.toLowerCase();" +
	                        "if (comp.position !== null) xpath += '[' + comp.position + ']';" +
	                        "}" +
	                        "return xpath;" +
	                        "}" +
	                        "return absoluteXPath(arguments[0]);";

	        JavascriptExecutor js =
	                (JavascriptExecutor) ((WrapsDriver) element).getWrappedDriver();
	        return (String) js.executeScript(script, element);
	    }
	}