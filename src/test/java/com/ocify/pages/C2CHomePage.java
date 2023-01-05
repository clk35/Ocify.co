package com.ocify.pages;

import com.ocify.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class C2CHomePage {

    public C2CHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@href='https://mustafa.ocify.pro/advs/create_adv'])[1]")
    public WebElement postAdBtn;

    @FindBy(css = "input#search")
    public WebElement searchBox;

    @FindBy(xpath = "//a[@href='https://mustafa.ocify.pro/login']")
    public WebElement signInBtn;

    @FindBy(xpath= "//img[@class='rounded']")
    public WebElement advertisement;

    @FindBy(xpath= "(//h6[@class='mb-1']/a)[1]")
    public WebElement adAfterSearching;

    @FindBy(xpath= "(//div[@class='container p-0'])/li")
    public List<WebElement> categoriesChaining;

    @FindBy(xpath= "//h3[@class='ad-price base-price']/b")
    public WebElement priceText;

    @FindBy(xpath= "//h1[@class='mb-0']")
    public WebElement adTitle;




}
