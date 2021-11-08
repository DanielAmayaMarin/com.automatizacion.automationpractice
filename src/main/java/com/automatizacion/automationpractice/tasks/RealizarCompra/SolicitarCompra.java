package com.automatizacion.automationpractice.tasks.RealizarCompra;


import static com.automatizacion.automationpractice.userinterfece.RealizarCompra.IRealizarCompra.*;

import com.automatizacion.automationpractice.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;


public class SolicitarCompra implements Task {

    public static SolicitarCompra pedido() {
        return Tasks.instrumented(SolicitarCompra.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(PRINTEDDRESS),
                Click.on(MORE),
                Click.on(ADDTOCART),
                Click.on(PROCEEDTOCHECKOUT),
                Click.on(PROCEEDTOCHECKOUT2),
                Click.on(PROCESSADDRESS),
                Check.whether(true).andIfSo(Click.on(CGV)),
                Click.on(PROCESSCARRIER),
                Click.on(BANKWIRE),
                Click.on(CONFIRM),
                Esperar.milisegundos(500)
        );
    }
}
