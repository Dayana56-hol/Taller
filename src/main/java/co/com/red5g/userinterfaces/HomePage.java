package co.com.red5g.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target BTN_CUENTA = Target.the("Opcion de cuenta").located(By.xpath("//div[@class='elementor-element elementor-element-85dd6a5 elementor-widget__width-initial elementor-view-default elementor-widget elementor-widget-icon']//child::div[@class='elementor-widget-container']"));

    public static final Target TXT_CORREO = Target.the("Campo correo").located(By.id("reg_email"));

    public static final Target TXT_CONTRASENA = Target.the("Campo contrasena").located(By.id("reg_password"));

    public static final Target BTN_REGISTRARSE = Target.the("Boton de registro").located(By.name("register"));


    public static final Target LBL_CREACION = Target.the("Creacion exitosa").located(By.xpath("//div[@class='woocommerce-MyAccount-content']"));

    public static final Target BTN_CERRAR= Target.the("Cerrar sesion").located(By.xpath("//a[text()='Salir']"));



}
