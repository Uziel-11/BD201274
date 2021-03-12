package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import persistencia.Animal;
import persistencia.Clientes;

public class ModelRegistro {

    private SessionFactory factory;
    private ServiceRegistry serviceRegistry;

    public ModelRegistro(){
        System.err.println("Iniciando");
        try {
            Configuration configuration = new Configuration();
            System.err.println("Leyendo Configuracion");
            configuration.configure("mysql.cfg.xml");
            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            factory = configuration.buildSessionFactory(serviceRegistry);
        }catch (Throwable ex){
            System.err.println("No se puede crear la Sesion" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public int agregarCliente(Clientes cliente){
        Session session = factory.openSession();
        session.beginTransaction();
        int id = 0;
        try {
            session.save(cliente);
            session.getTransaction().commit();
            id = (int) session.save(cliente);
        } catch (Exception e){
            System.err.println(e);
         //   return false;
        }
        return id;
    }

    public boolean agregarAnimal(Animal animal){
        Session session = factory.openSession();
        session.beginTransaction();
        try {
            session.save(animal);
            session.getTransaction().commit();
            return true;
        } catch (Exception e){
            System.err.println(e);
            return false;
        }
    }

}
