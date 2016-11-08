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

import Entities.ItemInBasket;
import Entities.Product;

@SuppressWarnings("serial")
@Stateful
public final class Basket implements Serializable {

	private static List<Product> basketList = new ArrayList<Product>();
	private static HashMap<Product, Integer> list = new HashMap<Product, Integer>();



	private double totalPriceOfBasket;
	ItemInBasket item;

	
	public static HashMap<Product, Integer> getList() {
		return list;
	}

	public static void setList(HashMap<Product, Integer> list) {
		Basket.list = list;
	}

	/**
	 * Gets a copy of the basket list and returns it
	 * 
	 * @return List<Product>
	 */
	public List<Product> getBasketList()
	{		
		List<Product> copyList = new ArrayList<Product>(basketList);		
		return copyList;		
	}

	/**
	 * Adds an Item to the basket
	 * 
	 * @param product
	 * @return 
	 */
/*	public void add(Product product, int numberOfItems)
	{	
		
		
		for (int i = 0; i < numberOfItems; i++ )
		{
			basketList.add(product);
		}
	}*/

	
	public HashMap<Product, Integer> addFrontEnd(Product product, Integer numOfItems){
		list.put(product, numOfItems);
		System.out.println("HASHMAP" + list.toString());
		return list;
	}
	
	
	
	
	/**
	 * Gets the total price of the basket
	 * 
	 * @return the totalPrice
	 */
	public double getTotalPrice() 
	{
		double[] price = new double[basketList.size()];
		double total= 0;
		if (price.length != 0)
		{
			for (int i = 0; i < basketList.size(); i++)
			{
				Product product = basketList.get(i);
				price[i] = product.getPrice();
			}
			totalPriceOfBasket = DoubleStream.of(price).sum();
			total = totalPriceOfBasket;
		}
		
		
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
	 * Remove an item from the basket
	 * 
	 * @param product
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
	 * Remove an item from the basket
	 * 
	 * @param product
	 */
	public void removeItemFromBasket(Product product)
	{
		
		
		for (int i =0; i < basketList.size(); i++ )
		{
			if (product.getProductName().equals(basketList.get(i).getProductName()))
			{
				basketList.remove(i);
			}
		}
	}
	
	/**
	 * Clears the basket entirely
	 */
	public void clear()
	{
		basketList.clear();
	}
}
