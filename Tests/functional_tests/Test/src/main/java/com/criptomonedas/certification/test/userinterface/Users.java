package com.criptomonedas.certification.test.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Users extends PageObject {
    public static final Target BTN_AGREGAR_MONEDA = Target.the("botón página usuarios para agregar una moneda nueva").located(By.id("btn-1"));
    public static final Target TASA_CAMBIO = Target.the("casilla tasa cambio").located(By.xpath("/html/body/app-root/app-usuario-form/div[1]/table/tbody/tr[1]/td[3]"));
    public static final Target BTN_EDITAR = Target.the("Seleccionar boton para editar un campo").located(By.xpath("/html/body/app-root/app-usuario-form/div[1]/table/tbody/tr[1]/td[4]/fa-icon[1]"));
    public static final Target EDITAR_SELECT = Target.the("Seleccionar editar").located(By.xpath("/html/body/app-root/app-usuario-form/div[1]/table/tbody/tr[1]/td[2]"));
    public static final Target CAMPO_EDITAR_TASA = Target.the("Escribir taza nueva").located(By.id("recipient-name"));
    public static final Target BTN_ACEPTAR_TASA = Target.the("Aceptar cambio taza nueva").located(By.id("btn-guardar-moneda"));
    public static final Target BTN_ELIMINAR_1=Target.the("Eliminar Bitcoins").located(By.xpath("/html/body/app-root/app-usuario-form/div[1]/table/tbody/tr[3]/td[4]/fa-icon[2]"));
    public static final Target BTN_MONEDA = Target.the("Seleccionar botón para eliminar una moneda").located(By.xpath("//*[@id=\"exampleModalCenter\"]/div/div/div[2]/select"));
    public static final Target BTN_SELECCIONAR_MONEDA = Target.the("Seleccionar botón para desplegar lista de monedas en modal").located(By.xpath("//*[@id=\"exampleModalCenter\"]/div/div/div[2]/select"));
    public static final Target SELECT_MONEDA = Target.the("Seleccionar opcion de moneda para agregar").located(By.xpath("//*[@id=\"exampleModalCenter\"]/div/div/div[2]/select/option[2]"));
    public static final Target BTN_GUARDAR_MODAL = Target.the("Seleccionar opcion de moneda para agregar").located(By.xpath("//*[@id=\"exampleModalCenter\"]/div/div/div[3]/button[1]"));
    public static final Target VALIDATOR = Target.the("comparar el resultado con lo obtenido").located(By.xpath("/html/body/app-root/app-usuario-form/div[1]/table/tbody/tr[3]/td[2]"));
    public static final Target VALIDATOR2= Target.the("questions de eliminar y editar").located(By.xpath("/html/body/app-root/app-usuario-form/div[1]/table/tbody/tr[2]/td[2]"));
}
