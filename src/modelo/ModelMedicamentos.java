package modelo;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import persistencia.Clientes;
import persistencia.Medicamento;

import java.util.List;

public class ModelMedicamentos {

    private static SessionFactory factory;
    private static ServiceRegistry serviceRegistry;

    public ModelMedicamentos(){
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

    public boolean addMedicamento (Medicamento medicamento){
        Session session = factory.openSession();
        session.beginTransaction();
        try {
            session.save(medicamento);
            session.getTransaction().commit();
            return true;
        } catch (Exception e){
            System.err.println(e);
             return false;
        }
    }

    public void  deleteMedicamentos (Medicamento medicamento){
        Session session = factory.openSession();
        session.beginTransaction();
        session.delete(medicamento);
        session.getTransaction().commit();
        session.close();
    }

    public void  upgradeMedicamentos (Medicamento medicamento){
        Session session = factory.openSession();
        session.beginTransaction();
        session.update(medicamento);
        session.getTransaction().commit();
        session.close();
    }

    public List<Medicamento> listaMedicamentos (){
        Session session = factory.openSession();
        Criteria criteria = session.createCriteria(persistencia.Medicamento.class);
        List<persistencia.Medicamento> results = criteria.list();
        for(persistencia.Medicamento medicamento: results){
            System.out.println(medicamento.getNombre()+medicamento.getIdMedicamento());
        }
        return results;
    }

}
