package persistencia;

import javax.persistence.*;


public class Animal {

    private int idAnimal;
    private int idCliente;
    private String nombre;
    private String tipo;
    private String raza;
    private String sexo;
    private String ingreso;
    private int peso;
    private String motivo;

    public Animal(int idAnimal, int idCliente, String nombre, String tipo, String raza, String sexo, String ingreso, int peso, String motivo) {
        this.idAnimal = idAnimal;
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
