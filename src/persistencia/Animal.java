package persistencia;



public class Animal {

    private int idAnimal;
    private int idCliente;
    private String nombre;
    private String tipo;
    private String edad;

    public Animal() {

    }

    public Animal(int idCliente, String nombre, String tipo, String edad) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad=edad;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
