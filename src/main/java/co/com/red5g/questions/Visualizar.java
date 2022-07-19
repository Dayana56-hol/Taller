package co.com.red5g.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.red5g.userinterfaces.ProductosPage.*;



public class Visualizar implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return LBL_VISUALIZAR_PRODUCTOS_CARRITO.resolveFor(actor).isVisible();
    }

    public static Visualizar carrito(){
        return new Visualizar();
    }
}
