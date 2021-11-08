package com.automatizacion.automationpractice.questions;

import static com.automatizacion.automationpractice.userinterfece.FormularioIniciarSesion.IFormularioIniciarSesion.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class IniciarSesionQuestions implements Question<Boolean> {

    private String question;

    public IniciarSesionQuestions(String question) {
        this.question = question;
    }

    public static IniciarSesionQuestions validacion(String question) {
        return new IniciarSesionQuestions(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String title = Text.of(VALIDATE).viewedBy(actor).asString();
        return question.equals(title);
    }
}
