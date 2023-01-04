package com.ocify.step_definitions;

import com.ocify.pages.LoginPage;
import com.ocify.pages.SignupPage;
import com.ocify.utilities.BrowserUtils;
import io.cucumber.java.en.When;

public class Signup_step_definition {
    SignupPage signupPage = new SignupPage();

    @When("user clicks on Sign Up button")
    public void user_clicks_on_sign_up_button() {
        BrowserUtils.sleep(2);
        signupPage.signupBtnOnHomePage.click();
    }
    @When("user enters an username {string}")
    public void user_enters_an_username(String username) {
        BrowserUtils.sleep(1);
        signupPage.inputUserName.sendKeys(username);
    }
    @When("user clicks on agreement and conditions button")
    public void user_clicks_on_agreement_and_conditions_button() {
     signupPage.agreeTermsCondBtn.click();
        BrowserUtils.sleep(1);
    }
}
