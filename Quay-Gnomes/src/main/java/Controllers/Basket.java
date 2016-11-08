package Controllers;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

import javax.ejb.Stateful;

import Entities.Product;

/**
 * 
 * 
 * @author Ryan
 *
 */

@SuppressWarnings("serial")
@Stateful
public final class Basket implements Serializable {

	private static List<Product> basketList = new ArrayList<Product>();


	private double totalPriceOfBasket;
	

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
	 * @param Product
	 */
	public void add(Product product, int numberOfItems)
	{	
		for (int i = 0; i < numberOfItems; i++ )
		{
			basketList.add(product);
		}
	}

	/**
	 * Gets the total price of all the
	 * combined objects in the basket.
	 * 
	 * @return double
	 */
	public String getTotalPrice() 
	{
		double[] price = new double[basketList.size()];
		String total = "";
		if (price.length != 0)
		{
			for (int i = 0; i < basketList.size(); i++)
			{
				Object product = basketList.get(i);
				price[i] =  new Double(((Product) product).getPrice());
			}
			totalPriceOfBasket = DoubleStream.of(price).sum();
			
			DecimalFormat numberFormat = new DecimalFormat("#.00");
			total = numberFormat.format(totalPriceOfBasket);
		}
		return total;
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
