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
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FXMLPrincipalController implements Initializable {

    @FXML
    private Label label;
    
    @FXML
    private void cambiarVista(ActionEvent eventbtn) throws IOException {
        Button btn = (Button)eventbtn.getSource();
        String vista = "";
        
        switch(btn.getText()){
            case "Cita":
                vista = "../vistas/NuevaCita.fxml";
                break;
            case "Registro":
                vista = "../vistas/Registro.fxml";
                break;
            case "Medicamentos":
                vista = "../vistas/Medicamento.fxml";
                break;
        }

        Stage st;
        Parent root = FXMLLoader.load(getClass().getResource(vista));

        Scene scene = new Scene(root);

        st = (Stage) ((Node)eventbtn.getSource()).getScene().getWindow();

        st.setScene(scene);
        st.setTitle("Home");
        st.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    public void closeWindows(){

    }
}
