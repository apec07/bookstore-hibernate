package idv.cm.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import idv.cm.db.UserVO;

public class TestConnection {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		UserVO user = new UserVO();
		user.setUser("name1");
		user.setEmail("mail1");
		user.setPassword("1234");
		//session.persist(user);
//		session.saveOrUpdate(user);
		session.save(user);
		tx.commit();
		session.close();
		

	}

}
