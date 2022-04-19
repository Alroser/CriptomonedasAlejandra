package com.criptomonedas.certification.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.criptomonedas.certification.test.userinterface.PaisesAndGestoras.*;

public class ListarMonedaPorGestoraDisponible implements Task {

        public static ListarMonedaPorGestoraDisponible listarMoneda(){
            return Tasks.instrumented(ListarMonedaPorGestoraDisponible.class);
        }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FORM_GESTORA)
        );
    }
}
