package com.automatizacion.automationpractice.userinterfece.FormularioIniciarSesion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IFormularioIniciarSesion {

    public static final Target EMAIL = Target.the("email").located(By.id("email"));
    public static final Target PASSWORD = Target.the("passwd").located(By.id("passwd"));
    public static final Target SUDMITLOGIN = Target.the("SubmitLogin").located(By.id("SubmitLogin"));
    public static final Target VALIDATE = Target.the("VALIDACION").located(By.xpath("//p[contains(text(),'Welcome to your account. Here you can manage all o')]"));


}
