package com.adesso.pages;

import com.adesso.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    @FindBy(xpath = "(//span[@class='adesso-claim'])[1]")
    public WebElement adussoLogo;

    @FindBy (id = "adesso-main-navigation")
    public List<WebElement> navigatorElements;

    @FindBy(id="language")
    public List<WebElement> languages;

    @FindBy(xpath = "(//a[@data-toggle='modal'])[1]")
    public WebElement entdecken;

    @FindBy(xpath = "//ul[@id='accordion']/li")
    public List<WebElement> adessoEntdecken;

    @FindBy(xpath = "//span[.='Branchen']")
    public WebElement branchen;

//    @FindBy (xpath = "(//a[@class='selected'])[1]")
//    public WebElement automobil;

    @FindBy(xpath = "(//ul[@id='level-232936']//a)[1]")
    public WebElement automobil;






    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


}
