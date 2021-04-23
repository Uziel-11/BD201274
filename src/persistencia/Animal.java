package persistencia;



public class Animal {

    private int idAnimal;
    private String nomCliente;
    private String nombre;
    private String color;
    private String especie;
    private String raza;
    private String peso;
    private String motivo;

    public Animal() {

    }

    public Animal(String nomCliente, String nombre, String color, String especie, String raza, String peso, String motivo) {
        this.nomCliente = nomCliente;
        this.nombre = nombre;
        this.color = color;
        this.especie = especie;
        this.raza = raza;
        this.peso = peso;
        this.motivo = motivo;
    }


    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }
}
