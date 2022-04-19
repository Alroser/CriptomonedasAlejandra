package com.criptomonedas.certification.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.criptomonedas.certification.test.userinterface.Users.*;

public class DeleteQuestions implements Question<Boolean> {

    private String question;

    public DeleteQuestions(String question) {
        this.question = question;
    }

    public static DeleteQuestions toThe(String question) {
        return new DeleteQuestions(question);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String monedaValidator= Text.of(VALIDATOR2).viewedBy(actor).asString();

        if (question.equals(monedaValidator)){
            result = false;
        }else {
            result = true;
        }
        return result;
    }
}
