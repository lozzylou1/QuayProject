package Managers.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import Entities.Address;
import Managers.AddressManager;

@Stateless
@Default
public class AddressManagerOffline implements AddressManager {

	@Override
	public void persistAddress(Address a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void persistAddresses(List<Address> a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Address> getAddresses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createAddress(Address a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAddress(Address a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Address> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
