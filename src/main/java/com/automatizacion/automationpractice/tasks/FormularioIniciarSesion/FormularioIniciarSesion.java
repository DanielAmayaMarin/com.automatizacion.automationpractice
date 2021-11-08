package com.automatizacion.automationpractice.tasks.FormularioIniciarSesion;

import com.automatizacion.automationpractice.interactions.Esperar;
import com.automatizacion.automationpractice.model.FormularioIniciarSesionModel;
import static com.automatizacion.automationpractice.userinterfece.FormularioIniciarSesion.IFormularioIniciarSesion.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FormularioIniciarSesion implements Task {

    private FormularioIniciarSesionModel SesionModel;

    public FormularioIniciarSesion(FormularioIniciarSesionModel sesionModel) {
        SesionModel = sesionModel;
    }

    public static FormularioIniciarSesion informacion(FormularioIniciarSesionModel IniciarSesionModel) {
        return Tasks.instrumented(FormularioIniciarSesion.class, IniciarSesionModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(SesionModel.getUsuario()).into(EMAIL),
                Enter.theValue(SesionModel.getContrasena()).into(PASSWORD),
                Click.on(SUDMITLOGIN),
                Esperar.milisegundos(1000)
        );
    }
}
