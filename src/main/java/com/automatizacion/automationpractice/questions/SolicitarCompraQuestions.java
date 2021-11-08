package com.automatizacion.automationpractice.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.automatizacion.automationpractice.userinterfece.RealizarCompra.IRealizarCompra.VALIDATE;

public class SolicitarCompraQuestions implements Question<Boolean> {

    private String question;

    public SolicitarCompraQuestions(String question) {
        this.question = question;
    }

    public static SolicitarCompraQuestions validar(String question) {
        return new SolicitarCompraQuestions(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String mensaje = Text.of(VALIDATE).viewedBy(actor).asString();
        return question.equals(mensaje);
    }
}
