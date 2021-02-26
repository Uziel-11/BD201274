package persistencia;

import javax.persistence.*;

@Entity
@Table(name = "animales")
public class Animal {

    @Id
    @GeneratedValue
    @Column(name = "IdAnimales")
    private int idAnimal;

    @Column(name = "Numero_Cliente")
    private int idCliente;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Tipo")
    private String tipo;

    @Column(name = "Raza")
    private String raza;

    @Column(name = "Sexo")
    private String sexo;

    @Column(name = "Fecha_Ingreso")
    private String ingreso;

    @Column(name = "Peso")
    private int peso;

    @Column(name = "Motivo")
    private String motivo;

    public Animal(){
    }

    public Animal(int idCliente, String nombre, String tipo, String raza, String sexo, String ingreso, int peso, String motivo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.sexo = sexo;
        this.ingreso = ingreso;
        this.peso = peso;
        this.motivo = motivo;
    }


    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
