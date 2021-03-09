package Controladores;

public class ContClientes {

    private static SessionFactory factory;
    private static ServiceRegistry serviceRegistry;

    public ContCliente(){
        System.err.println("Iniciando");
        try {
            Configuratiem.err.println("Leyendo configuracion.");
            confon configuration = new Configuration();
            Systiguration.configure("./hibernate.cfg.xml");
            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            factory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            System.err.println("No se puede crear la Sesion" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
}