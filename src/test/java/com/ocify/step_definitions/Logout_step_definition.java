package com.ocify.step_definitions;

import com.ocify.pages.LoginPage;
import com.ocify.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout_step_definition {
    LoginPage loginPage = new LoginPage();

    @Given("user is already logged in")
    public void user_is_already_logged_in() {
        loginPage.login("qweertt7@gmail.com","12345678");
    }
    @When("user clicks on profile avatar")
    public void user_clicks_on_profile_avatar() {
        loginPage.avatarProfile.click();
        BrowserUtils.sleep(1);
    }
    @When("user clicks  on logout button")
    public void user_clicks_on_logout_button() {
        loginPage.logoutBtn.click();
    }
    @Then("user should be logged out")
    public void user_should_be_logged_out() {
        Assert.assertTrue(loginPage.loginBtnOnHomePage.isDisplayed());
    }
}
