/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelo.ModelMedicamentos;
import persistencia.Medicamento;

public class ControlMedicamento implements Initializable {

    ModelMedicamentos medic=new ModelMedicamentos();

    @FXML
    TextField codigo;
    @FXML
    TextField nombre;
    @FXML
    TextField precio;
    @FXML
    TextField cantidad;
    @FXML
    TextField caducidad;
    @FXML
    TextField sustancia;
    @FXML
    TextField codig;

    @FXML
    public void Agregar(){
        medic.addMedicamento(new Medicamento(Integer.parseInt(codigo.getText()), nombre.getText(), Integer.parseInt(precio.getText()),
               Integer.parseInt(cantidad.getText()), caducidad.getText(), sustancia.getText()));

        codigo.clear();
        nombre.clear();
        precio.clear();
        cantidad.clear();
        caducidad.clear();
        sustancia.clear();
    }

    @FXML
    public void eliminar(){
        medic.deleteMedicamentos(new Medicamento(Integer.parseInt(codig.getText()), nombre.getText(), Integer.parseInt(precio.getText()),
                Integer.parseInt(cantidad.getText()),caducidad.getAccessibleText(), sustancia.getText()));
    }

    @FXML
    public void actualizar(){
        medic.upgradeMedicamentos(new Medicamento(Integer.parseInt(codigo.getText()), nombre.getText(), Integer.parseInt(precio.getText()),
                Integer.parseInt(cantidad.getText()),caducidad.getAccessibleText(), sustancia.getText()));
    }

    @FXML
    public void listar(){

        medic.listaMedicamentos();

    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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


    
}
