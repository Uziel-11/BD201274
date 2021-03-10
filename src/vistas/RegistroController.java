/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

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
import javafx.stage.Stage;

public class RegistroController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void home (ActionEvent eventbtn) throws IOException{
        Stage st = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLPrincipal.fxml"));
        
        Scene scene = new Scene(root);
        
        st = (Stage) ((Node)eventbtn.getSource()).getScene().getWindow();
        
        st.setScene(scene);
        st.setTitle("Home");
        st.show();
    }
    
}
