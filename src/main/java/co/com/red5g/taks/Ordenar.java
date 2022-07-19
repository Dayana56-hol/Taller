package co.com.red5g.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import static co.com.red5g.userinterfaces.ProductosPage.*;


import static co.com.red5g.utils.Data.SLT_ORDENAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Ordenar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                SelectFromOptions.byVisibleText(SLT_ORDENAR).from(SLT_ORDENAR_POR_PRECIO)

        );

    }

    public static Performable productos(){
        return instrumented(Ordenar.class);
    }
}
