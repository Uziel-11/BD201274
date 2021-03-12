package modelo;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.service.ServiceRegistryBuilder;
import persistencia.Usuario;

public class ModelUsuario {

    private SessionFactory factory;
    private ServiceRegistry serviceRegistry;

    public ModelUsuario(){
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

    

//    public boolean agregarUsuario(Usuario usuario){
//        Session session = factory.openSession();
//        session.beginTransaction();
//        try {
//            session.save(usuario);
//            session.getTransaction().commit();
//            return true;
//        } catch (Exception e){
//            System.err.println(e);
//            return false;
//        }
//    }

    public boolean validarUsuario(Usuario usuario){
        Session session = factory.openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(persistencia.Usuario.class);
        Criterion username= Restrictions.eq("usuario",usuario.getUsuario());
        Criterion passsword= Restrictions.eq("contrasenia", usuario.getContrasenia());
        LogicalExpression andExp = Restrictions.and(username,passsword);
        criteria.add(andExp);
        if(criteria.list().isEmpty()){
            return false;
        }
        return true;
    }
}
