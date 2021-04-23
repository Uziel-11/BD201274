package modelo;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import persistencia.Animal;
import persistencia.Registrados;

import java.util.List;

public class ModelRegistrados {

    private SessionFactory factory;
    private ServiceRegistry serviceRegistry;

    public ModelRegistrados(){
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

    public int agregar(Registrados registrados){
        Session session = factory.openSession();
        session.beginTransaction();
        int id = 0;
        try {
            session.save(registrados);
            session.getTransaction().commit();
            id = (int) session.save(registrados);
        } catch (Exception e){
            System.err.println(e);
            //   return false;
        }
        return id;
    }

    public void  deleteRegistrados (Registrados registrados){
        Session session = factory.openSession();
        session.beginTransaction();
        session.delete(registrados);
        session.getTransaction().commit();
        session.close();
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

    public List<Registrados> listarRegistrados (){
        Session session = factory.openSession();
        Criteria criteria = session.createCriteria(persistencia.Registrados.class);
        List<persistencia.Registrados> results = criteria.list();
        for(persistencia.Registrados registrados: results){
            System.out.println(registrados.getNomCliente() + registrados.getIdRegistrados());
        }
        return results;
    }
}
