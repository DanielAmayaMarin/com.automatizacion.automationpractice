package com.automatizacion.automationpractice.model;

import com.automatizacion.automationpractice.util.MetodoEspecial;

public class SolicitarCompraModel {

    private String validacioncompra;

    public SolicitarCompraModel() {
        MetodoEspecial.confPropiedades();
        this.validacioncompra = MetodoEspecial.propiedades.getProperty("validacioncompra");
    }

    public String getValidacioncompra() {
        return validacioncompra;
    }
}
