package co.com.red5g.taks;

import static co.com.red5g.userinterfaces.CompraPage.*;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


import static co.com.red5g.models.builders.ClienteBuilder.con;
import static co.com.red5g.utils.Data.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class Compra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(con().cliente().getNombre()).into(TXT_NOMBRE),
                Enter.theValue(con().cliente().getApellidouno()).into(TXT_PRIMER_APELLIDO),
                Enter.theValue(con().cliente().getApellidodos()).into(TXT_SEGUNDO_APELLIDO),
                Enter.theValue(con().cliente().getDocumento()).into(TXT_NUMERO_DOCUMENTO),
                Enter.theValue(con().cliente().getDireccion()).into(TXT_DIRECCION),
                Enter.theValue(con().cliente().getBarrio()).into(TXT_BARRIO),
                Enter.theValue(con().cliente().getTelefono()).into(TXT_TELEFONO),
                JavaScriptClick.on(CHK_TERMINOS_CONDICIONES),
                JavaScriptClick.on(BTN_PAGAR));
        actor.attemptsTo(
                JavaScriptClick.on(BTN_SELECCIONAR_METODO_PAGO),
                Enter.theValue(con().cliente().getCorreo()).into(TXT_CORREO),
                Enter.theValue(con().cliente().getNombreapellido()).into(TXT_NOMBRE_APELLIDO),
                Enter.theValue(con().cliente().getCelular()).into(TXT_CELULAR),
                JavaScriptClick.on(BTN_CONTINUAR_PAGO),
                Enter.theValue(con().cliente().getCelularnequi()).into(TXT_CELULAR_NEQUI),
                JavaScriptClick.on(CHK_ACEPTAR_TERMINOS),
                JavaScriptClick.on(BTN_PAGAR_PUSH),
                JavaScriptClick.on(BTN_FINALIZAR)


        );
    }

    public static Performable exitosa() {
        return instrumented(Compra.class);
    }


}
