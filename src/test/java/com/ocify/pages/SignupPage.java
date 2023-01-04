package com.ocify.pages;

import com.ocify.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

    public SignupPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[@href='https://ocify.co/register']")
    public WebElement signupBtnOnHomePage;

    @FindBy(xpath = "//a[@class='cus_mb-10 ml-3 btn btn btn-outline-light']")
    public WebElement signupBtnOnHomePageWithClass;


    @FindBy(css = "input#username")
    public WebElement inputUserName;

    @FindBy(id= "email")
    public WebElement inputEmail;

    @FindBy(id= "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//div[@class='checkbox remember']/label/input")
    public WebElement agreeTermsCondBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitBtn;

    @FindBy(xpath = "//p[.='Your account has been registered.']")
    public WebElement registrationMessage;

    @FindBy(xpath = "//p[.='Please confirm your email to activate your account.']")
    public WebElement checkMailBoxMessage;

}
