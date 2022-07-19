package co.com.red5g.taks;

import static co.com.red5g.userinterfaces.ProductosPage.*;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;



import static net.serenitybdd.screenplay.Tasks.instrumented;


public class CategoriaBrochas implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                JavaScriptClick.on(BTN_CATEGORIA_BROCHAS)

        );

    }

    public static Performable seleccionado(){
        return instrumented(CategoriaBrochas.class);
    }
}
