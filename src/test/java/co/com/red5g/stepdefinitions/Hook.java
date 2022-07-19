package co.com.red5g.stepdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hook {

    //Ejecutara siempre antes de cualquier otro stepdefinition
    //debido a que tiene la etiqueta before

    @Before
    public void prepararActor(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Robot");
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://brykamakeup.com/"));
    }

}
