package com.criptomonedas.certification.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static com.criptomonedas.certification.test.userinterface.PaisesAndGestoras.*;

public class GestoraQuestions implements Question<Boolean> {
    private String question;

    public GestoraQuestions(String question) {
        this.question = question;
    }

    public static GestoraQuestions toThe(String question) {
        return new GestoraQuestions(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String monedaValidator= Text.of(TITTLE_GESTORA).viewedBy(actor).asString();

        if (question.equals(monedaValidator)){
            result = false;
        }else {
            result = true;
        }
        return result;
    }
}
