package com.quayproject.ims.hibernate;

//JAVA IMPORTS
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
				.addAnnotatedClass(Supplier.class)
				.addAnnotatedClass(StaffAccount.class)
				.addAnnotatedClass(PurchaseOrder.class)
				.addAnnotatedClass(Product.class)
				.addAnnotatedClass(Inventory.class);
		
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
		
		/**
		 * Creating the Supplier object
		 * Populating a list with the Supplier objects
		 */
		
		//SUPPLIERS
		
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
		 * Creating a list to hold all of the supplier objects
		 * Adding the supplier objects to the list
		 */
		
		///////////////////////////////////////////////////////
		Query suppQuery = session.createQuery("from Supplier");//
		List<Supplier> supplierList = suppQuery.list();		   //
															   //	SUPPLIER LIST
		supplierList.add(supp1);							   //
		supplierList.add(supp2);							   //
		supplierList.add(supp3);							   //
		///////////////////////////////////////////////////////
		
		/**
		 * Creating the Staff Account object
		 * Populating a list with the Staff Account objects
		 */
		
		//STAFF ACCOUNT
		
		////////////////////////////////////////////////
		StaffAccount stf1 = new StaffAccount();			//
		stf1.setUserName("Admin");						//	STAFF ACCOUNT 1
		stf1.setPassword("password");					//
		////////////////////////////////////////////////

		////////////////////////////////////////////////
		StaffAccount stf2 = new StaffAccount();			//
		stf2.setUserName("standardUser");				//	STAFF ACCOUNT 2
		stf2.setPassword("standardPassword");			//
		////////////////////////////////////////////////
		
		////////////////////////////////////////////////////////////
		Query staffQuery = session.createQuery("from StaffAccount");//
		List<StaffAccount> staffAccountList = staffQuery.list();	//
				   											        //	STAFF LIST
		staffAccountList.add(stf1);							    	//
		staffAccountList.add(stf2);							    	//						  
		////////////////////////////////////////////////////////////

		/**
		 * Creating the PurchaseOrder object
		 * Populating a list with the PurchaseOrder objects
		 */
		
		//PURCHASE ORDERS
		
		////////////////////////////////////////////////////////////
		PurchaseOrder purch1 = new PurchaseOrder();		            //
		purch1.setSupplierName("Gnomes 'R' Us");			        //
		purch1.setProducts("Harry Potter Gnome");					//	PURCHASE ORDER 1	
		purch1.setTotalPrice(549.99); 				            	//	
		////////////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////
		Query purchQuery = session.createQuery("from PurchaseOrder");//
		List<PurchaseOrder> purchaseOrderList = purchQuery.list();	 //
				        											 //	 PURCHASE ORDER LIST
		purchaseOrderList.add(purch1);							     //						  
		/////////////////////////////////////////////////////////////
		
		//PRODUCTS
		
		Product prod1 = new Product();
		
		
		/**
		 * Submit objects to Hibernate
		 * Close session and session factory
		 */
			
		/**
		 * For loop to add all of the objects to the database at once
		 */
		
		//SUPPLIER FOR LOOP
		
		for(Supplier s : supplierList)
		{
			session.save(s);
		}
		
		//STAFF ACCOUNT FOR LOOP
		
		for(StaffAccount a : staffAccountList)
		{
			session.save(a);
		}
		
		//PURCHASE ORDER FOR LOOP
		
		for(PurchaseOrder p : purchaseOrderList)
		{
			session.save(p);
		}
		
		session.close();
		sessionFactory.close();		`
	}

}
