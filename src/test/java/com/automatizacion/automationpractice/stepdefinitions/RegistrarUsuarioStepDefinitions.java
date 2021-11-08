package com.automatizacion.automationpractice.stepdefinitions;

import com.automatizacion.automationpractice.model.FormularioRegistrarModel;
import com.automatizacion.automationpractice.questions.RegistrarUsuarioQuestions;
import com.automatizacion.automationpractice.tasks.AbrirPagina;
import com.automatizacion.automationpractice.tasks.AbrirModulo;
import com.automatizacion.automationpractice.tasks.FormularioRegistrar.RegistrarFormulario;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class RegistrarUsuarioStepDefinitions {



    @Dado("^que el (.*) no cuenta con usuario ingresa al modulo para registrarse$")
    public void que_el_usuario_no_cuenta_con_usuario_ingresa_al_modulo_para_registrarse(String usuario) {
        theActorCalled(usuario).wasAbleTo(
                AbrirPagina.pagina(),
                AbrirModulo.registroysesion()
        );
    }


    @Cuando("^ingresar todos los datos y envia su solicitud$")
    public void ingresar_todos_los_datos_y_envia_su_solicitud() {
        FormularioRegistrarModel registrarModels = new FormularioRegistrarModel();

        theActorInTheSpotlight().attemptsTo(
                RegistrarFormulario.informacion(registrarModels)
        );

    }

    @Entonces("^se valida si el registro fue exitoso$")
    public void se_valida_si_el_registro_fue_exitoso() {
        FormularioRegistrarModel registrarModels = new FormularioRegistrarModel();
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(RegistrarUsuarioQuestions.validacion(registrarModels.getValidacion()))
        );
    }

}
