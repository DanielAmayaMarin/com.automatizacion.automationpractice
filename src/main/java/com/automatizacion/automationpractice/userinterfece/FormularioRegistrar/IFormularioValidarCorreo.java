package com.automatizacion.automationpractice.userinterfece.FormularioRegistrar;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IFormularioValidarCorreo {

    public static final Target EMAIL = Target.the("email").located(By.id("email_create"));
    public static final Target BUTTON_CREATE = Target.the("button create").located(By.id("SubmitCreate"));

}
