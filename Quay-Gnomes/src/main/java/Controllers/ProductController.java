package Controllers;

import java.util.List;
import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import Managers.ProductManager;
import services.SearchService;
import Entities.Product;
import Helpers.PaginationHelper;

@Named("products")
@SessionScoped
public class ProductController implements Serializable {


	@Inject
	private SearchService searchService;
	@Inject
	private ProductManager productManager;
	private Product product;
	private PaginationHelper pagination;
	private int selected;
	private DataModel <Product> dataModel = null;	
	private String term;
	private String type;
	private List<Product> itemsList;

	public String searchByTerm()
	{
		if (itemsList != null)
		{			
			itemsList = searchService.displayListTerm(term);
			pagination = null;
			recreateModel();
		}		
		else if (itemsList == null)
		{
			itemsList = searchService.displayListTerm(term);
			pagination = null;
			recreateModel();
		}
		return "Products";
	}
	
	public String searchByType()
	{
		if (itemsList != null)
		{			
			itemsList = searchService.displayListType(type);
			pagination = null;
			recreateModel();
		}		
		else if (itemsList == null)
		{
			itemsList = searchService.displayListType(type);
			pagination = null;
			recreateModel();
		}
		return "Products";
	}
	
	
	public String searchAllGnomes()
	{
		if (itemsList != null)
		{			
			itemsList = searchService.displayListTerm("Gnomes");
			pagination = null;
			recreateModel();
		}		
		else if (itemsList == null)
		{
			itemsList = searchService.displayListTerm("Gnomes");
			pagination = null;
			recreateModel();
		}
		return "Products";
	}

	public PaginationHelper getPagination () 
	{

		if (pagination == null)
		{
			pagination = new PaginationHelper(10) 
			{
				@Override
				public int getItemsCount()
				{

					return itemsList.size();
				}
				@Override
				public DataModel <Product> createPageDataModel ()
				{
					try
					{
						return new 							
								ListDataModel <Product> (itemsList.subList(getPageFirstItem(),
										getPageFirstItem() + getPageSize()));
					}
					catch (Exception e)
					{
						return new 
								ListDataModel <Product> (itemsList.subList(getPageFirstItem(),
										getItemsCount()));
					}
				}
			};
		}
		return pagination;
	}

	@SuppressWarnings("unchecked")
	public DataModel <Product> getDataModel()
	{
		if (dataModel == null)
		{
			dataModel = getPagination().createPageDataModel();
		}
		return dataModel;
	}

	@SuppressWarnings("unused")
	private void updateCurrentItem()
	{
		int count = itemsList.size();

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
				setProduct(itemsList.subList(selected, selected + 1).get(0));
			}
			catch (Exception e)
			{
				setProduct(itemsList.subList(selected, count).get(0));
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
	
	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	private void recreateModel () {
		dataModel = null;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}



