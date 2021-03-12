package modelo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import persistencia.Animal;;

public class ModelAnimal {

    private static SessionFactory factory;
    private static ServiceRegistry serviceRegistry;

    public ModelAnimal(){
        System.err.println("Iniciando");

        try {
            Configuration configuration = new Configuration();
            System.err.println("leyendo configuracion");
            configuration.configure("mysql.cfg.xml");
            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            factory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex){
            System.err.println("No se puede crear la sesión" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }



    public void deleteAnimales (Animal animal){

    }

    public void upgradeAnimales (Animal animal){

    }

    //public List<Animal> lisraAnimal (){

    //}
}
