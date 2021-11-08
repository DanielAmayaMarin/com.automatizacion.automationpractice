package com.automatizacion.automationpractice.tasks.FormularioRegistrar;

import com.automatizacion.automationpractice.model.FormularioRegistrarModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class RegistrarFormulario implements Task {

    private FormularioRegistrarModel registrarModel;

    public RegistrarFormulario(FormularioRegistrarModel registrarModel) {
        this.registrarModel = registrarModel;
    }

    public static RegistrarFormulario informacion(FormularioRegistrarModel formularioRegistrarModel) {
        return Tasks.instrumented(RegistrarFormulario.class, formularioRegistrarModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
               FormularioValidarCorreo.correo(registrarModel),
                FormularioPersonal.informacion(registrarModel),
                FormularioDireccion.informacion(registrarModel)
        );
    }
}
