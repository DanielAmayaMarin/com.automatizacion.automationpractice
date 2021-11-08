package com.automatizacion.automationpractice.userinterfece.Menu;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IMenu {

    public static final Target DRESSES = Target.the("Dresses").located(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]"));
}
