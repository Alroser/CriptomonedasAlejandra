package com.criptomonedas.certification.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.criptomonedas.certification.test.userinterface.Users.*;

public class AgregarMonedaQuestions implements Question<Boolean> {
    private String question;

    public AgregarMonedaQuestions(String question) {
        this.question = question;
    }

    public static AgregarMonedaQuestions toThe(String question) {
        return new AgregarMonedaQuestions(question);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String monedaValidator= Text.of(VALIDATOR).viewedBy(actor).asString();

        if (question.equals(monedaValidator)){
            result = false;
        }else {
            result = true;
        }
        return result;
    }
}
