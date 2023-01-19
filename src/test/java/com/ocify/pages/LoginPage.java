package com.ocify.pages;

import com.ocify.utilities.BrowserUtils;
import com.ocify.utilities.ConfigurationReader;
import com.ocify.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@href='https://ocify.co/login'])[1]")
    public WebElement loginBtnOnHomePage;

    @FindBy(xpath = "//a[@href='https://ocify.co/my-sites']")
    public WebElement siteManagementLink;

    @FindBy(id= "email")
    public WebElement inputEmail;

    @FindBy(id= "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInBtn;

    @FindBy(xpath = "//img[@alt='Profile Photo']")
    public WebElement avatarProfile;

    @FindBy(xpath = "(//a[@href='https://ocify.co/logout'])[2]")
    public WebElement logoutBtn;

    public  void login(String email, String password){

        loginBtnOnHomePage.click();
        inputEmail.sendKeys(email);
        BrowserUtils.sleep(1);

        inputPassword.sendKeys(password);
        BrowserUtils.sleep(1);
        signInBtn.click();
    }


}
