package persistencia;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;

import javax.persistence.*;
import java.util.Date;

public class Medicamento {

    private int idMedicamento;
    private String nombre;
    private int precio;
    private int cantidad;
    private String fechaCaducidad;
    private String sustanciaActiva;

    public Medicamento(){

    }

    public Medicamento(int idMedicamento, String nombre, int precio,int cantidad, String fechaCaducidad, String sustanciaActiva) {
        this.idMedicamento = idMedicamento;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fechaCaducidad = fechaCaducidad;
        this.sustanciaActiva = sustanciaActiva;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getSustanciaActiva() {
        return sustanciaActiva;
    }

    public void setSustanciaActiva(String sustanciaActiva) {
        this.sustanciaActiva = sustanciaActiva;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
