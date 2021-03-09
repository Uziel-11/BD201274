package persistencia;
import javax.persistence.*;


public class Clientes {

    private int idClientes;
    private String Nombre;
    private String Celular;
    private String Direccion;
    private String Ciudad;
    private String usuario;
    private String contrasenia;

    public Clientes(){

    }

    public Clientes(int idClientes,String nombre, String celular, String direccion, String ciudad, String usuario, String contrasenia) {
        this.idClientes = idClientes;
        this.Nombre = nombre;
        this.Celular = celular;
        this.Direccion = direccion;
        this.Ciudad = ciudad;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }


    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    public String getNombre() {
        return Nombre;
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
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }


}
