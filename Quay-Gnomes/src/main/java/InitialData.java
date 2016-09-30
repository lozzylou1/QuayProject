import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

@Singleton
public class InitialData {
	
	private ArrayList<Supplier> suppliers =
			new ArrayList<Supplier>();
	
	/** Creates the initial offline data*/
	public InitialData()
	{
		suppliers.add(new Supplier("Super Gnome Supplies", "+447654893756", 1));
		suppliers.add(new Supplier("Jaccuzzi 'R' Us", "+44769435851", 2));
	}
	
	/** Returns the dummy list of suppliers */
	public List<Supplier> getSuppliers()
	{
		return suppliers;		
	}
	
	/** Add a supplier to the dummy list of suppliers*/
	public void addSupplier(Supplier supplier)
	{
		suppliers.add(supplier);
	}
	
	/** Set the dummy list of suppliers*/
	public void setSuppliers(ArrayList<Supplier> suppliers)
	{
		this.suppliers = suppliers;
	}

}
