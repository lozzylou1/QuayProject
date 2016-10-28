package Controllers;

import java.io.Serializable;
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

	private static List<Object> basketList = new ArrayList<Object>();


	private double totalPriceOfBasket;

	/**
	 * Gets the basket.
	 * 
	 * @return List<Product>
	 */
	public List<Object> getBasketList()
	{		
		List<Object> copyList = new ArrayList<Object>(basketList);
		return copyList;		
	}

	/**
	 * Adds the specified amount of
	 * the specified product to the 
	 * basket.
	 * 
	 * @param Product
	 */
	public void add(Object product, int numberOfItems)
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
	public double getTotalPrice() 
	{
		double[] price = new double[basketList.size()];
		double total= 0;
		if (price.length != 0)
		{
			for (int i = 0; i < basketList.size(); i++)
			{
				Object product = basketList.get(i);
				price[i] = ((Product) product).getPrice();
			}
			totalPriceOfBasket = DoubleStream.of(price).sum();
			total = totalPriceOfBasket;
		}
		return total;
	}

	/**
	 * Removes all products specified
	 * from the basket.
	 * 
	 * @param Product
	 */
	public void remove(Object product)
	{
		for (Object item : basketList)
		{
			if (((Product) product).getProductName().equals(((Product) item).getProductName()))
			{
				basketList.remove(item);
			}
		}
	}
	
	/**
	 * Empties the basket.
	 * 
	 */
	public void clear()
	{
		basketList.clear();
	}
}
