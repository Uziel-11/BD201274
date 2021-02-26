package persistencia;

import javax.persistence.*;

@Entity
@Table(name = "Detalles_Animales")
public class Detalles_Animales {

    @Id
    @GeneratedValue
    @Column(name = "idDetalles_Animales")
    private int idDetalles_Animales;

    @Column(name = "Codigo_Tratamiento")
    private int Codigo_Tratamiento;

    @Column(name = "Codigo_Medicacion")
    private int Codigo_Medicacion;

    @Column(name = "Precio_Tratamiento")
    private int Precio_Tratamiento;

    @Column(name = "Precio_Medicacion")
    private int Precio_Medicacion;

    public Detalles_Animales(int codigo_Tratamiento, int codigo_Medicacion, int precio_Tratamiento, int precio_Medicacion){
        this.Codigo_Tratamiento = codigo_Tratamiento;
        this.Codigo_Medicacion = codigo_Medicacion;
        this.Precio_Tratamiento = precio_Tratamiento;
        this.Precio_Medicacion = precio_Medicacion;
    }

    public int getIdDetalles_Animales() {
        return idDetalles_Animales;
    }

    public void setIdDetalles_Animales(int idDetalles_Animales) {
        this.idDetalles_Animales = idDetalles_Animales;
    }

    public int getCodigo_Tratamiento() {
        return Codigo_Tratamiento;
    }

    public void setCodigo_Tratamiento(int codigo_Tratamiento) {
        Codigo_Tratamiento = codigo_Tratamiento;
    }

    public int getCodigo_Medicacion() {
        return Codigo_Medicacion;
    }

    public void setCodigo_Medicacion(int codigo_Medicacion) {
        Codigo_Medicacion = codigo_Medicacion;
    }

    public int getPrecio_Tratamiento() {
        return Precio_Tratamiento;
    }

    public void setPrecio_Tratamiento(int precio_Tratamiento) {
        Precio_Tratamiento = precio_Tratamiento;
    }

    public int getPrecio_Medicacion() {
        return Precio_Medicacion;
    }

    public void setPrecio_Medicacion(int precio_Medicacion) {
        Precio_Medicacion = precio_Medicacion;
    }
}
