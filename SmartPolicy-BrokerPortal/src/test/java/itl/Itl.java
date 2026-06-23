package itl;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Hashtable;

import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Itl {

	public static void CustomClickEvent(String strElementId, String stepName,String strElementType, Integer intThreadSleepTime) throws InterruptedException {
		if (strElementType == "CLICK") 
		{
			Object[] input = new Object[2];
			input[0]=strElementId;
			Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), stepName, output.get("MESSAGE").toString());
			Thread.sleep(intThreadSleepTime);
		}
	}
	
	public static void ClickEvent(String strElementId,String strElementType, Integer intThreadSleepTime) throws InterruptedException {
		if (strElementType == "CLICK") 
		{
			Object[] input = new Object[2];
			input[0]=strElementId;
			SeleniumOperations.clickOnElement(input);
			Thread.sleep(intThreadSleepTime);
		}
	}
	
	public static void CustomClearEvent(String strElementId,String strElementType, Integer intThreadSleepTime) throws InterruptedException {
		if (strElementType == "CLEAR") 
		{
			Object[] input = new Object[2];
			input[0]=strElementId;
			SeleniumOperations.clear(input);
			Thread.sleep(intThreadSleepTime);
		}
	}
	
	public static void CustomDoubleClickEvent(String strElementId, String stepName,String strElementType, Integer intThreadSleepTime) throws InterruptedException {
		if (strElementType == "CLICK") 
		{
			Object[] input = new Object[2];
			input[0]=strElementId;
			Hashtable<String, Object> output = SeleniumOperations.doubleClickOnElement(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), stepName, output.get("MESSAGE").toString());
			Thread.sleep(intThreadSleepTime);
		}
	}
	
	public static void CustomSendEvent(String strElementId,String strInputText,String stepName,
		String strElementType, int intThreadSleepTime ) throws InterruptedException {
		/*strElementType can be as follows: Textbox, Dropdown, RadioButton, CheckBox*/
		if (strElementType == "TEXTBOX") {
			Object[] input = new Object[2];
			input[0]=strElementId;
			input[1]=strInputText;
			Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), stepName, output.get("MESSAGE").toString());
			Thread.sleep(intThreadSleepTime);	
		}
	}
	
	public static void SendEvent(String strElementId,String strInputText,
			String strElementType, int intThreadSleepTime ) throws InterruptedException {
			/*strElementType can be as follows: Textbox, Dropdown, RadioButton, CheckBox*/
			if (strElementType == "TEXTBOX") {
				Object[] input = new Object[2];
				input[0]=strElementId;
				input[1]=strInputText;
				SeleniumOperations.sendKeys(input);
				Thread.sleep(intThreadSleepTime);	
			}
		}
	
	public static void SendDynamicValuesEvent(String strElementId,String strInputText,
			String strElementType, int intThreadSleepTime ) throws InterruptedException {
			/*strElementType can be as follows: Textbox, Dropdown, RadioButton, CheckBox*/
			if (strElementType == "TEXTBOX") {
				Object[] input = new Object[2];
				input[0]=strElementId;
				input[1]=strInputText;
				SeleniumOperations.DynamicValuessendKeys(input);
				Thread.sleep(intThreadSleepTime);	
			}
		}
	
	public static void CustomSendTodaysDateEvent(
	        String strElementXpath,
	        String dateValue,
	        String stepName,
	        String strElementType,
	        int intThreadSleepTime
	) throws InterruptedException {

	    if ("TEXTBOX".equalsIgnoreCase(strElementType)) {

	        Object[] input = new Object[2];
	        input[0] = strElementXpath;
	        input[1] = dateValue;

	        Hashtable<String, Object> output = SeleniumOperations.sendDate(input);
	        HTMLReportGenerator.StepDetails(
	                output.get("STATUS").toString(),
	                stepName,
	                output.get("MESSAGE").toString()
	        );
	        Thread.sleep(intThreadSleepTime);
	    }
	}
	
	public static void CustomDropdownOptionsEvent(String strElementId,String strInputText,String stepName,
			String strElementType, int intThreadSleepTime ) throws InterruptedException {
			/*strElementType can be as follows: Textbox, Dropdown, RadioButton, CheckBox*/
			if (strElementType == "DROPDOWN") {
				Object[] input = new Object[2];
				input[0]=strElementId;
				input[1]=strInputText;
				Hashtable<String, Object> output = SeleniumOperations.dropdownOptions(input);
				HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), stepName, output.get("MESSAGE").toString());
				Thread.sleep(intThreadSleepTime);	
			}
		}
	
	public static void CustomValidateDobEvent(String strElementId,String strInputText,String stepName,
			String strElementType, int intThreadSleepTime ) throws InterruptedException {
			/*strElementType can be as follows: Textbox, Dropdown, RadioButton, CheckBox*/
			if (strElementType == "Textbox") {
				Object[] input = new Object[2];
				input[0]=strElementId;
				input[1]=strInputText;
				Hashtable<String, Object> output = SeleniumOperations.validateDob(input);
				HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), stepName, output.get("MESSAGE").toString());
				Thread.sleep(intThreadSleepTime);	
			}
		}
	
	public static void CustomClearSendEvent(String strElementId,String strInputText,String stepName,
			String strElementType, int intThreadSleepTime ) throws InterruptedException {
			/*strElementType can be as follows: Textbooks, Dropdown, RadioButton, CheckBox*/
			if (strElementType == "TEXTBOX") {
				Object[] input = new Object[2];
				input[0]=strElementId;
				input[1]=strInputText;
				Hashtable<String, Object> output = SeleniumOperations.clearAndEnter(input);
				HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), stepName, output.get("MESSAGE").toString());
				Thread.sleep(intThreadSleepTime);	
			}
	}
	public static void CustomClearSend2Event(String strElementId1, String strInputText1,
            String strElementId2, String strInputText2,
            String stepName, String strElementType,
            int intThreadSleepTime) throws InterruptedException {

      /*strElementType can be as follows: Textbox, Dropdown, RadioButton, CheckBox*/

        if (strElementType.equals("TEXTBOX")) {

       Object[] input = new Object[4];
       input[0] = strElementId1;
       input[1] = strInputText1;
       input[2] = strElementId2;
       input[3] = strInputText2;

      Hashtable<String, Object> output = SeleniumOperations.clearAndEnter2(input);

      HTMLReportGenerator.StepDetails(
      output.get("STATUS").toString(),
      stepName,
      output.get("MESSAGE").toString());

      Thread.sleep(intThreadSleepTime);
}
}
	
	public static void ClearSendEvent(String strElementId,String strInputText,
			String strElementType, int intThreadSleepTime ) throws InterruptedException {
			/*strElementType can be as follows: Textbooks, Dropdown, RadioButton, CheckBox*/
			if (strElementType == "TEXTBOX") {
				Object[] input = new Object[2];
				input[0]=strElementId;
				input[1]=strInputText;
				SeleniumOperations.clearAndEnter(input);
				Thread.sleep(intThreadSleepTime);	
			}
	}
	
	public static void CustomValidationEvent(String strElementId,String strInputText,String stepName,
			String strElementType, int intThreadSleepTime ) throws InterruptedException {
			/*strElementType can be as follows: Textbooks, Dropdown, RadioButton, CheckBox*/
			if (strElementType == "VALIDATION") {
				Object[] input = new Object[2];
				input[0]=strElementId;
				input[1]=strInputText;
				//input[2]=strStatusText;
				Hashtable<String, Object> output = SeleniumOperations.validation(input);
				HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), stepName, output.get("MESSAGE").toString());
				Thread.sleep(intThreadSleepTime);	
			}
	}
	
	public static void CustomValidationPolicyCancellationCalculationEvent(
	        String stepName,
	        String strElementType,
	        int intThreadSleepTime) throws InterruptedException {

	    if ("VALIDATION".equalsIgnoreCase(strElementType)) {

	        Hashtable<String, Object> output =
	                SeleniumOperations.validatePolicyCancellationCalculation();

	        HTMLReportGenerator.StepDetails(
	                output.get("STATUS").toString(),
	                stepName,
	                output.get("MESSAGE").toString()
	        );

	        Thread.sleep(intThreadSleepTime);
	    }
	}
	
	public static void CustomvalidateProvisionalBatchTaxInvoicesCalculationEvent(
	        String stepName,
	        String strElementType,
	        int intThreadSleepTime) throws InterruptedException {

	    if ("VALIDATION".equalsIgnoreCase(strElementType)) {

	        Hashtable<String, Object> output =
	                SeleniumOperations.validateProvisionalBatchTaxInvoicesCalculation();

	        HTMLReportGenerator.StepDetails(
	                output.get("STATUS").toString(),
	                stepName,
	                output.get("MESSAGE").toString()
	        );

	        Thread.sleep(intThreadSleepTime);
	    }
	}

	
	public static void ValidationEvent(String strElementId,String strInputText,
			String strElementType, int intThreadSleepTime ) throws InterruptedException {
			/*strElementType can be as follows: Textbooks, Dropdown, RadioButton, CheckBox*/
			if (strElementType == "VALIDATION") {
				Object[] input = new Object[2];
				input[0]=strElementId;
				input[1]=strInputText;
				//input[2]=strStatusText;
				SeleniumOperations.validation(input);
				Thread.sleep(intThreadSleepTime);	
			}
	}
	
	

	
	public static void CustomValidationAlertEvent(String strInputText,String stepName,
			String strElementType, int intThreadSleepTime ) throws InterruptedException {
			/*strElementType can be as follows: Textbooks, Dropdown, RadioButton, CheckBox*/
			if (strElementType == "VALIDATION") {
				Object[] input = new Object[2];
				input[0]=strInputText;
				Hashtable<String, Object> output = SeleniumOperations.validationForAlert(input);
				HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), stepName, output.get("MESSAGE").toString());
				Thread.sleep(intThreadSleepTime);	
			}
	}
	
	public static void CustomValidationEnabledFields(String strInputText,String stepName,
			String strElementType, int intThreadSleepTime ) throws InterruptedException {
			/*strElementType can be as follows: Textbooks, Dropdown, RadioButton, CheckBox*/
			if (strElementType == "VALIDATION") {
				Object[] input = new Object[2];
				input[0]=strInputText;
				Hashtable<String, Object> output = SeleniumOperations.validationForEnabledFields(input);
				HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), stepName, output.get("MESSAGE").toString());
				Thread.sleep(intThreadSleepTime);	
			}
	}
	
	public static void CustomValidationDisabledFields(String strInputText,String stepName,
			String strElementType, int intThreadSleepTime ) throws InterruptedException {
			/*strElementType can be as follows: Textbooks, Dropdown, RadioButton, CheckBox*/
			if (strElementType == "VALIDATION") {
				Object[] input = new Object[2];
				input[0]=strInputText;
				Hashtable<String, Object> output = SeleniumOperations.validationForDisabledFields(input);
				HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), stepName, output.get("MESSAGE").toString());
				Thread.sleep(intThreadSleepTime);	
			}
	}
	
	/*public static void CustomPrintQuote(String input,String stepName,
			String strElementType, int intThreadSleepTime ) throws InterruptedException, IOException {
			/*strElementType can be as follows: Textbooks, Dropdown, RadioButton, CheckBox
		if ("PRINT".equalsIgnoreCase(strElementType)) {
			

		    // Pass the full array to printQuote
		    Hashtable<String, Object> output = SeleniumOperations.printQuote(input);

		    // Generate report for all fields
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), stepName, output.get("MESSAGE").toString());
			Thread.sleep(intThreadSleepTime);	
		}
	}*/
	
	public static void CustomswitchWindowEvent(String stepName ,String strElementType) {
		if(strElementType =="SWITCHWINDOW")
		try{
			Hashtable<String,Object> output = SeleniumOperations.printReport();
			
			HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), stepName, output.get("MESSAGE").toString());
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void CustomActionDownEnterEvent(String strElementId, String stepName,String strElementType, 
			                          Integer intThreadSleepTime) throws Throwable {
		if (strElementType == "ENTER") {
		Object[] input=new Object[1];
		input[0]=strElementId;
		Hashtable<String,Object> output= SeleniumOperations.actionDownEnter();
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),stepName,output.get("MESSAGE").toString());
	}
  }
	
	public static void ActionDownEnterEvent(String strElementId, String strElementType, 
            Integer intThreadSleepTime) throws Throwable {
        if (strElementType == "ENTER") {
        Object[] input=new Object[1];
        input[0]=strElementId;
        SeleniumOperations.actionDownEnter();
        Thread.sleep(intThreadSleepTime);
     }
   }
	
	public static void CustomDropdownEvent(String strElementId,String searchBoxId,String value,
			String valueId,String stepName,String strElementType,Integer intThreadSleepTime) throws InterruptedException {
		if(strElementType =="DROPDOWN") {
		Object[] input= new Object[4];
		input[0]=strElementId;
		input[1]=searchBoxId;
		input[2]=value;
		input[3]=valueId;
		Hashtable<String,Object> output=SeleniumOperations.dropdown(input);	
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),stepName,output.get("MESSAGE").toString());
		Thread.sleep(intThreadSleepTime);
		}
	}
	
	public static void DropdownEvent(String strElementId,String searchBoxId,String value,
			String valueId,String strElementType,Integer intThreadSleepTime) throws InterruptedException {
		if(strElementType =="DROPDOWN") {
		Object[] input= new Object[4];
		input[0]=strElementId;
		input[1]=searchBoxId;
		input[2]=value;
		input[3]=valueId;
		SeleniumOperations.dropdown(input);	
		Thread.sleep(intThreadSleepTime);
		}
	}
	
	public static void CustomNavigateAction(String strElementId, String stepName,String strElementType, 
            Integer intThreadSleepTime) throws Throwable {
         if (strElementType == "NAVIGATE") {
        	 Object[] input2=new Object[2];
     	    input2[0]=strElementId;
     	    Hashtable<String, Object> output2 = SeleniumOperations.actionClass(input2);
     	    HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),stepName,output2.get("MESSAGE").toString());
     	   Thread.sleep(intThreadSleepTime);
         }
    }
	
	public static void NavigateAction(String strElementId, String strElementType, 
            Integer intThreadSleepTime) throws Throwable {
         if (strElementType == "NAVIGATE") {
        	 Object[] input2=new Object[2];
     	    input2[0]=strElementId;
     	    SeleniumOperations.actionClass(input2);
     	}
    }
	
	
	
	public static void CustomGstPercentValidation(String TotalPremium,String VattGstAmount,String TotalPremiumWithTax,String strElementType,Integer intThreadSleepTime) throws InterruptedException {
		if (strElementType =="GSTVALIDATION") {
			Object[] input = new Object[3];
	        input[0] = TotalPremium;
	        input[1] =VattGstAmount;
	        input[2] = TotalPremiumWithTax;
	        SeleniumOperations.gstPercentCalculationValidation(input);
	        Thread.sleep(intThreadSleepTime);
		}
	}
	
	public static void CustomUiElementValidation(String xpath,String text,String strElementType,Integer intThreadSleepTime) throws InterruptedException {
		if (strElementType =="UiEleVALIDATION") {
			Object[] input = new Object[2];
	        input[0] = xpath;
	        input[1] =text;
	        SeleniumOperations.swahiliElement(input);
	        Thread.sleep(intThreadSleepTime);
		}
	}
	
	
	
	
}
	

