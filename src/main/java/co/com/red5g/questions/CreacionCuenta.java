package co.com.red5g.questions;

import static co.com.red5g.userinterfaces.HomePage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CreacionCuenta implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return LBL_CREACION.resolveFor(actor).isVisible();
    }

    public static  CreacionCuenta exitosa(){
        return new CreacionCuenta();
    }
}
