package com.automatizacion.automationpractice.tasks.FormularioRegistrar;

import com.automatizacion.automationpractice.model.FormularioRegistrarModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.automatizacion.automationpractice.userinterfece.FormularioRegistrar.IFormularioValidarCorreo.*;

public class FormularioValidarCorreo implements Task {

    private FormularioRegistrarModel registrarModel;

    public FormularioValidarCorreo(FormularioRegistrarModel registrarModel) {
        this.registrarModel = registrarModel;
    }

    public static FormularioValidarCorreo correo(FormularioRegistrarModel registrarModel) {
        return Tasks.instrumented(FormularioValidarCorreo.class, registrarModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(registrarModel.getCorreo()).into(EMAIL),
                Click.on(BUTTON_CREATE)

        );
    }
}
