package org.Music;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SessionDB {
	public static SessionFactory sessionFactory;
	static {
		
		sessionFactory  = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		
		//Configuration configuration = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//		ServiceRegistry serviceRegistry = (ServiceRegistry) new StandardServiceRegistryBuilder();
//		sessionFactory.buildSessionFactory(serviceRegistry);
	}
	
	public static Session openSession() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		return session;
	}
	
	public static void closeSession(Session session) {
		session.getTransaction().commit();
		session.close();
	}
}
