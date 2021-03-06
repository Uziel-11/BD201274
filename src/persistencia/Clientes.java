package persistencia;
import javax.persistence.*;

@Entity
@Table(name = "Clientes")

public class Clientes {
    @Id
    @GeneratedValue
    @Column(name = "idClientes")
    private int idClientes;

    @Column(name = "NumeroCliente")
    private int NumeroCliente;

    @Column(name = "Nombre")
    private String Nombre;

    @Column(name = "Celular")
    private String Celular;

    @Column(name = "Direccion")
    private String Direccion;

    @Column(name = "Ciudad")
    private String Ciudad;

    public Clientes(){

    }

    public Clientes(int NumeroCliente, String Nombre, String Celular, String Direccion, String Ciudad){
        this.NumeroCliente = NumeroCliente;
        this.Nombre = Nombre;
        this.Celular = Celular;
        this.Direccion = Direccion;
        this.Ciudad = Ciudad;
    }

    public int getIdClientes(){
        return idClientes;
    }

    public void setIdClientes(int idClientes){
        this.idClientes = idClientes;
    }

    public int getNumeroCliente(){
        return NumeroCliente;
    }

    public void setNumeroCliente(int NumeroCliente){
        this.NumeroCliente = NumeroCliente;
    }

    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public String getCelular(){
        return Celular;
    }

    public void setCelular(String celular) {
        Celular = celular;
    }

    public String getDireccion(){
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCiudad(){
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }
}
