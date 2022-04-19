package com.criptomonedas.certification.test.tasks;

import com.criptomonedas.certification.test.userinterface.Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;



public class OpenUp implements Task {

    private Page page;

    public static OpenUp thePage() {

        return Tasks.instrumented(OpenUp.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
    }
}
