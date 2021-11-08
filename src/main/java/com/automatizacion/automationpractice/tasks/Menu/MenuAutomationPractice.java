package com.automatizacion.automationpractice.tasks.Menu;

import static com.automatizacion.automationpractice.userinterfece.Menu.IMenu.*;

import com.automatizacion.automationpractice.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;



public class MenuAutomationPractice implements Task {


    private String menu;

    public MenuAutomationPractice(String menu) {
        this.menu = menu;
    }

    public static MenuAutomationPractice menu(String menu) {
        return new MenuAutomationPractice(menu);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        System.out.println(menu);
       if (menu.equals("Dresses")){
           actor.attemptsTo(
                   Click.on(DRESSES),
                   Esperar.milisegundos(100)
           );
       }

    }





}
