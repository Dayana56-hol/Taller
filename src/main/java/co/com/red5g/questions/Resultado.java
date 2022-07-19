package co.com.red5g.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.red5g.userinterfaces.CompraPage.*;

public class Resultado implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return LBL_DETALLE_PEDIDO.resolveFor(actor).isVisible();
    }

    public static  Resultado compra(){
        return new Resultado();
    }
}
