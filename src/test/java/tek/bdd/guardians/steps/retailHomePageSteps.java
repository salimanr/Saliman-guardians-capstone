package tek.bdd.guardians.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.bdd.guardians.pages.POMFactory;
import tek.bdd.guardians.utilities.CommonUtility;

import java.util.List;

import org.junit.Assert;


public class retailHomePageSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	
	@When("User click on All section")
	public void userClickOnAllSection() {	  
		click (factory.homePage().alloptions);
		logger.info("All options dropdown was clicked");
		
	}
	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {

		List <List<String>> shopByDepartment = dataTable.asList(String.class);
		
		for (int i = 0; i< shopByDepartment.get(0).size(); i++) {
			Assert.assertTrue(isElementDisplayedDriver().findElement);
		}
	}



	@Given("User is on the retail home page")
	public void userIsOnTheRetailHomePage() {
		Assert.assertTrue(factory.homePage().tekSchoolLogo.isDisplayed());
		logger.info("Tekschool logo is displayed");



	}

	}
