package com.automatizacion.automationpractice.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.automatizacion.automationpractice.userinterfece.UlrPagina.SIGN_IN;

public class AbrirModulo implements Task {

    public static AbrirModulo registroysesion() {
        return Tasks.instrumented(AbrirModulo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SIGN_IN)
        );
    }
}
