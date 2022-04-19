package com.criptomonedas.certification.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static com.criptomonedas.certification.test.userinterface.PaisesAndGestoras.*;

public class ListarMonedaPorPaisesDisponible implements Task {

    public static ListarMonedaPorPaisesDisponible listarMoneda(){
        return Tasks.instrumented(ListarMonedaPorPaisesDisponible.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FORM_PAISES)
        );
    }
}
