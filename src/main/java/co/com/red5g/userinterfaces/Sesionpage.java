package co.com.red5g.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Sesionpage {

    public static final Target TXT_USUARIO = Target.the("Campo usuario").located(By.id("username"));
    public static final Target TXT_CONTRASENA = Target.the("Campo contrasena").located(By.id("password"));
    public static final Target BTN_LOGIN = Target.the("Boton login").located(By.name("login"));

    public static final Target LBL_LOGUEO_EXITOSO = Target.the("Logueo exitoso").located(By.xpath("//div[@class='woocommerce-MyAccount-content']"));
}
