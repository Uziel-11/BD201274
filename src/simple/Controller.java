package simple;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import persistencia.DAO;

public class Controller {
    @FXML
    private Button btnPractica_Alumno;

    @FXML
    void Practica_AlumnoADO(ActionEvent event) {
        DAO dao = new DAO();
        dao.crear();
        dao.getAlumnos();
        //dao.deleteCiudad();

        //dao.getCiudad(1);


        //dao.getAlumno(1);
        //dao.getAlumno(2);

    }

}
