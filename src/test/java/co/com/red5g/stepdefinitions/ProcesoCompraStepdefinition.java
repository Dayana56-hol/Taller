package co.com.red5g.stepdefinitions;
import co.com.red5g.questions.Resultado;
import co.com.red5g.taks.Compra;
import co.com.red5g.taks.Finalizar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class ProcesoCompraStepdefinition {


    @Dado("que un cliente necesita realizar el pago de los productos al finalizar la compra")
    public void queUnClienteNecesitaRealizarElPagoDeLosProductosAlFinalizarLaCompra() {
        OnStage.theActorInTheSpotlight().attemptsTo(Finalizar.compra());
    }

    @Cuando("diligencia los datos personales y forma de pago")
    public void diligenciaLosDatosPersonalesYFormaDePago() {
        OnStage.theActorInTheSpotlight().attemptsTo(Compra.exitosa());

    }

    @Entonces("debe ver detalle de pedido generado")
    public void debeVerDetalleDePedidoGenerado() {
        OnStage.theActorInTheSpotlight().should(seeThat(Resultado.compra()));
    }
}
