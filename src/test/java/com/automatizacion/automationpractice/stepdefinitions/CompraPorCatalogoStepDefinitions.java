package com.automatizacion.automationpractice.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import com.automatizacion.automationpractice.model.FormularioIniciarSesionModel;
import com.automatizacion.automationpractice.model.SolicitarCompraModel;
import com.automatizacion.automationpractice.questions.SolicitarCompraQuestions;
import com.automatizacion.automationpractice.tasks.AbrirModulo;
import com.automatizacion.automationpractice.tasks.AbrirPagina;
import com.automatizacion.automationpractice.tasks.FormularioIniciarSesion.FormularioIniciarSesion;
import com.automatizacion.automationpractice.tasks.Menu.MenuAutomationPractice;
import com.automatizacion.automationpractice.tasks.RealizarCompra.SolicitarCompra;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;


public class CompraPorCatalogoStepDefinitions {

    @Dado("^que el usuario se encuentra en el catalogo de vestidos$")
    public void que_el_usuario_se_encuentra_en_el_catalogo_de_vestidos() {
        FormularioIniciarSesionModel sesionModels = new FormularioIniciarSesionModel();
     theActorCalled("usuario").wasAbleTo(
             AbrirPagina.pagina(),
             AbrirModulo.registroysesion(),
             FormularioIniciarSesion.informacion(sesionModels),
             MenuAutomationPractice.menu("Dresses")

     );
    }


    @Cuando("^selecciona dos vestidos y finaliza su compra$")
    public void selecciona_dos_vestidos_y_finaliza_su_compra() {
        theActorInTheSpotlight().attemptsTo(
                SolicitarCompra.pedido()
        );
    }

    @Entonces("^se valida que la compra fue exitosa$")
    public void se_valida_que_la_compra_fue_exitosa() {
        SolicitarCompraModel mensaje = new SolicitarCompraModel();
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(SolicitarCompraQuestions.validar(mensaje.getValidacioncompra()))
        );
    }


}
