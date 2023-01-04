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

    @FindBy(xpath = "(//input[@class='mr-1'])[2]")
    public WebElement howCanBeContactedQuestion;

    @FindBy(id = "name_en")
    public WebElement titleOfAd;

    @FindBy(xpath = "(//div[@class='d-flex'])[1]")
    public WebElement price;

    @FindBy(xpath = "(//div[@class='d-flex'])[2]")
    public WebElement standardPrice;

    @FindBy(xpath = "//div[@id='redactor-uuid-0']")
    public WebElement adDescription;

    @FindBy(xpath = "//i[@class='fa fa-upload ']")
    public WebElement photoUploadBtn;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-success  ']")
    public WebElement publishBtn;

    //Step3------------>Preview

    @FindBy(xpath = "(//a[@href='https://mustafa.ocify.pro/doping/5'])[1]")
    public WebElement continueWithPreview;

    //Step4------------>Doping

    @FindBy(xpath = "//a[@href='https://mustafa.ocify.pro/ad/5']")
    public WebElement iDontWantToUpgradeBtn;


}