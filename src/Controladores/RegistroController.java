/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.ModelRegistrados;
import modelo.ModelRegistro;
import persistencia.Animal;
import persistencia.Clientes;
import persistencia.Registrados;

public class RegistroController implements Initializable {

    ModelRegistro registro = new ModelRegistro();
    ModelRegistrados registrados = new ModelRegistrados();

    @FXML
   TextField nombre;
    @FXML
   TextField apellido;
    @FXML
   TextField direccion;
    @FXML
   TextField celular;
    @FXML
    TextField correo;
    @FXML
    TextField nomMascota;
    @FXML
    TextField color;
    @FXML
    ComboBox<String> especie;
    @FXML
     TextField raza;
    @FXML
    TextField peso;
    @FXML
    TextField fechaIngreso;
    @FXML
    ComboBox<String> motivo;


    @FXML
    public void registro(){

        registrados.agregar(new Registrados(nombre.getText()+" "+apellido.getText(), nomMascota.getText(),
                color.getText(), especie.getValue(), raza.getText(), motivo.getValue()));

        registro.agregarCliente(new Clientes(nombre.getText()+" "+apellido.getText(),
                celular.getText(),direccion.getText(), correo.getText()));

        registro.agregarAnimal(new Animal(nombre.getText(),nomMascota.getText(), color.getText(), especie.getValue(),
                raza.getText(), peso.getText(), motivo.getValue()));


        nombre.clear();
        apellido.clear();
        direccion.clear();
        celular.clear();
        correo.clear();
        nomMascota.clear();
        color.clear();
        raza.clear();
        peso.clear();
        fechaIngreso.clear();
    }

    public void clienteRegistrados(){

    }

    public void comboBox(){
        ObservableList<String> datos = FXCollections.observableArrayList();
        datos.addAll("Perro", "Gato", "Hamsters");
        especie.setItems(datos);

        ObservableList<String> datos2 = FXCollections.observableArrayList();
        datos2.addAll("Enfermedad", "Aseo", "Vacunacion");
        motivo.setItems(datos2);

    }
    
    @FXML
    private void home (ActionEvent eventbtn) throws IOException{
        Stage st = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../vistas/FXMLPrincipal.fxml"));
        
        Scene scene = new Scene(root);
        
        st = (Stage) ((Node)eventbtn.getSource()).getScene().getWindow();
        
        st.setScene(scene);
        st.setTitle("Home");
        st.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboBox();
    }

}
