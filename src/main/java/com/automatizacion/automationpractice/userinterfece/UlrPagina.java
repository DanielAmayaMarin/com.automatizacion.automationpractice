package com.automatizacion.automationpractice.userinterfece;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("http://automationpractice.com/")
public class UlrPagina extends PageObject {
    public static final Target SIGN_IN = Target.the("Sign in").located(By.xpath("//a[contains(text(),'Sign in')]"));
}
