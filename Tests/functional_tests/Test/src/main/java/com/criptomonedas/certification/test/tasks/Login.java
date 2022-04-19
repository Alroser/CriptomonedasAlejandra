package com.criptomonedas.certification.test.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static com.criptomonedas.certification.test.userinterface.Login.*;

public class Login implements Task {

    private String srtUSer;
    private String srtPassword;

    public Login(String srtUSer, String srtPassword) {
        this.srtUSer = srtUSer;
        this.srtPassword = srtPassword;
    }
    public static Login onThePage(String strUser, String strPassword) {
        return Tasks.instrumented(Login.class,strUser,strPassword);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(srtUSer).into(IMPUT_USER),
                Enter.theValue(srtPassword).into(IMPUT_PASSWORD),
                JavaScriptClick.on(ENTER_BUTTON)
        );

    }
}
