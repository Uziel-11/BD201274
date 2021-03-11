package Controladores;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.lang.module.FindException;
import modelo.ModelUsuario;
import persistencia.Usuario;


public class ControlUsuario{
    Usuario us=new Usuario();
    ModelUsuario ms=new ModelUsuario();

    @FXML
    TextField usuario;
    @FXML
    TextField contra;

    public void enviarDatos(){
        String nombre;
        String contrasenia;

        nombre=usuario.getText();
        contrasenia=contra.getText();
        us.setUsuario(nombre);
        us.setContrasenia(contrasenia);

        ms.agregarUsuario(us);
    }
}
