package com.automatizacion.automationpractice.userinterfece.FormularioRegistrar;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IFormularioPersonal {

    public static final Target TITLE_MR = Target.the("title mr").located(By.id("id_gender1"));
    public static final Target TITLE_MRS = Target.the("title mrs").located(By.id("id_gender2"));
    public static final Target FIRST_NAME = Target.the("first name").located(By.id("customer_firstname"));
    public static final Target LAST_NAME = Target.the("last name").located(By.id("customer_lastname"));
    public static final Target EMAIL_FOR = Target.the("email personal").located(By.id("email"));
    public static final Target PASSWORD = Target.the("password").located(By.id("passwd"));
    public static final Target DAYS = Target.the("days").located(By.id("days"));
    public static final Target MONTHS = Target.the("months").located(By.id("months"));
    public static final Target YEARS = Target.the("years").located(By.id("years"));
    public static final Target NEWS = Target.the("news").located(By.id("newsletter"));
    public static final Target OFFERS = Target.the("offers").located(By.id("optin"));

}
