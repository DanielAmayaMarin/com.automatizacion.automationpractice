package com.automatizacion.automationpractice.model;

import com.automatizacion.automationpractice.util.MetodoEspecial;

public class FormularioIniciarSesionModel {

    public FormularioIniciarSesionModel() {

        MetodoEspecial.confPropiedades();

        this.usuario = MetodoEspecial.propiedades.getProperty("correo");
        this.contrasena = MetodoEspecial.propiedades.getProperty("contrasena");
        this.validacion = MetodoEspecial.propiedades.getProperty("validacion");
    }

    private String usuario;
    private String contrasena;
    private String validacion;

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getValidacion() {
        return validacion;
    }
}
