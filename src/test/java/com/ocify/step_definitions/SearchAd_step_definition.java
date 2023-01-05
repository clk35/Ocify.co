package com.ocify.step_definitions;

import com.ocify.pages.C2CHomePage;
import com.ocify.utilities.BrowserUtils;
import com.ocify.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class SearchAd_step_definition {
    C2CHomePage c2CHomePage = new C2CHomePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
    Actions action = new Actions(Driver.getDriver());

    @Given("user clicks on Sign in button")
    public void user_clicks_on_sign_in_button() {
        BrowserUtils.sleep(2);
        c2CHomePage.signInBtn.click();
    }

    @When("user types into search box {string}")
    public void user_types_into_search_box(String typing) {

        BrowserUtils.switchWindow("https://mustafa.ocify.pro/");

        wait.until(ExpectedConditions.visibilityOf(c2CHomePage.searchBox));
        action.sendKeys(c2CHomePage.searchBox,typing+Keys.ENTER).perform();



    }
    @When("user clicks on the created advertisement")
    public void user_clicks_on_the_created_advertisement() {
        c2CHomePage.adAfterSearching.click();
    }
    @Then("the advertisement should be under this chain")
    public void the_advertisement_should_be_under_this_chain(List<String> categories) {
        List<String> categoriesFromPage = new ArrayList<>() ;

        for (WebElement eachCategory : c2CHomePage.categoriesChaining) {
           categoriesFromPage.add(eachCategory.getText());
        }

        Assert.assertEquals(categories,categoriesFromPage);

    }
    @Then("the advertisement title should be {string}")
    public void the_advertisement_title_should_be(String title) {
            Assert.assertTrue(c2CHomePage.adTitle.getText().equalsIgnoreCase(title));
    }

    @Then("the price should be given price {string}")
    public void thePriceShouldBeGivenPrice(String price) {
        Assert.assertTrue(c2CHomePage.priceText.getText().equalsIgnoreCase(price));
    }
}
