package co.com.red5g.models;

import co.com.red5g.models.builders.ClienteBuilder;

public class Cliente {

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

    public Cliente(final ClienteBuilder productosDesdeBuilder) {
        this.nombre = productosDesdeBuilder.getNombre();
        this.apellidouno = productosDesdeBuilder.getApellidouno();
        this.apellidodos = productosDesdeBuilder.getApellidodos();
        this.documento = productosDesdeBuilder.getDocumento();
        this.direccion = productosDesdeBuilder.getDireccion();
        this.barrio = productosDesdeBuilder.getBarrio();
        this.telefono = productosDesdeBuilder.getTelefono();
        this.correo = productosDesdeBuilder.getCorreo();
        this.nombreapellido = productosDesdeBuilder.getNombreapellido();
        this.celular = productosDesdeBuilder.getCelular();
        this.celularnequi = productosDesdeBuilder.getCelularnequi();


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
