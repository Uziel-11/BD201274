/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import modelo.ModelMedicamentos;
import persistencia.Medicamento;

public class ControlMedicamento implements Initializable {


    ModelMedicamentos medic=new ModelMedicamentos();

    ObservableList<Medicamento> datos = FXCollections.observableArrayList();

    @FXML
    private TableView <Medicamento> vista;
    @FXML
    private TableColumn<Medicamento, Integer> columnCodigo;
    @FXML
    private TableColumn<Medicamento, String> columnNombre;
    @FXML
    private TableColumn<Medicamento, Integer> columnPrecio;
    @FXML
    private TableColumn<Medicamento, Integer> columnCantidad;
    @FXML
    private TableColumn<Medicamento, String> columnCaducidad;
    @FXML
    private TableColumn<Medicamento, String> columnSustancia;

    @FXML
    private TextField codigo;
    @FXML
    private TextField nombre;
    @FXML
    private TextField precio;
    @FXML
    private TextField cantidad;
    @FXML
    private TextField caducidad;
    @FXML
    private TextField sustancia;
    @FXML
    private TextField codig;


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

        listar();
    }

    @FXML
    public void eliminar(){
        medic.deleteMedicamentos(new Medicamento(Integer.parseInt(codig.getText())));

        codig.clear();

        listar();
    }

    @FXML
    public void actualizar(){
        medic.upgradeMedicamentos(new Medicamento(Integer.parseInt(codigo.getText()), nombre.getText(), Integer.parseInt(precio.getText()),
                Integer.parseInt(cantidad.getText()),caducidad.getText(), sustancia.getText()));

        codigo.clear();
        nombre.clear();
        precio.clear();
        cantidad.clear();
        caducidad.clear();
        sustancia.clear();

        listar();
    }

    @FXML
    public void listar(){
        List<Medicamento> medicamentoList = medic.listaMedicamentos();
        datos.clear();

        columnCodigo.setCellValueFactory(new PropertyValueFactory<Medicamento, Integer>("idMedicamento"));
        columnNombre.setCellValueFactory(new PropertyValueFactory<Medicamento, String>("nombre"));
        columnPrecio.setCellValueFactory(new PropertyValueFactory<Medicamento, Integer>("precio"));
        columnCantidad.setCellValueFactory(new PropertyValueFactory<Medicamento, Integer>("cantidad"));
        columnCaducidad.setCellValueFactory(new PropertyValueFactory<Medicamento, String>("fechaCaducidad"));
        columnSustancia.setCellValueFactory(new PropertyValueFactory<Medicamento, String>("sustanciaActiva"));

        for (int i=0; i<medicamentoList.size(); i++){

            Medicamento medicamento = new Medicamento();

            medicamento.setIdMedicamento(medicamentoList.get(i).getIdMedicamento());
            medicamento.setNombre(medicamentoList.get(i).getNombre());
            medicamento.setPrecio(medicamentoList.get(i).getPrecio());
            medicamento.setCantidad(medicamentoList.get(i).getCantidad());
            medicamento.setFechaCaducidad(medicamentoList.get(i).getFechaCaducidad());
            medicamento.setSustanciaActiva(medicamentoList.get(i).getSustanciaActiva());

            datos.add(medicamento);
        }
        vista.setItems(datos);
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listar();
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
