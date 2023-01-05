package com.ocify.step_definitions;

import com.ocify.pages.C2CHomePage;
import com.ocify.pages.CreateAdPage;
import com.ocify.pages.LoginPage;
import com.ocify.pages.ProfilePage;
import com.ocify.utilities.BrowserUtils;
import com.ocify.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class SelectionOfCategory_step_definition {
    C2CHomePage c2CHomePage = new C2CHomePage();
    ProfilePage profilePage = new ProfilePage();
    CreateAdPage createAdPage = new CreateAdPage();
    LoginPage loginPage = new LoginPage();

    @Given("user is already on his-her own market")
    public void user_is_already_on_his_her_own_market() {

        loginPage.siteManagementLink.click();
        profilePage.linkToC2c.click();
        BrowserUtils.sleep(1);

    }

    @When("user clicks on Post Ad button")
    public void user_clicks_on_post_ad_button() {

        for (String windowHandle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(windowHandle);
           if (Driver.getDriver().getCurrentUrl().equalsIgnoreCase("https://mustafa.ocify.pro/")){
               break;
           }
        }
        c2CHomePage.postAdBtn.click();
    }
    @And("user enters  email {string} and password {string}")
    public void userEntersEmailAndPassword(String email, String password) {
        createAdPage.inputMail.sendKeys(email);
        createAdPage.inputPassword.sendKeys(password);
        createAdPage.loginBtn.click();
    }

    @And("user selects first main category {string}")
    public void userSelectsFirstMainCategory(String mainCategory) {
        WebElement selectedCategory=null;

        for (WebElement category : createAdPage.categories) {
            if (category.getText().equalsIgnoreCase(mainCategory)){
                selectedCategory= category;
            }
        }
        selectedCategory.click();

        BrowserUtils.sleep(2);
    }

    @And("user selects first sub-category {string}")
    public void userSelectsFirstSubCategory(String subCategory) {
        WebElement selectedSubCategory=null;

        for (WebElement category : createAdPage.subCategories) {
            System.out.println(category.getText());
            if (category.getText().equalsIgnoreCase(subCategory)){

                selectedSubCategory= category;
            }
        }
        selectedSubCategory.click();

    }

    @And("user selects last sub-category {string}")
    public void userSelectsLastSubCategory(String lastSubCategory) {
      createAdPage.subSingleCategory.click();
    }

    @When("user clicks on Continue after selection completed")
    public void user_clicks_on_continue_after_selection_completed() {
        createAdPage.continueBtn.click();
    }

    @Then("user should be on the Listing Details step")
    public void user_should_be_on_the_listing_details_step() {
        Assert.assertTrue(createAdPage.textOfListingDetail.isDisplayed());
    }


}





