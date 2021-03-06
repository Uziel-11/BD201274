package Controladores;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class Controller {
    @FXML
    private Button btnPractica_Alumno;

    @FXML
    void Practica_AlumnoADO(ActionEvent event) {
        /*DAO dao = new DAO();
        dao.crear();
        dao.getAlumnos();*/
        //dao.deleteCiudad();

        //dao.getCiudad(1);


        //dao.getAlumno(1);
        //dao.getAlumno(2);

    }

public void datos(){
        AgregUsuario us=new AgregUsuario();
        Integer dao1 = us.addCliente(23, "Juan", "9931847636", "1ra, Norte Sur", "Tuxtla Gutierrez");
}

}
