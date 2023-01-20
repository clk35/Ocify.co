package com.ocify.step_definitions;

import com.github.javafaker.Faker;
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
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAd_step_definition {
    C2CHomePage c2CHomePage = new C2CHomePage();
    ProfilePage profilePage = new ProfilePage();
    CreateAdPage createAdPage = new CreateAdPage();
    LoginPage loginPage = new LoginPage();

    Faker faker = new Faker();

    @Given("user is already on his-her own market")
    public void user_is_already_on_his_her_own_market() {

        loginPage.siteManagementLink.click();
        profilePage.linkToC2c.click();
        //BrowserUtils.sleep(1);

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




    @When("user clicks on Contact Information")
    public void user_clicks_on_contact_information() {
        createAdPage.howCanBeContactedQuestion.click();
    }
    @When("user types title {string}")
    public void user_types_title(String titleOfAd) {
        createAdPage.titleOfAd.sendKeys(titleOfAd);

    }
    @When("user types price {int} and standard price {int}")
    public void user_types_price_and_standard_price(Integer price, Integer standardPrice) {
       createAdPage.price.sendKeys(price+"");
       createAdPage.standardPrice.sendKeys(standardPrice+"");
    }
    @When("user adds description about product")
    public void user_adds_description_about_product() {
       createAdPage.adDescription.sendKeys(faker.lorem().paragraph());
       BrowserUtils.sleep(2);
    }
    @When("user uploads product photo")
    public void user_uploads_product_photo() {


        // disable the click event on an `<input>` file
        ((JavascriptExecutor)Driver.getDriver()).executeScript(
                "HTMLInputElement.prototype.click = function() {                     " +
                        "  if(this.type !== 'file') HTMLElement.prototype.click.call(this);  " +
                        "};                                                                  " );

        // trigger the upload
        createAdPage.photoUploadBtn.click();
        BrowserUtils.sleep(1);

        //C:\Users\musta\OneDrive\Desktop\PhotoForOcify\waschmaschine.jpg

        // assign the file to the `<input>`
        Driver.getDriver().findElement(By.cssSelector("input[type=file]"))
                .sendKeys("");
        BrowserUtils.sleep(1);
        //createAdPage.photoUploadBtn.sendKeys("C:\\Users\\musta\\OneDrive\\Desktop\\PhotoForOcify\\waschmaschine.jpg");




    }
    @When("user clicks on publish button")
    public void user_clicks_on_publish_button() {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",createAdPage.publishBtn);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", createAdPage.publishBtn);


    }
    @When("user clicks on continue button on Preview Page")
    public void user_clicks_on_continue_button_on_preview_page() {
        createAdPage.continueWithPreview.click();
    }
    @When("user doesn't buy any doping on the Doping Page")
    public void user_doesn_t_buy_any_doping_on_the_doping_page() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(createAdPage.iDontWantToUpgradeBtn));
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",createAdPage.iDontWantToUpgradeBtn);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", createAdPage.iDontWantToUpgradeBtn);
    }
    @Then("the advertisement should be shown on the page after searching for it")
    public void the_advertisement_should_be_shown_on_the_page_after_searching_for_it() {
        c2CHomePage.searchBox.sendKeys("Bosch 9 kg Camasir Makinesi"+Keys.ENTER);

        Assert.assertTrue(c2CHomePage.advertisement.isDisplayed());
    }



}





