package Controladores;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.lang.module.FindException;
import modelo.ModelUsuario;
import persistencia.Usuario;


public class ControlUsuario{
    Usuario usuario=new Usuario();
    ModelUsuario ms=new ModelUsuario();

    @FXML
    TextField users;
    @FXML
    TextField contra;

    public void enviarDatos(){
        String nombre;
        String contrasenia;

        nombre=users.getText();
        contrasenia=contra.getText();
        usuario.setUsuario(nombre);
        usuario.setContrasenia(contrasenia);

        ms.agregarUsuario(usuario);
    }
}
