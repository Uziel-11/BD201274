package Controladores;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import persistencia.Clientes;
import persistencia.Medicamento;

public class ContMedicamentos {

    private static SessionFactory factory;
    private static ServiceRegistry serviceRegistry;

    public ContMedicamentos(){
        System.err.println("Iniciando");
        try {
            Configuration configuration = new Configuration();
            System.err.println("Leyendo Configuracion");
            configuration.configure("");
            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        }catch (Throwable ex){
            System.err.println("No se puede crear la Sesion" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public void addMedicamento (Medicamento medicamento){

    }

    public void  deleteMedicamentos (Medicamento medicamento){

    }

    public void  upgradeMedicamentos (Medicamento medicamento){

    }

    //public List<Medicamento> listaMedicamentos (){

    //}

}
