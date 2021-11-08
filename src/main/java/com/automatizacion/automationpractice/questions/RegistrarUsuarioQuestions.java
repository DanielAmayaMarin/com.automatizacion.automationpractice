package com.automatizacion.automationpractice.questions;

import static com.automatizacion.automationpractice.userinterfece.FormularioRegistrar.IFormularioDireccion.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class RegistrarUsuarioQuestions implements Question<Boolean> {

private String question;

    public RegistrarUsuarioQuestions(String question) {
        this.question = question;
    }

    public static RegistrarUsuarioQuestions validacion(String question){
        return new RegistrarUsuarioQuestions(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String title = Text.of(VALIDATE).viewedBy(actor).asString();
        return question.equals(title);
    }
}
