package co.com.red5g.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class ProductosPage {

    //BROCHAS
    public static final Target BTN_CATEGORIA_BROCHAS = Target.the("Categoria de brochas").locatedBy("(//a[text()='BROCHAS' ])[1]");
    public static final Target SLT_ORDENAR_POR_PRECIO = Target.the("Opcion para ordenar").locatedBy("//select[@name='orderby']");
    public static final Target BTN_ORDENAR_PRECIO = Target.the("Opcion de orden").locatedBy("//option[text()='Ordenar por precio: bajo a alto']");
    public static final Target LBL_PRODUCTO_BROCHA_UNO = Target.the("Producto brocha uno").locatedBy("//a[text()='Silisponge']");
    //BOTON PARA ANADIR LOS PRODUCTOS AL CARRITO
    public static final Target BTN_ANADIR_CARRITO = Target.the("Boton de anadir al carrito").locatedBy("//button[@name='add-to-cart']");
    public static final Target LBL_PRODUCTO_BROCHA_DOS = Target.the("Producto brocha dos").locatedBy("//a[text()='Pincel para cejas']");
    //BOTON PARA VER CARRITO
    public static final Target BTN_VER_CARRITO = Target.the("Boton ver carrito").locatedBy("//a[@class='button wc-forward']");

    //PESTANAS
    public static final Target BTN_CATEGORIA_PESTANAS = Target.the("Categoria de pestanas").locatedBy("(//a[@href='https://brykamakeup.com/product-category/pestanas/'])[1]");
    public static final Target LBL_PRODUCTO_PESTANA_UNO = Target.the("Producto pestana uno").locatedBy("//a[text()='Tijeras Bryka Lashes']");
    public static final Target LBL_PRODUCTO_PESTANA_DOS = Target.the("Producto pestana dos").locatedBy("//a[text()='Tijeras Bryka Lashes']");

    //VISUALIZAR CARRITO
    public static final Target LBL_VISUALIZAR_PRODUCTOS_CARRITO = Target.the("Producto los productos en el carrito").locatedBy("//h2[text()='Total del carrito']");


}
