package com.automatizacion.automationpractice.stepdefinitions;

import com.automatizacion.automationpractice.model.FormularioIniciarSesionModel;
import com.automatizacion.automationpractice.questions.IniciarSesionQuestions;
import com.automatizacion.automationpractice.tasks.AbrirModulo;
import com.automatizacion.automationpractice.tasks.AbrirPagina;
import com.automatizacion.automationpractice.tasks.FormularioIniciarSesion.FormularioIniciarSesion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IniciarSesionStepDefinitions {

    @Dado("^que el (.*) se encuentra en el modulo para iniciar sesion$")
    public void que_el_usuario_se_encuentra_en_el_modulo_para_iniciar_sesion(String usuario) {
        theActorCalled(usuario).wasAbleTo(
                AbrirPagina.pagina(),
                AbrirModulo.registroysesion()
        );


    }

    @Cuando("^ingresar su usuario y contrasena y envia la solicitud$")
    public void ingresar_su_usuario_y_contrasena_y_envia_la_solicitud() {
        FormularioIniciarSesionModel sesionModel = new FormularioIniciarSesionModel();
        theActorInTheSpotlight().attemptsTo(
                FormularioIniciarSesion.informacion(sesionModel)
        );
    }

    @Entonces("^se valida que el inicio fue exitoso$")
    public void se_valida_que_el_inicio_fue_exitoso() {
        FormularioIniciarSesionModel sesionModel = new FormularioIniciarSesionModel();
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(IniciarSesionQuestions.validacion(sesionModel.getValidacion()))
        );
    }

}
