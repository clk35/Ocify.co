package com.ocify.step_definitions;

import com.ocify.pages.LoginPage;
import com.ocify.utilities.BrowserUtils;
import com.ocify.utilities.ConfigurationReader;
import com.ocify.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.lang.module.Configuration;

public class Login_step_definition {
    LoginPage loginPage = new LoginPage();
    @Given("user is already home page")
    public void user_is_already_home_page() {


    }
    @When("user clicks on login button")
    public void userClicksOnLoginButton() {
        loginPage.loginBtnOnHomePage.click();
    }
    @When("user enters  email address {string}")
    public void user_enters_email_address(String email) {

        BrowserUtils.sleep(1);
        loginPage.inputEmail.sendKeys(email);
        BrowserUtils.sleep(1);


    }
    @When("user enters  password {string}")
    public void user_enters_password(String password) {
        loginPage.inputPassword.sendKeys(password);
        BrowserUtils.sleep(1);
        loginPage.signInBtn.click();
    }
    @Then("user should be logged in")
    public void user_should_be_logged_in() {
        Assert.assertTrue(loginPage.avatarProfile.isDisplayed());
    }



}
