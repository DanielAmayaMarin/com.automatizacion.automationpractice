package com.automatizacion.automationpractice.tasks.FormularioRegistrar;

import com.automatizacion.automationpractice.model.FormularioRegistrarModel;
import static com.automatizacion.automationpractice.userinterfece.FormularioRegistrar.IFormularioDireccion.*;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class FormularioDireccion implements Task {

    private FormularioRegistrarModel registrarModel;

    public FormularioDireccion(FormularioRegistrarModel registrarModel) {
        this.registrarModel = registrarModel;
    }

    public static FormularioDireccion informacion(FormularioRegistrarModel registrarModel) {
        return Tasks.instrumented(FormularioDireccion.class, registrarModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(registrarModel.getNombres()).into(FIRST_NAME),
                Enter.theValue(registrarModel.getApellidos()).into(LAST_NAME),
                Enter.theValue(registrarModel.getCompania()).into(COMPANY),
                Enter.theValue(registrarModel.getDireccion()).into(ADDRESS),
                Enter.theValue(registrarModel.getDireccion()).into(ADDRESS2),
                Enter.theValue(registrarModel.getCiudad()).into(CITY),
                SelectFromOptions.byValue(registrarModel.getEstado()).from(STATE),
                Enter.theValue(registrarModel.getCodigoPostal()).into(POSTAL_CODE),
                SelectFromOptions.byVisibleText(registrarModel.getPais()).from(COUNTRY),
                Enter.theValue(registrarModel.getInformacionAdicional()).into(ADDITIONAL_INFORMATION),
                Enter.theValue(registrarModel.getTelefonoCasa()).into(HOME_PHONE),
                Enter.theValue(registrarModel.getTelefonoPersonal()).into(MOBILE_PHONE),
                Enter.theValue(registrarModel.getCorreo()).into(MAIL_ALIAS),
                Click.on(BUTTON)
        );
    }
}
