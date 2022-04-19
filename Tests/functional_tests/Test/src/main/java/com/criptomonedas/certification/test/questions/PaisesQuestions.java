package com.criptomonedas.certification.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.criptomonedas.certification.test.userinterface.PaisesAndGestoras.TITTLE_PAISES;

public class PaisesQuestions implements Question<Boolean> {
    private String question;

    public PaisesQuestions(String question) {
        this.question = question;
    }

    public static PaisesQuestions toThe(String question) {
        return new PaisesQuestions(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String monedaValidator= Text.of(TITTLE_PAISES).viewedBy(actor).asString();

        if (question.equals(monedaValidator)){
            result = false;
        }else {
            result = true;
        }
        return result;
    }
}
