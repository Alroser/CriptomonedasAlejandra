package com.criptomonedas.certification.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaisesAndGestoras {
    public static final Target FORM_PAISES = Target.the("Formulario de pais").located(By.id("pais-form"));
    public static final Target FORM_GESTORA = Target.the("Fomrulario de gestora").located(By.id("gestora-form"));
    public static final Target TITTLE_PAISES= Target.the("Comparador para el questions pais").located(By.xpath("/html/body/app-root/app-pais-form/div/h5"));
    public static final Target TITTLE_GESTORA= Target.the("Comparador para el questions gestora").located(By.xpath("/html/body/app-root/app-gestora-form/div/h5"));
}
