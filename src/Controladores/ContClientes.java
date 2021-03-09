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

public class ContClientes {

    private static SessionFactory factory;
    private static ServiceRegistry serviceRegistry;

    public ContClientes(){
        System.err.println("Iniciando");
        try {
            Configuration configuration = new Configuration();
            System.err.println("Leyendo configuracion");
            configuration.configure("");
            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            factory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            System.err.println("No se puede crear la Sesion" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public void addClientes (Clientes clientes){

    }

    public void deleteClientes (Clientes clientes){

    }

    public void upgradeClientes (Clientes clientes){

    }

    //public List<Clientes> listaCliente (){

    //}
}