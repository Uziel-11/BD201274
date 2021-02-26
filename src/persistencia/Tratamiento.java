package persistencia;

import javax.persistence.*;

@Entity
@Table(name = "Tratamiento")
public class Tratamiento {

    @Id
    @GeneratedValue
    @Column(name = "idTratamiento")
    private int idTratamiento;

    @Column(name = "Tratamiento") //<-String porque es tratamiento
    private int Tratamiento;

    @Column(name = "Precios")
    private int Precios;

    @Column(name = "Fecha_Caducidad")
    private String Fecha_Caducidad;

    public Tratamiento(int tratamiento, int precios, String fecha_Caducidad){
        this.Tratamiento = tratamiento;
        this.Precios = precios;
        this.Fecha_Caducidad = fecha_Caducidad;
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public int getTratamiento() {
        return Tratamiento;
    }

    public void setTratamiento(int tratamiento) {
        Tratamiento = tratamiento;
    }

    public int getPrecios() {
        return Precios;
    }

    public void setPrecios(int precios) {
        Precios = precios;
    }

    public String getFecha_Caducidad() {
        return Fecha_Caducidad;
    }

    public void setFecha_Caducidad(String fecha_Caducidad) {
        Fecha_Caducidad = fecha_Caducidad;
    }
}
