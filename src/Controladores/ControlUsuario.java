package Controladores;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modelo.ModelUsuario;
import persistencia.Usuario;
import javafx.scene.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControlUsuario {
    Usuario usuario=new Usuario();
    ModelUsuario ms=new ModelUsuario();

    @FXML
    TextField usuar;
    @FXML
    TextField contrasen;
    @FXML
    Label error;
    @FXML
    private Button iniciar;

//    public void enviarDatos(){
//        String nombre;
//        String contrasenia;
//
//        nombre=users.getText();
//        contrasenia=contra.getText();
//        usuario.setUsuario(nombre);
//        usuario.setContrasenia(contrasenia);
//
//        ms.agregarUsuario(usuario);
//    }

    @FXML
    public void IniciarSesion(){
        usuario.setUsuario(usuar.getText());
        usuario.setContrasenia(contrasen.getText());
        if (ms.validarUsuario(usuario)){
            System.out.println("Usuario y Contraseña correcta");
            try {

                FXMLLoader cargar=new FXMLLoader(getClass().getResource("../vistas/FXMLPrincipal.fxml"));
                Parent root = cargar.load();
                FXMLPrincipalController controlador = cargar.getController();
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setScene(scene);
                stage.show();
                stage.setOnCloseRequest(e -> controlador.closeWindows());
                Stage myStage = (Stage) this.iniciar.getScene().getWindow();
                myStage.close();
            } catch (IOException e) {
                Logger.getLogger(FXMLPrincipalController.class.getName()).log(Level.SEVERE, null, e);
            }

        }else{
            error.setText("Usuario o Contraseña Incorrectas");
        }
    }


}