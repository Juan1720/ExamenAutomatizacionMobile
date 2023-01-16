package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SwagLabLoginSteps;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.Assertions;
import org.junit.Assert;

public class SwagLabLoginStepsDefs {

    @Steps
    SwagLabLoginSteps swagLabLoginSteps;

    @Dado("que me encuentro en el login de la app SwagLabs")
    public void login(){
          swagLabLoginSteps.login();
    }

    @Cuando("inicio sesión con las credenciales usuario: {string} y contraseña: {string}")
    public void iniciarSesion(String username,String password){
        swagLabLoginSteps.clickLogin(username,password);
    }

    @Entonces("valido que debería aparecer el título de {string}")
    public void validarTitulo(String titulo){
        Assert.assertEquals(swagLabLoginSteps.getTittle(),titulo);
    }

    @Y("también valido que al menos exista un item")
    public void validarItem(){
        int itemsListSize = swagLabLoginSteps.getItemSize();
        Assert.assertTrue("El tamaño de la lista es: " + itemsListSize,itemsListSize > 0);
    }

}
