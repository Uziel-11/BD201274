package persistencia;


public class Citas {

    private int idCitas;
    private int idAnimal;
    private String fecha;
    private String servicio;
    private String hora;

    public Citas(){

    }


    public Citas(int idCitas, int idAnimal, String fecha, String servicio, String hora) {
        this.idCitas = idCitas;
        this.idAnimal = idAnimal;
        this.fecha = fecha;
        this.servicio = servicio;
        this.hora = hora;
    }

    public int getIdCitas() {
        return idCitas;
    }

    public void setIdCitas(int idCitas) {
        this.idCitas = idCitas;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
