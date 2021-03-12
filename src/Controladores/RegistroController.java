/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.ModelRegistro;
import persistencia.Animal;
import persistencia.Clientes;

public class RegistroController implements Initializable {

    ModelRegistro registro=new ModelRegistro();

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
    TextField edadMascota;
    @FXML
     TextField tipo;
    int id;


    @FXML
    public void registro(){

        id = registro.agregarCliente(new Clientes(nombre.getText()+" "+apellido.getText(),celular.getText(),direccion.getText(), correo.getText()));
        registro.agregarAnimal(new Animal(id,nomMascota.getText(), tipo.getText(), edadMascota.getText()));

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
        // TODO
    }

}
