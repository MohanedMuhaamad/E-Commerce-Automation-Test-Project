package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Currencies {

    public WebDriver driver ;
    public Currencies(WebDriver driver) {
        this.driver = driver;
    }

    private By go=  By.xpath("//div[@class=\"currency-selector\"]");
    public void go() {
         driver.findElement(go).click();
    }

    private By change=  By.xpath("//select [@id=\"customerCurrency\"]");
    public WebElement change() {
       return driver.findElement(change);
    }

    private By newcurrency = By.className("prices");


    public String changedCurrency(){
        String currency = driver.findElement(newcurrency).getText();
        return currency;

    }
}
