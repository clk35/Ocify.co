package com.ocify.pages;

import com.ocify.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C2CHomePage {

    public C2CHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@href='https://mustafa.ocify.pro/advs/create_adv'])[1]")
    public WebElement postAdBtn;

    @FindBy(id = "search")
    public WebElement searchBox;

    @FindBy(xpath= "//img[@class='rounded']")
    public WebElement advertisement;







}
