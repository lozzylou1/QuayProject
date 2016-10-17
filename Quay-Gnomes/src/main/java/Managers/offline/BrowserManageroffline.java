package Managers.offline;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import DummyData.InitialData;
import Managers.BrowserManager;

@Default
@Stateless
public class BrowserManageroffline implements BrowserManager {

	@Inject
	private InitialData initialData;

	@Override
	public void searchByRating() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchByCategory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchByPrice() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchByColour() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchByReviews() {
		// TODO Auto-generated method stub

	}
}
