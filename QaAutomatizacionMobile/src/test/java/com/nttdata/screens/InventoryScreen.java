package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventoryScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement tittle;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Item\"]")
    private List<WebElement> items;
    public String getTittle(){
        return tittle.getText();
    }

    public int getItemSize(){
        return items.size();
    }


}
