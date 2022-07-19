package co.com.red5g.taks;

import static co.com.red5g.userinterfaces.ProductosPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CategoriaPestanas implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                JavaScriptClick.on(BTN_CATEGORIA_PESTANAS),
                Ordenar.productos(),
                JavaScriptClick.on(LBL_PRODUCTO_PESTANA_UNO),
                JavaScriptClick.on(BTN_ANADIR_CARRITO),
                JavaScriptClick.on(BTN_CATEGORIA_PESTANAS),
                Ordenar.productos(),
                JavaScriptClick.on(LBL_PRODUCTO_PESTANA_DOS),
                JavaScriptClick.on(BTN_ANADIR_CARRITO),
                JavaScriptClick.on(BTN_VER_CARRITO)




        );
    }
    public static Performable seleccionado(){
        return instrumented(CategoriaPestanas.class);
    }
}
