package modelo;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import persistencia.Animal;
import persistencia.Citas;
import persistencia.Clientes;

import java.util.List;

public class ModelCita {
    private static SessionFactory factory;
    private static ServiceRegistry serviceRegistry;

    public ModelCita(){
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

    public boolean addCita (Citas citas){
        Session session = factory.openSession();
        session.beginTransaction();
        try {
            session.save(citas);
            session.getTransaction().commit();
            return true;
        } catch (Exception e){
            System.err.println(e);
            return false;
        }
    }

    public int addAnimal (Animal animal){
        Session session = factory.openSession();
        session.beginTransaction();
        int id = 0;
        try {
            session.save(animal);
            session.getTransaction().commit();
            id = (int) session.save(animal);
            //return true;
        } catch (Exception e){
            System.err.println(e);
            //return false;
        }

        return id;
    }

    public void  deleteCita (Citas citas){
        Session session = factory.openSession();
        session.beginTransaction();
        session.delete(citas);
        session.getTransaction().commit();
        session.close();
    }

    public void  upgradeCita (Citas citas){
        Session session = factory.openSession();
        session.beginTransaction();
        session.update(citas);
        session.getTransaction().commit();
        session.close();
    }

    public List<Clientes> listaClientes (){
        Session session = factory.openSession();
        Criteria criteria = session.createCriteria(persistencia.Clientes.class);
        List<persistencia.Clientes> results = criteria.list();
        for(persistencia.Clientes clientes: results){
            System.out.println(clientes.getNombre()+clientes.getIdClientes());
        }
        return results;
    }
}
