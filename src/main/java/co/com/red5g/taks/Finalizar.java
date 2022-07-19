package co.com.red5g.taks;

import static co.com.red5g.userinterfaces.CompraPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Finalizar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(BTN_FINALIZAR_COMPRA)

        );
    }

    public static Performable compra(){
        return instrumented(Finalizar.class);

    }

}
