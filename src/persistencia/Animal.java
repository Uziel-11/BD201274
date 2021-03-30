package persistencia;



public class Animal {

    private int idAnimal;
    private int idCliente;
    private String nombre;
    private String color;
    private String especie;
    private String raza;
    private String peso;
    private String fechaIngreso;
    private String motivo;

    public Animal() {

    }

    public Animal(int idCliente, String nombre, String color, String especie, String raza, String peso, String fechaIngreso, String motivo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.color = color;
        this.especie = especie;
        this.raza = raza;
        this.peso = peso;
        this.fechaIngreso = fechaIngreso;
        this.motivo = motivo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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
}
