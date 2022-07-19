package co.com.red5g.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.red5g.userinterfaces.HomePage.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Cerrar implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(BTN_CERRAR)

        );

    }

    public static Performable sesion(){
        return instrumented(Cerrar.class);

    }


}
