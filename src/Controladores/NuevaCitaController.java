/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import modelo.ModelAnimal;
import modelo.ModelCita;
import org.hibernate.sql.Select;
import persistencia.Animal;
import persistencia.Citas;
import persistencia.Clientes;

public class NuevaCitaController implements Initializable {

    ModelCita cita = new ModelCita();

    ObservableList<Clientes> list = FXCollections.observableArrayList();

    @FXML
    private TableView<Clientes> vista;
    @FXML
    private TableColumn<Clientes, Integer> id;
    @FXML
    private TableColumn<Clientes, String> nombre;
    @FXML
    private TableColumn<Clientes, String> telefono;

    @FXML
    private TextField idCliente;
    @FXML
    private TextField nombreAnimal;
    @FXML
    private TextField ingreso;
    @FXML
    private ComboBox<String> especie;
    @FXML
    private ComboBox<String> razon;
    @FXML
    private TextField hora;
    @FXML
    private TextField color;
    @FXML
    private TextField raza;
    @FXML
    private TextField peso;

    private int idCita;


    public void Agregar(){


        int idAnimal = cita.addAnimal(new Animal(Integer.parseInt(idCliente.getText()), nombreAnimal.getText(), color.getText(),
                especie.getValue(), raza.getText(),
                peso.getText(), ingreso.getText(), razon.getValue()));

        cita.addCita(new Citas(idCita,idAnimal, ingreso.getText(),razon.getValue(), hora.getText()));

        ingreso.clear(); hora.clear(); idCliente.clear(); nombreAnimal.clear();
        color.clear(); raza.clear(); peso.clear();
    }




    public void llenarTabla(){
        List<Clientes> clientesList = cita.listaClientes();
        list.clear();

        id.setCellValueFactory(new PropertyValueFactory<Clientes, Integer>("idClientes"));
        nombre.setCellValueFactory(new PropertyValueFactory<Clientes, String>("Nombre"));
        telefono.setCellValueFactory(new PropertyValueFactory<Clientes, String>("Celular"));

        for (int i=0; i<clientesList.size(); i++){
            Clientes clientes = new Clientes();

            clientes.setIdClientes(clientesList.get(i).getIdClientes());
            clientes.setNombre(clientesList.get(i).getNombre());
            clientes.setCelular(clientesList.get(i).getCelular());

            list.add(clientes);
        }

        vista.setItems(list);
    }

    public void nuevoComboBox(){
        ObservableList<String> datos = FXCollections.observableArrayList();
        datos.addAll("Perro", "Gato", "Hamsters");
        especie.setItems(datos);

        ObservableList<String> datos2 = FXCollections.observableArrayList();
        datos2.addAll("Enfermedad", "Aseo", "Vacunacion");
        razon.setItems(datos2);

    }





    @Override
    public void initialize(URL url, ResourceBundle rb) {
        llenarTabla();
        nuevoComboBox();
    }    
    
}
