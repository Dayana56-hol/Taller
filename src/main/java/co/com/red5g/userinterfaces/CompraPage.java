package co.com.red5g.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompraPage {

    //FINALIZAR COMPRA
    public static final Target BTN_FINALIZAR_COMPRA = Target.the("Boton de finalizar compra").located(By.xpath("//a[@class='checkout-button button alt wc-forward']"));

    //DILIGENCIAMIENTO DE DATOS
    public static final Target  TXT_NOMBRE = Target.the("Campo nombre").located(By.id("billing_first_name"));
    public static final Target  TXT_PRIMER_APELLIDO = Target.the("Campo primer apellido").located(By.id("billing_last_name"));
    public static final Target TXT_SEGUNDO_APELLIDO = Target.the("Campo segundo apellido").located(By.id("billing_segundoapellido"));
    public static final Target  TXT_NUMERO_DOCUMENTO= Target.the("Campo numero de documento").located(By.id("billing_id"));
    public static final Target TXT_DIRECCION = Target.the("Campo direccion").located(By.id("billing_address_1"));
    public static final Target SLT_REGION_LOCATOR = Target.the("Seleccionar region").located(By.id("select2-billing_state-container"));
    public static final Target SLT_LOCATOR_DOS = Target.the("Seleccionar region dos").locatedBy("//input[@class='select2-search__field']");
    public static final Target TXT_BARRIO = Target.the("Campo barrio").located(By.id("billing_barrio"));
    public static final Target TXT_TELEFONO = Target.the("Campo telefono").located(By.id("billing_phone"));
    public static final Target  CHK_TERMINOS_CONDICIONES = Target.the("Check de terminos y condiciones").located(By.id("terms"));

    //BOTON DE PAGO
    public static final Target  BTN_PAGAR= Target.the("Boton de pagar").located(By.id("place_order"));

    //SELECCIONAR METODO DE PAGO E INFORMACION DE ESTE
    public static final Target  BTN_SELECCIONAR_METODO_PAGO = Target.the("Seleccionar metodo de pago").locatedBy("//div[text()='Usa tu cuenta Nequi']");

    public static final Target  TXT_CORREO = Target.the("Campo de correo").located(By.id("email"));
    public static final Target  TXT_NOMBRE_APELLIDO = Target.the("Campo de nombre y apellido").located(By.id("fullName"));
    public static final Target  TXT_CELULAR = Target.the("Campo de celular").located(By.id("number"));

    //BOTON CONTINUAR PAGO
    public static final Target  BTN_CONTINUAR_PAGO = Target.the("Boton de continuar pago").locatedBy("//button[text()='Continuar al pago']");

    //NOTIFICACION PUSH
    public static final Target  TXT_CELULAR_NEQUI = Target.the("Campo celular nequi").located(By.id("mobilePhone"));
    public static final Target  CHK_ACEPTAR_TERMINOS = Target.the("Check de aceptar terminos").located(By.id("acceptance"));
    public static final Target  BTN_PAGAR_PUSH = Target.the("Boton de pago por nequi").locatedBy("//span[text()='Pagar']");

    //FINALIZACION
    public static final Target  BTN_FINALIZAR = Target.the("Boton de finalizar transaccion de pago").locatedBy("//button[text()='Finalizar']");
    public static final Target  LBL_DETALLE_PEDIDO = Target.the("Detalle de pedido").locatedBy("//h2[text()='Detalles del pedido']");







}
