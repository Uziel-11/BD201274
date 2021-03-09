package persistencia;

import javax.persistence.*;


public class Citas {

    private int idCitas;
    private String fecha_Citas;
    private int total_Factura;
    private String forma_Pago;
    private int cantidad_Pagada;
    private String facturacion;

    public Citas(int idCitas, String fecha_Citas, int total_Factura, String forma_Pago, int cantidad_Pagada, String facturacion) {
        this.idCitas = idCitas;
        this.fecha_Citas = fecha_Citas;
        this.total_Factura = total_Factura;
        this.forma_Pago = forma_Pago;
        this.cantidad_Pagada = cantidad_Pagada;
        this.facturacion = facturacion;
    }

    public int getIdCitas() {
        return idCitas;
    }

    public void setIdCitas(int idCitas) {
        this.idCitas = idCitas;
    }

    public String getFecha_Citas() {
        return fecha_Citas;
    }

    public void setFecha_Citas(String fecha_Citas) {
        this.fecha_Citas = fecha_Citas;
    }

    public int getTotal_Factura() {
        return total_Factura;
    }

    public void setTotal_Factura(int total_Factura) {
        this.total_Factura = total_Factura;
    }

    public String getForma_Pago() {
        return forma_Pago;
    }

    public void setForma_Pago(String forma_Pago) {
        this.forma_Pago = forma_Pago;
    }

    public int getCantidad_Pagada() {
        return cantidad_Pagada;
    }

    public void setCantidad_Pagada(int cantidad_Pagada) {
        this.cantidad_Pagada = cantidad_Pagada;
    }

    public String getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(String facturacion) {
        this.facturacion = facturacion;
    }


}
