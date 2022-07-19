package co.com.red5g.stepdefinitions;

import co.com.red5g.questions.CreacionCuenta;
import co.com.red5g.questions.Logueo;
import co.com.red5g.taks.Autenticar;
import co.com.red5g.taks.Ingresar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class InicioSesionStepdefinition {


    @Dado("que un cliente necesita iniciar sesion")
    public void queUnClienteNecesitaIniciarSesion() {

        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.aOpcion());

    }

    @Cuando("registra diligencia sus datos")
    public void registraDiligenciaSusDatos(Map<String,String> datos) {

        OnStage.theActorInTheSpotlight().attemptsTo(Autenticar.usuario(datos));

    }

    @Entonces("deberia quedar logueado en la pagina")
    public void deberiaQuedarLogueadoEnLaPagina() {
        OnStage.theActorInTheSpotlight().should(seeThat(Logueo.exitoso()));
    }
}
