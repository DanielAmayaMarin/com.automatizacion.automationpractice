package com.automatizacion.automationpractice.tasks.FormularioRegistrar;


import com.automatizacion.automationpractice.model.FormularioRegistrarModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;

import static com.automatizacion.automationpractice.userinterfece.FormularioRegistrar.IFormularioPersonal.*;

public class FormularioPersonal implements Task {

    private FormularioRegistrarModel registrarModel;

    public FormularioPersonal(FormularioRegistrarModel registrarModel) {
        this.registrarModel = registrarModel;
    }

    public static FormularioPersonal informacion(FormularioRegistrarModel registrarModel) {
        return Tasks.instrumented(FormularioPersonal.class, registrarModel);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        if (registrarModel.getTipo().equals("MR")){
            actor.attemptsTo(
                    Click.on(TITLE_MR)
            );
        }else {
            actor.attemptsTo(
                    Click.on(TITLE_MRS)
            );
        }
        actor.attemptsTo(

                Enter.theValue(registrarModel.getNombres()).into(FIRST_NAME),
                Enter.theValue(registrarModel.getApellidos()).into(LAST_NAME),
                Enter.theValue(registrarModel.getCorreo()).into(EMAIL_FOR),
                Enter.theValue(registrarModel.getContrasena()).into(PASSWORD),
                SelectFromOptions.byValue(registrarModel.getDia()).from(DAYS),
                SelectFromOptions.byValue(registrarModel.getMes()).from(MONTHS),
                SelectFromOptions.byValue(registrarModel.getAno()).from(YEARS),
                Check.whether(registrarModel.isNoticias()).andIfSo(Click.on(NEWS)),
                Check.whether(registrarModel.isOfertas()).andIfSo(Click.on(OFFERS))

        );
    }
}
