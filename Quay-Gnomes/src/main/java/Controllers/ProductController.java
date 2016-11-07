package Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import Managers.ProductManager;
import services.SearchService;
import Entities.Product;
import Helpers.PaginationHelper;

@SuppressWarnings("serial")
@Named("products")
@SessionScoped
public class ProductController implements Serializable {


	@Inject
	private SearchService searchService;
	@Inject
	private ProductManager productManager;
	@Inject
	private Basket basket;
	
	private Product product;
	private PaginationHelper pagination;
	private int selected;
	private DataModel <Product> dataModel = null;
	private DataModel <Product> basketDataModel = null;
	private String term;
	private String type;
	private String size;
	private List<Product> itemsList;
	private List<Product> basketList;
	private String action;

	/**
	 * Search Products by Term
	 * 
	 * @return String Products
	 */
	public String searchByTerm()
	{
		
		itemsList = searchService.displayListTerm(term);
//		System.out.println(">>>>>>>>>>>>> searchbyterm");
		pagination = null;
		recreateModel();
		//getDataModel();
		return "Products";
	}	
	/**
	 * Search Products by Type
	 * 
	 * @return String Products
	 */
	public String searchByType(String type)
	{	
		pagination = null;
		recreateModel();
//		System.out.println(">>>>>>>>>>>>> searchbytype" + type);
		itemsList = searchService.displayListType(type);
		//System.out.println(">>>>>>>>>>>>>" + itemsList.size());
		pagination = null;
		recreateModel();
		//getDataModel();
		return "Products";		
	}
	
	
	
	/**
	 * Returns the user to the products page
	 * so that the page displays the appropriate products
	 * 
	 * @return String "Products"
	 */
	public String searchBySize(String size)
	{
		pagination = null;
		recreateModel();	
//		System.out.println(">>>>>>>>>>>>> searchbysize" + size);
		itemsList = searchService.displayListSize(size);
		//pagination = null;
		//recreateModel();
		getDataModel();
		return "Products";
	}
	
	
	
	public String searchByPrice(int price){
		pagination = null;
		recreateModel();
//		System.out.println(">>>>>>>>>>>>> searchbyprice" + price);
		itemsList = searchService.displayListPrice(price);
		//pagination = null;
		//recreateModel();
		//getDataModel();
		return "Products";
				
	}

	
	public String getAllProducts(){
		
		pagination = null;
		recreateModel();	
		
//		System.out.println(">>>>>>>>>>>>> getAllProducts");
		itemsList = searchService.displayList();
		pagination = null;
		recreateModel();
		getDataModel();
		return "Products";
				
	}
	
	/**
	 * If pagination is null, implements pagination
	 * By finding a list of all products, then 
	 * building pagination based on page size in getPageSize()
	 * 
	 * @return PagioationHelper
	 */
	public PaginationHelper getPagination() 
	{

		if (pagination == null)
		{
			pagination = new PaginationHelper(12) 
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
	
	public void setDataModel(ArrayList<Product> model){
		dataModel.setWrappedData(model);
	}
	
	
	@SuppressWarnings("unused")
	/**
	 * 
	 */
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
	
	

	public String view() {
		product = null;
		product = productManager.findById(new Integer(action));
		return "ProductDet.xhtml";
	}

	public Product getProduct() {
		return product;
	}

	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
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
	
	/**
	 * Get the size from appropriate checkbox
	 * 
	 * @return String size
	 */
	public String getSize() {
		return size;
	}
	
	/**
	 * Set the size
	 * 
	 * @param Sttring size
	 */
	public void setSize(String size) {
		this.size = size;
	}
	
	/**
	 * Adds the selected item to the basket
	 * 
	 * 
	 */
	public String addItemToBasket() {
		basket.add(product, 1);
		System.out.println(product.getProductName());
		return "ProductDet";
	}
	
	public String removeItemFromBasket() {
		System.out.println(action);
		Product productToRemove = searchService.findById(new Integer(action));
		System.out.println(productToRemove);
		basket.removeItemFromBasket(productToRemove);
		return "Basket";
	}
	
	/**
	 * Gets the total price of all the items
	 * in the basket
	 * @return double totalPrice
	 */
	public double getBasketTotalPrice()
	{
		return basket.getTotalPrice();
		
		
	}
	
	/**
	 * Clears the basket of all added itemsS
	 */
	public void clearBasket()
	{
		basket.clear();
	}
	
	public DataModel <Product> createBasketPageDataModel ()
	{
		basketDataModel = null;
		try
		{
			return new 							
					ListDataModel <Product> (basket.getBasketList());
		}
		catch (Exception e)
		{
			return new 
					ListDataModel <Product> (basket.getBasketList());
		}
	}
	
	
	
	
	public DataModel<Product> getBasketDataModel() {
		basketDataModel = createBasketPageDataModel();
		return basketDataModel;
	}
	
	public void setBasketDataModel(DataModel<Product> basketDataModel) {
		this.basketDataModel = basketDataModel;
	}
	
	
	
	

}



