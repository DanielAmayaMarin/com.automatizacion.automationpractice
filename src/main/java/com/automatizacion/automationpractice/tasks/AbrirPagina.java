package com.automatizacion.automationpractice.tasks;

import com.automatizacion.automationpractice.userinterfece.UlrPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {

    private UlrPagina ulrPagina;

    public static AbrirPagina pagina() {
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Open.browserOn(ulrPagina)
        );
    }
}
