package co.com.red5g.stepdefinitions;


import co.com.red5g.questions.Visualizar;
import co.com.red5g.taks.CategoriaBrochas;
import co.com.red5g.taks.CategoriaPestanas;
import co.com.red5g.taks.Ordenar;
import co.com.red5g.taks.Seleccionar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actions.ClickOnTarget;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AnadirCarritoStepdefinition {

    @Dado("que un cliente ingresa a la categoria de brochas")
    public void queUnClienteIngresaALaCategoriaDeBrochas() {

        OnStage.theActorInTheSpotlight().attemptsTo(CategoriaBrochas.seleccionado());
    }


    @Y("ordena los productos de menor a mayor precio")
    public void ordenaLosProductosDeMenorAMayorPrecio() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ordenar.productos());
    }


    @Cuando("Selecciona dos productos de brochas")
    public void seleccionaDosProductosDeBrochas() {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.productos());

    }

    @Y("dos productos de pestanas ordenandolos de menor a mayor precio de igual forma")
    public void dosProductosDePestanasOrdenandolosDeMenorAMayorPrecioDeIgualForma() {
        OnStage.theActorInTheSpotlight().attemptsTo(CategoriaPestanas.seleccionado());

    }

    @Entonces("deberia ver los productos agregados en el carrito")
    public void deberiaVerLosProductosAgregadosEnElCarrito() {
        OnStage.theActorInTheSpotlight().should(seeThat(Visualizar.carrito()));

    }
}
