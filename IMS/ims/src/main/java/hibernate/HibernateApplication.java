package hibernate;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import com.quayproject.ims.entities.Supplier;

public class HibernateApplication {
	
	public static void main(String[] args) {
		
		
		/**
		 * Create a Properties Class Objects and Set Hibernate Properties
		 */
		Properties props = new Properties();
		props.setProperty("hibernate.connection.driver_class","com.mysql.jdbc.Driver"); 			//Specify mysql driver class from pom.mysql.jdbc.driver
		props.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/imsdatabase"); 	//Default url for the localhost linked to the database
		props.setProperty("hibernate.connection.username","root"); 									//Default user
		props.setProperty("hibernate.connection.password",""); 										//Default password
		props.setProperty("hibernate.show_sql","true"); 
		props.setProperty("hibernate.hbm2ddl.auto","create"); 										//Hibernate mapping to data definition language
		
		/**
		 * Create Configuration Class Objects
		 */
		Configuration cfg = new Configuration()
				.addProperties(props)
				.addAnnotatedClass(Supplier.class);
		
		/**
		 * Create Service Registry Objects
		 */
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(cfg.getProperties()).build();
		
		/**
		 * Create a session Factory object
		 */
		SessionFactory sessionFactory = cfg.buildSessionFactory(serviceRegistry);
		
		/**
		 * Create/open Session
		 */
		Session session = sessionFactory.openSession();
		
		/**
		 * Begin a transaction
		 */
		Transaction tx = session.beginTransaction();
		
		/**
		 * Creating objects from classes
		 */
		
		////////////////////////////////////////////////
		Supplier supp1 = new Supplier();				//
		supp1.setSupplierName("Gnomes 'R' Us");			//	SUPPLIER 1
		supp1.setContactNumber("07787998558");			//
		////////////////////////////////////////////////
		
		////////////////////////////////////////////////
		Supplier supp2 = new Supplier();				//
		supp2.setSupplierName("Wholesale Garden Goods");//	SUPPLIER 2
		supp2.setContactNumber("07745986332");			//
		////////////////////////////////////////////////
		
		////////////////////////////////////////////////
		Supplier supp3 = new Supplier();				//
		supp3.setSupplierName("Tubs For You");			//	SUPPLIER 3
		supp3.setContactNumber("14454698552");			//
		////////////////////////////////////////////////

		
		/**
		 * Submit objects to Hibernate
		 * Close session and session factory
		 */
		
		session.save(supp1);
		session.save(supp2);
		session.save(supp3);
		session.close();
		sessionFactory.close();
		
	}

}
