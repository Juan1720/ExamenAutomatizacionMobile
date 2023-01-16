package com.nttdata.steps;

import com.nttdata.screens.InventoryScreen;
import com.nttdata.screens.LoginScreen;
import net.thucydides.core.annotations.Step;

public class SwagLabLoginSteps {

    LoginScreen loginScreen;
    InventoryScreen inventoryScreen;

    @Step("login")
    public void login(){
        loginScreen.getDriver();
    }

    @Step("click en el login para iniciar sesion por username{0} password{0}")
    public void clickLogin(String username,String password){
        loginScreen.inputUsername(username);
        loginScreen.inputPassword(password);
        loginScreen.clickLogin();
    }

    @Step("Obtine el texto del titulo")
    public String getTittle(){
        return inventoryScreen.getTittle();
    }

    @Step("Obtengo al menos un items")
    public int getItemSize(){
        return inventoryScreen.getItemSize();
    }
}
