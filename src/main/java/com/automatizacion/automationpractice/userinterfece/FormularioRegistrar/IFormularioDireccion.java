package com.automatizacion.automationpractice.userinterfece.FormularioRegistrar;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IFormularioDireccion {

    public static final Target FIRST_NAME = Target.the("first_name").located(By.id("firstname"));
    public static final Target LAST_NAME = Target.the("last_name").located(By.id("lastname"));
    public static final Target COMPANY = Target.the("company").located(By.id("company"));
    public static final Target ADDRESS = Target.the("address").located(By.id("address1"));
    public static final Target ADDRESS2 = Target.the("address2").located(By.id("address2"));
    public static final Target CITY = Target.the("city").located(By.id("city"));
    public static final Target STATE = Target.the("state").located(By.id("id_state")); // Select
    public static final Target POSTAL_CODE  = Target.the("postal Code").located(By.id("postcode"));
    public static final Target COUNTRY = Target.the("country").located(By.id("id_country")); // Select
    public static final Target ADDITIONAL_INFORMATION = Target.the("additional information").located(By.id("other"));
    public static final Target HOME_PHONE = Target.the("home phone").located(By.id("phone"));
    public static final Target MOBILE_PHONE = Target.the("mobile phone").located(By.id("phone_mobile"));
    public static final Target MAIL_ALIAS = Target.the("mail alias").located(By.id("alias"));
    public static final Target BUTTON = Target.the("boton").located(By.id("submitAccount"));
    public static final Target VALIDATE = Target.the("VALIDACION").located(By.xpath("//p[contains(text(),'Welcome to your account. Here you can manage all o')]"));
}
