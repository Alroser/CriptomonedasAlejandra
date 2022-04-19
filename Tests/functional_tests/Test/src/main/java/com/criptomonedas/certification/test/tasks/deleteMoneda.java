package com.criptomonedas.certification.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static com.criptomonedas.certification.test.userinterface.Users.*;

public class deleteMoneda implements Task {

    public static deleteMoneda DeleteMoneda(){
        return Tasks.instrumented(deleteMoneda.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(EDITAR_SELECT),
                Click.on(BTN_EDITAR),
                Click.on(CAMPO_EDITAR_TASA),
                Enter.theValue("345,5").into(CAMPO_EDITAR_TASA),
                Click.on(BTN_ACEPTAR_TASA),
                Click.on(BTN_ELIMINAR_1)
        );
    }
}
