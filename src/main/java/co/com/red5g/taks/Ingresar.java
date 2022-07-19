package co.com.red5g.taks;

import static co.com.red5g.userinterfaces.HomePage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Ingresar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(BTN_CUENTA)

        );



    }

    public static Performable aOpcion(){
        return instrumented(Ingresar.class);
    }


}
