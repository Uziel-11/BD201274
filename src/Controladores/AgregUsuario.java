package Controladores;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.service.ServiceRegistry;
import persistencia.Clientes;

public class AgregUsuario {
    private static SessionFactory factory;
    private static ServiceRegistry serviceRegistry;

    public Integer addCliente(int numCliente, String nombre,String celular, String direccion, String ciudad){
        Session session = factory.openSession();
        Transaction tx = null;
        Integer daoID = null;
        try{
            tx = session.beginTransaction();
            Clientes dao = new Clientes(numCliente,nombre, celular, direccion,ciudad);
            daoID = (Integer) session.save(dao);
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return daoID;
    }

}
