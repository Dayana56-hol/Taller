package co.com.red5g.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.red5g.userinterfaces.Sesionpage.*;

public class Logueo implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return LBL_LOGUEO_EXITOSO.resolveFor(actor).isVisible();
    }

    public static Logueo exitoso(){
        return new Logueo();
    }
}
