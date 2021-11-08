package com.automatizacion.automationpractice.util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MetodoEspecial {


    public static Properties propiedades;

    public static void confPropiedades(){
        propiedades = new Properties();
        try {
            propiedades.load(new FileReader("conf.properties"));
            //properties.load(new FileReader("C:\\SQASCREENPLAY\\conf.properties"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
