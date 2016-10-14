package Managers;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import DummyData.InitialData;
import Entities.Supplier;

@Stateless
@Default
public class SupplierManagerOffline implements SupplierManager{
	
	@Inject
	private InitialData initialData;

	@Override
	public void persistSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		initialData.addSupplier(supplier);
	}

	@Override
	public void persistSuppliers(List<Supplier> supplier) {
		// TODO Auto-generated method stub
		initialData.getSuppliers();
	}

	@Override
	public Supplier findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Supplier findByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Supplier> getSuppliers() {
		// TODO Auto-generated method stub
		return initialData.getSuppliers();
	}

	@Override
	public void createSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		
	}
	

}
