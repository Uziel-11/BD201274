package persistencia;

import javax.persistence.*;

@Entity
@Table(name = "Citas")
public class Citas {
    @Id
    @GeneratedValue
    @Column(name = "idCitas")
    private int idCitas;

    @Column(name = "Fecha_Citas")
    private String Fecha_Citas;

    @Column(name = "Total_Factura")
    private int Total_Factura;

    @Column(name = "Forma_Pago")
    private String Forma_Pago;

    @Column(name = "Cantidad_Pagada")
    private int Cantidad_Pagada;

    @Column(name = "Facturacion")
    private String Facturacion;

    public Citas(String fecha_Citas, int total_Factura, String forma_Pago, int cantidad_Pagada, String facturacion){
        this.Fecha_Citas = fecha_Citas;
        this.Total_Factura = total_Factura;
        this.Forma_Pago = forma_Pago;
        this.Cantidad_Pagada = cantidad_Pagada;
        this.Facturacion = facturacion;
    }

    public int getIdCitas() {
        return idCitas;
    }

    public void setIdCitas(int idCitas) {
        this.idCitas = idCitas;
    }

    public String getFecha_Citas() {
        return Fecha_Citas;
    }

    public void setFecha_Citas(String fecha_Citas) {
        Fecha_Citas = fecha_Citas;
    }

    public int getTotal_Factura() {
        return Total_Factura;
    }

    public void setTotal_Factura(int total_Factura) {
        Total_Factura = total_Factura;
    }

    public String getForma_Pago() {
        return Forma_Pago;
    }

    public void setForma_Pago(String forma_Pago) {
        Forma_Pago = forma_Pago;
    }

    public int getCantidad_Pagada() {
        return Cantidad_Pagada;
    }

    public void setCantidad_Pagada(int cantidad_Pagada) {
        Cantidad_Pagada = cantidad_Pagada;
    }

    public String getFacturacion() {
        return Facturacion;
    }

    public void setFacturacion(String facturacion) {
        Facturacion = facturacion;
    }
}
