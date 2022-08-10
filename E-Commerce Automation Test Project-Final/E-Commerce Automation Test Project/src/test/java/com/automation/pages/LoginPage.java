package com.automation.pages;

import jdk.nashorn.internal.AssertsEnabled;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static jdk.nashorn.internal.objects.NativeFunction.function;

public class LoginPage {

public WebDriver driver ;
    //2
    private By go = By.cssSelector("a[href=\"/login?returnUrl=%2F\"]");
    private By email = By.id("Email");
    private By password = By.id("Password");
    private By loginButton = By.className("login-button");
    private By checkLogin = By.cssSelector("a[href=\"/logout\"]");

    private By Facebook = By.className("facebook");

    private By Twitter = By.className("twitter");

    //1
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    //3
    public void go(){
        driver.findElement(go).click();
    }

    public void usernamePassword(String e,String pass){
        driver.findElement(email).sendKeys(e);
        driver.findElement(password).sendKeys(pass);
    }
    public void loginbtn (){

        driver.findElement(loginButton).sendKeys(Keys.ENTER);
    }
    public boolean loginSuccess(){

        return driver.findElement(checkLogin).isDisplayed();
    }

    public void followUs (String locator){
        driver.findElement(By.className(locator)).click();
    }

    public List<String> getHandlesList(){
        Set<String> handlesSet = driver.getWindowHandles();
        List<String> handlesList = new ArrayList<String>(handlesSet);
        return handlesList;
    }
    public void navigatedSuccssfully (){
        List<String> hlList=getHandlesList();
        driver.switchTo().window(hlList.get(1));
    }
    public String getCurrentURL (){
        List<String> hlList=getHandlesList();
        String test = driver.getCurrentUrl();
        driver.close();
        driver.switchTo().window(hlList.get(0));
        return test;
    }


}
