package cucumberMap24Languages;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import itl.Itl;

public class Languages {
	@When("user is on dashboard page able to view {string}")
	public void user_is_on_dashboard_page(String name) throws InterruptedException {
	    Itl.CustomUiElementValidation("//*[@id='MainContent_btnDashboard']", name, "UiEleVALIDATION", 2000);
	}
	@Then("user validate all dashboard page elements")
	public void user_validate_all_dashboard_page_elements(DataTable dataTable) throws InterruptedException {
	    List<Map<String, String>> userList =  (List<Map<String, String>>) dataTable.asMaps(String.class, String.class);
	   
	     //System.out.println(userList.get(2).get("Text"));
	    //Hi
	    Itl.CustomUiElementValidation("//*[@id='span_lblHi_lc']", userList.get(0).get("Text"), "UiEleVALIDATION", 2000);
	    //UserName
	    Itl.CustomUiElementValidation("//*[@id='MainContent_spnUserName']", userList.get(1).get("Text"), "UiEleVALIDATION",000);
	    //Clients
	    Itl.CustomUiElementValidation("//*[@id='MainContent_btnClient']", userList.get(2).get("Text"), "UiEleVALIDATION", 000);
        //Quotations
	    Itl.CustomUiElementValidation("//*[@id='MainContent_btnQuote']", userList.get(3).get("Text"), "UiEleVALIDATION", 000);
        //RiskNotes
	    Itl.CustomUiElementValidation("//*[@id='MainContent_btnRisk']", userList.get(4).get("Text"), "UiEleVALIDATION", 000);
        //Claims
	    Itl.CustomUiElementValidation("//*[@id='MainContent_btnClaim']", userList.get(5).get("Text"), "UiEleVALIDATION", 000);
        //Renewals
	    Itl.CustomUiElementValidation("//*[@id='MainContent_btnRenewals']", userList.get(6).get("Text"), "UiEleVALIDATION", 000);
        //Reports
	    Itl.CustomUiElementValidation("//*[@id='MainContent_btnReports']", userList.get(7).get("Text"), "UiEleVALIDATION", 000);
        //Knowledge Base
	    Itl.CustomUiElementValidation("//*[@id='h4_lblKnowledgeBase1_lc']", userList.get(8).get("Text"), "UiEleVALIDATION", 000);
	    //Knowledge Base Description
	    Itl.CustomUiElementValidation("//*[@id='p_lblKnowledge1_lc']", userList.get(9).get("Text"), "UiEleVALIDATION", 000);
	    //Support Forum
	    Itl.CustomUiElementValidation("//*[@id='h4_lblSupportForum1_lc']", userList.get(10).get("Text"), "UiEleVALIDATION", 000);
	    //Support Forum Description
	    Itl.CustomUiElementValidation("//*[@id='p_lblForum1_lc']", userList.get(11).get("Text"), "UiEleVALIDATION", 000);
	    //FAQ
	    Itl.CustomUiElementValidation("//*[@id='h4_lblFAQ1_lc']", userList.get(12).get("Text"), "UiEleVALIDATION", 000);
	    //FAQ Description
	    Itl.CustomUiElementValidation("//*[@id='p_lblFrequently1_lc']", userList.get(13).get("Text"), "UiEleVALIDATION", 000);
	    //Whatsapp Support
	    Itl.CustomUiElementValidation("//*[@id='div_lblWhatappSupp_lc']", userList.get(14).get("Text"), "UiEleVALIDATION", 000);
	    //Whatsapp Support1
	    Itl.CustomUiElementValidation("//*[@id='p_lbllandline1_lc']", userList.get(15).get("Text"), "UiEleVALIDATION", 000);
	    //Whatsapp Support2
	    Itl.CustomUiElementValidation("//*[@id='p_lbllandline2_lc']", userList.get(16).get("Text"), "UiEleVALIDATION", 000);
	    //Whatsapp Support3
	    Itl.CustomUiElementValidation("//*[@id='p_lblcallcenter_lc']", userList.get(17).get("Text"), "UiEleVALIDATION", 000);
	    //Whatsapp Call Support
	    Itl.CustomUiElementValidation("//*[@id='p_lblWhataooSupportcont_lc']", userList.get(18).get("Text"), "UiEleVALIDATION", 000);
	    //Skype Support
	    Itl.CustomUiElementValidation("//*[@id='div_lblSypesupp_lc']", userList.get(19).get("Text"), "UiEleVALIDATION", 000);
	    //Skype Support1
	    Itl.CustomUiElementValidation("//*[@id='p_lblSmartpolicy1_lc']", userList.get(20).get("Text"), "UiEleVALIDATION", 000);
	    //Skype Support2
	    Itl.CustomUiElementValidation("//*[@id='p_lblSmartpolicy2_lc']", userList.get(21).get("Text"), "UiEleVALIDATION", 000);
	    //Skype Support IDs
	    Itl.CustomUiElementValidation("//*[@id='p_lblSkypeassist_lc']", userList.get(22).get("Text"), "UiEleVALIDATION", 000);
	    //Email Support
	    Itl.CustomUiElementValidation("//*[@id='div_lblEmailSupp_lc']", userList.get(23).get("Text"), "UiEleVALIDATION", 000);
	    //SmartPolicy Email 
	    Itl.CustomUiElementValidation("//*[@id='p_lblsmartpolicy_lc']", userList.get(24).get("Text"), "UiEleVALIDATION", 000);
	    //Email Us
	    Itl.CustomUiElementValidation("//*[@id='p_lblForQueries_lc']", userList.get(25).get("Text"), "UiEleVALIDATION", 000);


	}
	
}
