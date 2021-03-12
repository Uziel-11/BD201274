package persistencia;


public class Clientes {

    private int idClientes;
    private String Nombre;
    private String Celular;
    private String Direccion;
    private String Correo;

    public Clientes(){

    }

    public Clientes(String nombre, String celular, String direccion, String correo) {
        this.Nombre = nombre;
        this.Celular = celular;
        this.Direccion = direccion;
        this.Correo = correo;
    }


    public String getNombre() {
        return Nombre;
    }

    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String celular) {
        Celular = celular;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getCiudad() {
        return Correo;
    }

    public void setCiudad(String correo) {
        Correo = correo;
    }


}
