package persistencia;

import javax.persistence.*;

@Entity
@Table(name = "Medicacion")
public class Medicacion {

    @Id
    @GeneratedValue
    @Column(name = "idMedicacion")
    private int idMedicacion;

    @Column(name = "Codigo")
    private int Codigo;


    @Column(name = "Precio")
    private int Precio;

    @Column(name = "Sustancias")
    private String Sustancias;

    public Medicacion(int codigo, int precio, String sustancias){
        this.Codigo = codigo;
        this.Precio = precio;
        this.Sustancias = sustancias;
    }

    public int getIdMedicacion() {
        return idMedicacion;
    }

    public void setIdMedicacion(int idMedicacion) {
        this.idMedicacion = idMedicacion;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public String getSustancias() {
        return Sustancias;
    }

    public void setSustancias(String sustancias) {
        Sustancias = sustancias;
    }
}
