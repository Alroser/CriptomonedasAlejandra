package com.criptomonedas.certification.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.criptomonedas.certification.test.userinterface.Users.*;

public class agregarMoneda implements Task {

    public static agregarMoneda Addmoneda(){
        return Tasks.instrumented(agregarMoneda.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_AGREGAR_MONEDA),
                Click.on(BTN_SELECCIONAR_MONEDA),
                Click.on(SELECT_MONEDA),
                Click.on(BTN_GUARDAR_MODAL)
                );
    }
}
