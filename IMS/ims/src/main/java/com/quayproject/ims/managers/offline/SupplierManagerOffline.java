package com.quayproject.ims.managers.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.quayproject.ims.dummydata.InitialData;
import com.quayproject.ims.entities.Supplier;
import com.quayproject.ims.managers.SupplierManager;

@Stateless
@Default
public class SupplierManagerOffline implements SupplierManager {

	
	@Inject
	public InitialData initialData;


	@Override
	public List<Supplier> allSuppliers() {
		return initialData.getSuppliers();
}

}