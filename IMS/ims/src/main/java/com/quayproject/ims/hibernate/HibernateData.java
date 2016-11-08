package com.quayproject.ims.hibernate;

import java.util.ArrayList;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.inject.Singleton;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.quayproject.ims.entities.Inventory;

@Startup
@Singleton
public class HibernateData {
	

	 private static Properties props;
	 private static Configuration cfg;
	 private static ServiceRegistry serviceRegistry;
	 private static SessionFactory sessionFactory;
	 private static Session session;
	 private static Transaction tx;
	

	
	/**
	 * Creates the initial offline data
	 */

	public static void setUpData()
	{
		/**
		 * Create a Properties Class Objects and Set Hibernate Properties
		 */
		props = new Properties();
		props.setProperty("hibernate.connection.driver_class","com.mysql.jdbc.Driver"); 			//Specify mysql driver class from pom.mysql.jdbc.driver
		props.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/imsdatabase"); 	//Default url for the localhost linked to the database
		props.setProperty("hibernate.connection.username","root"); 									//Default user
		props.setProperty("hibernate.connection.password",""); 										//Default password
		props.setProperty("hibernate.show_sql","true"); 
		props.setProperty("hibernate.hbm2ddl.auto","update"); 										//Hibernate mapping to data definition language
		
		/**
		 * Create Configuration Class Objects
		 */
		
		cfg = new Configuration()
				.addProperties(props)
				/*.addAnnotatedClass(Supplier.class)
				.addAnnotatedClass(StaffAccount.class)
				.addAnnotatedClass(PurchaseOrder.class)
				.addAnnotatedClass(Product.class)*/
				.addAnnotatedClass(Inventory.class);
		
		
		
		/**
		 * Create Service Registry Objects
		 */
		
		serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(cfg.getProperties()).build();
		
		/**
		 * Create a session Factory object
		 */
		
		sessionFactory = cfg.buildSessionFactory(serviceRegistry);
		
		/**
		 * Create/open Session
		 */
		
		session = sessionFactory.openSession();
		
		/**
		 * Begin a transaction
		 */
		
		tx = session.beginTransaction();
		
		
	}
	
	
	
	
	public void open(){
	
	}
	
	
	public void close(){
		session.close();
		sessionFactory.close();		
	}
	
	
	/**
	 * Getters and Setters for Hibernate
	 * @return
	 */

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		HibernateData.props = props;
	}

	public Configuration getCfg() {
		return cfg;
	}

	public void setCfg(Configuration cfg) {
		this.cfg = cfg;
	}

	public ServiceRegistry getServiceRegistry() {
		return serviceRegistry;
	}

	public void setServiceRegistry(ServiceRegistry serviceRegistry) {
		this.serviceRegistry = serviceRegistry;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public static Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Transaction getTx() {
		return tx;
	}

	public void setTx(Transaction tx) {
		this.tx = tx;
	}
	
	
	
	
	
	
	

}
