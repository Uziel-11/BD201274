package persistencia;


public class Citas {

    private int idCitas;
    private String nomCliente;
    private int idAnimal;
    private String nomAnimal;
    private String fecha;
    private String hora;

    public Citas(){

    }


    public Citas(int idCitas, int idAnimal, String fecha, String hora) {
        this.idCitas = idCitas;
        this.idAnimal = idAnimal;
        this.fecha = fecha;
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


    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getNomAnimal() {
        return nomAnimal;
    }

    public void setNomAnimal(String nomAnimal) {
        this.nomAnimal = nomAnimal;
    }
}
