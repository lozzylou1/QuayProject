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
	public void browseByRating() {
		// TODO Auto-generated method stub

	}

	@Override
	public void browseByCategory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void browseByPrice() {
		// TODO Auto-generated method stub

	}

	@Override
	public void browseByColour() {
		// TODO Auto-generated method stub

	}

	@Override
	public void browseByReviews() {
		// TODO Auto-generated method stub

	}
}
