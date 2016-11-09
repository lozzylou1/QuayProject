package Controllers;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.DoubleStream;

import javax.ejb.Stateful;
import javax.inject.Named;

import Entities.ItemInBasket;
import Entities.Product;

/**
 * 
 * 
 * @author Ryan
 *
 */

@SuppressWarnings("serial")
@Named("basket")
@Stateful
public final class Basket implements Serializable {

	private static List<Product> basketList = new ArrayList<Product>();
	private static HashMap<Product, Integer> list = new HashMap<Product, Integer>();



	private float totalPriceOfBasket;
	ItemInBasket item;

	
	public static HashMap<Product, Integer> getList() {
		return list;
	}

	public static void setList(HashMap<Product, Integer> list) {
		Basket.list = list;
	}
	

	/**
	 * Gets the basket.
	 * 
	 * @return List<Product>
	 */
	public List<Product> getBasketList()
	{		

		List<Product> copyList = new ArrayList<Product>(basketList);

		return copyList;		
	}

	/**
	 * Adds the specified amount of
	 * the specified product to the 
	 * basket.
	 * 
	 * @param product
	 * @return 
	 * 
	 */
	public void add(Product product, int numberOfItems)
	{	
		
		
		for (int i = 0; i < numberOfItems; i++ )
		{
			basketList.add(product);
		}
	}

	/**
	 * 
	 * @param product
	 * @param numOfItems
	 * @return list
	 */
	public HashMap<Product, Integer> addFrontEnd(Product product, Integer numOfItems){
		list.put(product, numOfItems);
		System.out.println("HASHMAP" + list.toString());
		return list;
	}
	
	/**
	 * 
	 * @param product
	 * @param numOfItems
	 * @return list
	 */
	public HashMap<Product, Integer> decrementQuantity(Product product, Integer numOfItems){
		list.put(product, numOfItems);
		System.out.println("HASHMAP" + list.toString());
		return list;
	}
	
	/**
	 * 
	 * @param product
	 * @param numOfItems
	 * @return list
	 */
	public HashMap<Product, Integer> incrementQuantity(Product product, Integer numOfItems){
		list.put(product, numOfItems);
		System.out.println("HASHMAP" + list.toString());
		return list;
	}
	
	
	
	
	
	
	/**
	 * Gets the total price of all the
	 * combined objects in the basket.
	 * 
	 * @return double
	 */
	public float getTotalPrice() 
	{		
		float totalPrice = 0;
		for(Map.Entry<Product, Integer> entry : list.entrySet()){
			
			float price1 = entry.getKey().getPrice();
			int quantity = entry.getValue();
			
			float midprice = price1*quantity;
			
			totalPrice += midprice;
			
		}
		
		return totalPrice;

	}

	/**

	 * Removes all products specified
	 * from the basket.
	 * 
	 * @param Product
	 */
	public void remove(Product product)
	{
		for (Product item : basketList)
		{
			if (product.getProductName().equals(item.getProductName()))
			{
				basketList.remove(item);
			}
		}
	}
	
	/**
	 * Empties the basket.
	 * 
	 * @param product
	 */
	public void removeItemFromBasket(Product product)
	{
		
		list.remove(product);
//		for (int i =0; i < basketList.size(); i++ )
//		{
//			if (product.getProductName().equals(basketList.get(i).getProductName()))
//			{
//				basketList.remove(i);
//			}
//		}
	}
	
	/**
	 * Clears the basket entirely

	 */
	public void clear()
	{
		list.clear();
	}


	public float getTotalPriceOfBasket() {
		return totalPriceOfBasket;
	}

	public void setTotalPriceOfBasket(float totalPriceOfBasket) {
		this.totalPriceOfBasket = totalPriceOfBasket;
	}

	
}
