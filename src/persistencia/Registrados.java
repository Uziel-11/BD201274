package persistencia;

public class Registrados {

    private int idRegistrados;
    private String nomCliente;
    private String nomAnimal;
    private String color;
    private String especie;
    private String raza;
    private String motivo;

    public Registrados(String nomCliente, String nomAnimal, String color, String especie, String raza, String motivo) {
        this.idRegistrados = idRegistrados;
        this.nomCliente = nomCliente;
        this.nomAnimal = nomAnimal;
        this.color = color;
        this.especie = especie;
        this.raza = raza;
        this.motivo = motivo;
    }

    public Registrados(){}

    public Registrados(int idRegistrados){
        this.idRegistrados = idRegistrados;
    }


    public int getIdRegistrados() {
        return idRegistrados;
    }

    public void setIdRegistrados(int idRegistrados) {
        this.idRegistrados = idRegistrados;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
