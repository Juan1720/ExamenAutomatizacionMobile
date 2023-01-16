package com.nttdata.screens;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

public class LoginScreen extends PageObject {

    private AndroidDriver<AndroidElement> driver;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement username;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement password;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement btnLogin;
    public void inputUsername(String user){
        username.sendKeys(user);
    }

    public void inputPassword(String pass){
        password.sendKeys(pass);
    }

    public void clickLogin(){
        getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        btnLogin.click();
    }
}
