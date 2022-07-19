package co.com.red5g.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static co.com.red5g.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Diligenciamiento implements Task {

    Map<String,String> datos;

    public Diligenciamiento(Map<String,String> datos){
        this.datos = datos;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(datos.get("correo")).into(TXT_CORREO),
                Enter.theValue(datos.get("contrasena")).into(TXT_CONTRASENA),
                Click.on(BTN_REGISTRARSE)

        );

    }

     public static Performable datos(Map<String,String> datos){
        return instrumented(Diligenciamiento.class, datos);
    }
}
