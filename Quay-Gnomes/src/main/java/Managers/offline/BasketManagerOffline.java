package Managers.offline;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import DummyData.InitialData;
import Entities.Product;
import Managers.BasketManager;

@Default
@Stateless
public class BasketManagerOffline implements BasketManager {

	@Inject
	private InitialData initialData;

	public void addProductToBasket(Product p) {

	}

	public void removeItemFromBasket() {

	}

	public void checkoutbasket() {

	}

	public void updateBasket() {

	}

	@Override
	public void persistProduct(Product p) {
		// TODO Auto-generated method stub
		
	}
}
