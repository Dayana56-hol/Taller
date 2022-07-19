package co.com.red5g.stepdefinitions;

import co.com.red5g.questions.CreacionCuenta;
import co.com.red5g.taks.Cerrar;
import co.com.red5g.taks.Diligenciamiento;
import co.com.red5g.taks.Ingresar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CreacionCuentaStepdefinition {

    @Dado("que un cliente necesita crear una cuenta")
    public void queUnClienteNecesitaCrearUnaCuenta() {

        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.aOpcion());

    }

    @Cuando("registra los datos solicitados en la pagina")
    public void registraLosDatosSolicitadosEnLaPagina(Map<String,String> datos) {

        OnStage.theActorInTheSpotlight().attemptsTo(Diligenciamiento.datos(datos));
        
    }

    @Entonces("deberia quedar logueado")
    public void deberiaQuedarLogueado() {

        OnStage.theActorInTheSpotlight().should(seeThat(CreacionCuenta.exitosa()));
    }

    @Y("poder cerrar sesion")
    public void poderCerrarSesion() {
        OnStage.theActorInTheSpotlight().attemptsTo(Cerrar.sesion());
    }
}
