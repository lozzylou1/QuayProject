package Controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import Managers.ProductManager;
import Entities.Product;
import Helpers.PaginationHelper;

@Named("products")
@SessionScoped
public class ProductController implements Serializable
{

	@Inject
	private ProductManager productManager;
	private Product product;
	private PaginationHelper pagination;
	private int selected;
	private DataModel <Product> dataModel = null;

	private void recreateModel () {
		dataModel = null;
	}
	
	/**
	 * If pagination is null, implements pagination
	 * By finding a list of all products, then 
	 * building pagination based on page size in getPageSize()
	 * 
	 * @return PagioationHelper
	 */
	public PaginationHelper getPagination () 
	{
		if (pagination == null)
		{
			pagination = new PaginationHelper(10) 
			{
				@Override
				public int getItemsCount()
				{

					return productManager.findAll().size();
				}
				@Override
				public DataModel <Product> createPageDataModel ()
				{
					try
					{
						return new 							
								ListDataModel <Product> (productManager.findAll().subList(getPageFirstItem(),
										getPageFirstItem() + getPageSize()));
					}
					catch (Exception e)
					{
						return new 
								ListDataModel <Product> (productManager.findAll().subList(getPageFirstItem(),
										getItemsCount()));
					}
				}
			};
		}
		return pagination;
	}

	
	@SuppressWarnings("unchecked")
	/**
	 * Gets the data model. Called 
	 * 
	 * @return dataModel
	 */
	public DataModel <Product> getDataModel()
	{
		if (dataModel == null)
		{
			dataModel = getPagination().createPageDataModel();
		}
		return dataModel;
	}
	
	
	@SuppressWarnings("unused")
	/**
	 * 
	 */
	private void updateCurrentItem()
	{
		int count = productManager.findAll().size();

		if (selected >= count)
		{
			selected = count - 1;

			if (pagination.getPageFirstItem() >= count)
			{
				pagination.previousPage();
			}
		}

		if (selected >= 0)
		{
			try
			{
				setProduct(productManager.findAll().subList(selected, selected + 1).get(0));
			}
			catch (Exception e)
			{
				setProduct(productManager.findAll().subList(selected, count).get(0));
			}
		}
	}

	public String next()
	{
		getPagination().nextPage();
		recreateModel();
		return "Products";
	}

	public String previous()
	{
		getPagination().previousPage();
		recreateModel();
		return "Products";
	}

	public String view(int id) {
		product = productManager.findById(id);
		return "Products";
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product){
		this.product = product;
	}
}
