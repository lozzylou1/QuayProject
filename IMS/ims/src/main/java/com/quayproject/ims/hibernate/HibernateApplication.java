package com.quayproject.ims.hibernate;

//JAVA IMPORTS
import java.util.Collection;
import java.util.List;
import java.util.Properties;

//HIBERNATE IMPORTS
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

//ENTITY IMPORTS
import com.quayproject.ims.entities.Inventory;
import com.quayproject.ims.entities.Product;
import com.quayproject.ims.entities.PurchaseOrder;
import com.quayproject.ims.entities.StaffAccount;
import com.quayproject.ims.entities.Supplier;
import com.quayproject.ims.hibernate.HibernateProduct;
import com.quayproject.ims.hibernate.HibernateStaffAccount;
import com.quayproject.ims.hibernate.HibernateSupplier;
import com.quayproject.ims.hibernate.HibernatePurchaseOrder;

public class HibernateApplication {
	
	/**
	 * Declaring Static Variables
	 */
	
	static Properties props;
	static Configuration cfg;
	static ServiceRegistry serviceRegistry;
	static SessionFactory sessionFactory;
	static Session session;
	static Transaction tx;
	
	
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		HibernateProduct prod = new HibernateProduct();
		HibernateStaffAccount staff = new HibernateStaffAccount();
		HibernatePurchaseOrder purch = new HibernatePurchaseOrder();
		HibernateSupplier supp = new HibernateSupplier();
		HibernateInventory inv = new HibernateInventory();
		
		//Starting the Hibernate Config and Session
		
		start();
		
		/**
		 * For Loops saving all of the objects from the list of entities
		 */
	
		//SUPPLIER FOR LOOP
		
		supp.AddAllSuppliers();
		
		for(Supplier s : supp.getSuppliers())
		{
			session.save(s);
		}
		
		//STAFF ACCOUNT FOR LOOP
		
		staff.AddAllStaff();
		
		for(StaffAccount a : staff.getStaff())
		{
			session.save(a);
		}
		
		//PURCHASE ORDER FOR LOOP
		
		purch.AddAllPurchaseOrders();
		for(PurchaseOrder p : purch.getPurchaseOrders())
		{
			session.save(p);
		}
		
		//PRODUCT FOR LOOP
		
		prod.AddAllProducts();
		for(Product pr : prod.getProds())
		{
			session.save(pr);
		}
		
		//INVENTORY FOR LOOP
		
		inv.AddAllInventory();
		for(Inventory i : inv.getInventory())
		{
			session.save(i);
		}
		
		//Closing the Session and the Factory
		
		session.close();
		sessionFactory.close();		
	}

	
	
	
	public static void start(){
		
		/**
		 * Create a Properties Class Objects and Set Hibernate Properties
		 */
		
		props = new Properties();
		props.setProperty("hibernate.connection.driver_class","com.mysql.jdbc.Driver"); 			//Specify mysql driver class from pom.mysql.jdbc.driver
		props.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/imsdatabase"); 	//Default url for the localhost linked to the database
		props.setProperty("hibernate.connection.username","root"); 									//Default user
		props.setProperty("hibernate.connection.password",""); 										//Default password
		props.setProperty("hibernate.show_sql","true"); 
		props.setProperty("hibernate.hbm2ddl.auto","create"); 										//Hibernate mapping to data definition language
		
		/**
		 * Create Configuration Class Objects
		 */
		
		cfg = new Configuration()
				.addProperties(props)
				.addAnnotatedClass(Supplier.class)
				.addAnnotatedClass(StaffAccount.class)
				.addAnnotatedClass(PurchaseOrder.class)
				.addAnnotatedClass(Product.class)
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
	
	/**
	 * Getters and Setters for Hibernate
	 * @return
	 */

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
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
