package idv.cm.util;

import org.hibernate.boot.model.naming.ImplicitNamingStrategy;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

import java.io.File;

import javax.persistence.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class HibernateUtil {
	
	private static final SessionFactory factory;
	public static Logger log = LogManager.getLogger();
	
	static {
		try {
			factory = new Configuration().configure(new File("resources/hibernate.cfg.xml")).buildSessionFactory();	
		}catch(Throwable ex) {
			log.error(ex);
			throw new ExceptionInInitializerError(ex);
		}
		
	}
		
	public static SessionFactory getSessionFactory() {
		return factory;
	}

}