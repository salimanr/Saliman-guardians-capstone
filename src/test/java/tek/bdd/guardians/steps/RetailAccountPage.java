package tek.bdd.guardians.steps;

import io.cucumber.java.en.When;
import tek.bdd.guardians.utilities.CommonUtility;


public class RetailAccountPage extends CommonUtility {
	POMFactroy factroy = new POMFactroy();

    @When("User click on Account option")

    public void userClickOnAccountOption() {

        click(POMFactory.retailAccountPage().accountLink);

        logger.info("Account link was clicked successfully");

    }

    @When("User update Name {string} and Phone {string}")

    public void userUpdateNameAndPhone(String name, String phoneNumber) {

        clearTextUsingSendKeys(pomFactory.retailAccountPage().nameField);

        sendText(pomFactory.retailAccountPage().nameField, name);

        logger.info("Name was entered successfully");

        clearTextUsingSendKeys(pomFactory.retailAccountPage().phoneField);

        sendText(pomFactory.retailAccountPage().phoneField, phoneNumber);

        logger.info("Phone Number was entered successfully");

    }

    @When("User click on Update button")

    public void userClickOnUpdateButton() {

        click(pomFactory.retailAccountPage().updateBttn);

        logger.info("Update button was clicked successfully");

    }

    @Then("user profile information should be updated")

    public void userProfileInformationShouldBeUpdated() {

        waitTillPresence(pomFactory.retailAccountPage().personalInfoUpdateSuccessMssg);

        String expectedMssg = "Personal Information Updated Successfully";

        String actualMssg = pomFactory.retailAccountPage().personalInfoUpdateSuccessMssg.getText();

        Assert.assertEquals(expectedMssg, actualMssg);

        logger.info("Account information was updated successfully");

    }

[5:28 PM] Emal Ramin

    @FindBy(linkText = "Account")

    public WebElement accountLink;


    @FindBy(id = "nameInput")

    public WebElement nameField;


    @FindBy(id = "personalPhoneInput")

    public WebElement phoneField;


    @FindBy(id = "personalUpdateBtn")

    public WebElement updateBttn;


    @FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")

    public WebElement personalInfoUpdateSuccessMssg;

}
