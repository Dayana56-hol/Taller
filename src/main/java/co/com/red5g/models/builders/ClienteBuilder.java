package co.com.red5g.models.builders;

import co.com.red5g.models.Cliente;
import javafx.util.Builder;

public class ClienteBuilder implements Builder<Cliente> {


    private String nombre;
    private String apellidouno;
    private String apellidodos;
    private String documento;
    private String direccion;
    private String barrio;
    private String telefono;
    private String correo;
    private String nombreapellido;
    private String celular;
    private String celularnequi;


    public ClienteBuilder() {
        this.nombre = "";
        this.apellidouno = "";
        this.apellidodos = "";
        this.documento = "";
        this.direccion = "";
        this.barrio = "";
        this.telefono = "";
        this.correo = "";
        this.nombreapellido = "";
        this.celular = "";
        this.celularnequi = "";
    }


    @Override
    public Cliente build() {
        return new Cliente(this);
    }

    public static ClienteBuilder con() {
        return new ClienteBuilder();
    }


    public ClienteBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ClienteBuilder conApellidouno(String apellidouno) {
        this.apellidouno = apellidouno;
        return this;
    }

    public ClienteBuilder conApellidodos(String apellidodos) {
        this.apellidodos = apellidodos;
        return this;
    }

    public ClienteBuilder conDocumento(String documento) {
        this.documento = documento;
        return this;
    }

    public ClienteBuilder condireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public ClienteBuilder conBarrio(String barrio) {
        this.barrio = barrio;
        return this;
    }

    public ClienteBuilder conTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public ClienteBuilder conCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    public ClienteBuilder conNombreapellido(String nombreapellido) {
        this.nombreapellido = nombreapellido;
        return this;
    }

    public ClienteBuilder conCelular(String celular) {
        this.celular = celular;
        return this;
    }

    public ClienteBuilder conCelularnequi(String celularnequi) {
        this.celularnequi = celularnequi;
        return this;
    }


    public Cliente cliente() {
        conNombre("Maria");
        conApellidouno("Castro");
        conApellidodos("Perez");
        conDocumento("1002726262");
        condireccion("Calle 20");
        conBarrio("prueba");
        conTelefono("3008028272");
        conCorreo("prueba@gmail.com");
        conNombreapellido("Maria Castro");
        conCelular("3008023333");
        conCelularnequi("3008012877");
        return build();
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellidouno() {
        return apellidouno;
    }

    public String getApellidodos() {
        return apellidodos;
    }

    public String getDocumento() {
        return documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombreapellido() {
        return nombreapellido;
    }

    public String getCelular() {
        return celular;
    }

    public String getCelularnequi() {
        return celularnequi;
    }

}
