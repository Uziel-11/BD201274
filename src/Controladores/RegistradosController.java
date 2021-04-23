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
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import modelo.ModelRegistrados;
import persistencia.Medicamento;
import persistencia.Registrados;

public class RegistradosController implements Initializable {

    ModelRegistrados registrad = new ModelRegistrados();
    ObservableList<Registrados> datos = FXCollections.observableArrayList();

    @FXML
    private TableView<Registrados> tableView;
    @FXML
    private TableColumn<Registrados, Integer> idRegistrados;
    @FXML
    private TableColumn<Registrados, String> nomCliente;
    @FXML
    private TableColumn<Registrados, String> nomMascota;
    @FXML
    private TableColumn<Registrados, String> color;
    @FXML
    private TableColumn<Registrados, String> especie;
    @FXML
    private TableColumn<Registrados, String> raza;
    @FXML
    private TableColumn<Registrados, String> motivo;
    @FXML
    private TextField eliminar;



    @FXML
    public void listar(){
        List<Registrados> registradosList = registrad.listarRegistrados();
        datos.clear();

        idRegistrados.setCellValueFactory(new PropertyValueFactory<Registrados, Integer>("idRegistrados"));
        nomCliente.setCellValueFactory(new PropertyValueFactory<Registrados, String>("nomCliente"));
        nomMascota.setCellValueFactory(new PropertyValueFactory<Registrados, String>("nomAnimal"));
        color.setCellValueFactory(new PropertyValueFactory<Registrados, String>("color"));
        especie.setCellValueFactory(new PropertyValueFactory<Registrados, String>("especie"));
        raza.setCellValueFactory(new PropertyValueFactory<Registrados, String>("raza"));
        motivo.setCellValueFactory(new PropertyValueFactory<Registrados, String>("motivo"));

        for (int i=0; i<registradosList.size(); i++){

            Registrados registrados = new Registrados();

            registrados.setIdRegistrados(registradosList.get(i).getIdRegistrados());
            registrados.setNomCliente(registradosList.get(i).getNomCliente());
            registrados.setNomAnimal(registradosList.get(i).getNomAnimal());
            registrados.setColor(registradosList.get(i).getColor());
            registrados.setEspecie(registradosList.get(i).getEspecie());
            registrados.setRaza(registradosList.get(i).getRaza());
            registrados.setMotivo(registradosList.get(i).getMotivo());


            datos.add(registrados);
        }
        tableView.setItems(datos);
    }

    public void eliminarRegis(){
        registrad.deleteRegistrados(new Registrados(Integer.parseInt(eliminar.getText())));
        listar();
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
