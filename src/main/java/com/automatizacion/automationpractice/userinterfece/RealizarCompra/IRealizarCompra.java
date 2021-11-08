package com.automatizacion.automationpractice.userinterfece.RealizarCompra;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IRealizarCompra {

    public static final Target PRINTEDDRESS = Target.the("PrintedDress").located(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]"));
    public static final Target MORE = Target.the("PrintedDress").located(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[2]"));
    public static final Target ADDTOCART = Target.the("ADDTOCART").located(By.name("Submit"));
    public static final Target PROCEEDTOCHECKOUT = Target.the("PROCEEDTOCHECKOUT").located(By.xpath("//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]"));
    public static final Target PROCEEDTOCHECKOUT2 = Target.the("PROCEEDTOCHECKOUT").located(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]"));
    public static final Target PROCESSADDRESS = Target.the("processAddress").located(By.name("processAddress"));
    public static final Target CGV = Target.the("cgv").located(By.id("cgv"));
    public static final Target PROCESSCARRIER = Target.the("processCarrier").located(By.name("processCarrier"));
    public static final Target BANKWIRE = Target.the("bankwire").located(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]/a[1]"));
    public static final Target CONFIRM = Target.the("confirm").located(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]"));
    public static final Target VALIDATE = Target.the("validar").located(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/p[1]"));




}
