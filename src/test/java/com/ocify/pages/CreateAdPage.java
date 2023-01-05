package com.ocify.pages;

import com.ocify.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateAdPage {

    public CreateAdPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //Step0 Authentication
    @FindBy(id="email")
    public WebElement inputMail;

    @FindBy(id="password")
    public WebElement inputPassword;

    @FindBy(xpath="//i[@class='fas fa-key']")
    public WebElement loginBtn;


    //Step1  ----->Category Selection
    @FindBy(xpath = "//ul[@id='cat1']/li")
    public List<WebElement> categories;

    @FindBy(xpath = "//ul[@id='cat2']/li")
    public List<WebElement> subCategories;

    @FindBy(xpath = "//ul[@id='cat3']/li")
    public WebElement subSingleCategory;

    @FindBy(xpath = "//button[.='Continue']")
    public WebElement continueBtn;

    //Step2 -------->Listing Details

    @FindBy(xpath = "//h1[.='Listing Details']")
    public WebElement textOfListingDetail;

    @FindBy(xpath = "(//input[@class='mr-1'])[2]")
    public WebElement howCanBeContactedQuestion;

    @FindBy(id = "name_en")
    public WebElement titleOfAd;

    @FindBy(xpath = "(//div[@class='d-flex'])[1]/input")
    public WebElement price;

    @FindBy(xpath = "(//div[@class='d-flex'])[2]//input")
    public WebElement standardPrice;

    @FindBy(xpath = "//div[@id='redactor-uuid-0']")
    public WebElement adDescription;

    @FindBy(xpath = "//div[@class='dropzone dz-clickable']")
    public WebElement photoUploadBtn;

    @FindBy(css = "div.checkbox.section.agreement>button")
    public WebElement publishBtn;

    //Step3------------>Preview

    @FindBy(xpath = "(//a[@class='btn preview-continue shadow-sm ml-4'])[1]")
    public WebElement continueWithPreview;

    //Step4------------>Doping

    @FindBy(xpath = "//a[@class='btn btn-danger px-4 mr-2']")
    public WebElement iDontWantToUpgradeBtn;


}