package com.adesso.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Automobil extends BasePage {

    @FindBy(css = "div.adesso-icon-tabs.adesso-center>div")
    public List<WebElement> automobilTabList;
}
