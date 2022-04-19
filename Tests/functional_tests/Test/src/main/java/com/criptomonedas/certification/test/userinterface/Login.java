package com.criptomonedas.certification.test.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login extends PageObject {
    public static final Target IMPUT_USER = Target.the("Ingresar usuario").located(By.id("login"));
    public static final Target IMPUT_PASSWORD = Target.the("Ingresar password").located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("Seleccionar boton login").located(By.id("sigIn"));
}
