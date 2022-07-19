package co.com.red5g.taks;

import co.com.red5g.userinterfaces.Sesionpage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import java.util.Map;

import static co.com.red5g.userinterfaces.HomePage.*;
import static co.com.red5g.userinterfaces.Sesionpage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Autenticar implements Task {

    Map<String,String> datos;

    public Autenticar(Map<String,String> datos){
        this.datos = datos;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(datos.get("usuario")).into(TXT_USUARIO),
                Enter.theValue(datos.get("contrasena")).into(Sesionpage.TXT_CONTRASENA),
                Click.on(BTN_LOGIN)
        );


    }

    public static Performable usuario(Map<String,String> datos) {
        return instrumented(Autenticar.class, datos);
    }
}
