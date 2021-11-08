package com.automatizacion.automationpractice.model;


import com.automatizacion.automationpractice.util.MetodoEspecial;

public class FormularioRegistrarModel {

    private String correo;
    private String tipo;
    private String nombres;
    private String apellidos;
    private String contrasena;
    private String dia;
    private String mes;
    private String ano;
    private boolean noticias;
    private boolean ofertas;
    private String compania;
    private String direccion;
    private String ciudad;
    private String estado;
    private String codigoPostal;
    private String pais;
    private String informacionAdicional;
    private String telefonoCasa;
    private String telefonoPersonal;
    private String validacion;

    public FormularioRegistrarModel() {

        MetodoEspecial.confPropiedades();

        this.correo = MetodoEspecial.propiedades.getProperty("correo");
        this.tipo = MetodoEspecial.propiedades.getProperty("tipo");
        this.nombres = MetodoEspecial.propiedades.getProperty("nombres");
        this.apellidos = MetodoEspecial.propiedades.getProperty("apellidos");
        this.contrasena = MetodoEspecial.propiedades.getProperty("contrasena");
        this.dia = MetodoEspecial.propiedades.getProperty("dia");
        this.mes = MetodoEspecial.propiedades.getProperty("mes");
        this.ano = MetodoEspecial.propiedades.getProperty("ano");
        this.noticias = Boolean.parseBoolean(MetodoEspecial.propiedades.getProperty("noticias"));
        this.ofertas = Boolean.parseBoolean(MetodoEspecial.propiedades.getProperty("ofertas"));
        this.compania = MetodoEspecial.propiedades.getProperty("compania");
        this.direccion = MetodoEspecial.propiedades.getProperty("direccion");
        this.ciudad = MetodoEspecial.propiedades.getProperty("ciudad");
        this.estado = MetodoEspecial.propiedades.getProperty("estado");
        this.codigoPostal = MetodoEspecial.propiedades.getProperty("codigoPostal");
        this.pais = MetodoEspecial.propiedades.getProperty("pais");
        this.informacionAdicional = MetodoEspecial.propiedades.getProperty("informacionAdicional");
        this.telefonoCasa = MetodoEspecial.propiedades.getProperty("telefonoCasa");
        this.telefonoPersonal = MetodoEspecial.propiedades.getProperty("telefonoPersonal");
        this.validacion = MetodoEspecial.propiedades.getProperty("validacion");
    }

    public String getCorreo() {
        return correo;
    }


    public String getTipo() {
        return tipo;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public String getAno() {
        return ano;
    }

    public boolean isNoticias() {return noticias;}

    public boolean isOfertas() {
        return ofertas;
    }

    public String getCompania() {return compania;}

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public String getCodigoPostal() {return codigoPostal;}

    public String getPais() {
        return pais;
    }

    public String getInformacionAdicional() {
        return informacionAdicional;
    }

    public String getTelefonoCasa() {
        return telefonoCasa;
    }

    public String getTelefonoPersonal() {
        return telefonoPersonal;
    }

    public String getValidacion() {return validacion;}
}