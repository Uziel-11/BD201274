package modelo;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import persistencia.Usuario;

public class ModelUsuario {

    private  SessionFactory factory;
    private ServiceRegistry serviceRegistry;

    public ModelUsuario(){
        System.err.println("Iniciando");
        try {
            Configuration configuration = new Configuration();
            System.err.println("Leyendo Configuracion");
            configuration.configure("hibernate.cfg.xml");
            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        }catch (Throwable ex){
            System.err.println("No se puede crear la Sesion" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public boolean agregarUsuario(Usuario us){
        Session session = factory.openSession();
        session.beginTransaction();
        try {
            session.save(us);
            session.getTransaction().commit();
            return true;
        } catch (Exception e){
            System.err.println(e);
            return false;
        }
    }

}
