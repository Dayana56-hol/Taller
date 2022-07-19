package co.com.red5g.taks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import static co.com.red5g.userinterfaces.ProductosPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Seleccionar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                JavaScriptClick.on(LBL_PRODUCTO_BROCHA_UNO),
                JavaScriptClick.on(BTN_ANADIR_CARRITO),
                JavaScriptClick.on(BTN_CATEGORIA_BROCHAS),
                Ordenar.productos(),
                JavaScriptClick.on(LBL_PRODUCTO_BROCHA_DOS),
                JavaScriptClick.on(BTN_ANADIR_CARRITO)


        );
    }

    public static Performable productos(){
        return instrumented(Seleccionar.class);
    }
}
