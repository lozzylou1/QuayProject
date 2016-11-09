package com.quayproject.ims.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

import javax.ejb.Stateful;

import com.quayproject.ims.entities.Product;

@SuppressWarnings("serial")
@Stateful
public final class Basket implements Serializable {

	private static List<Product> basketList = new ArrayList<Product>();


	private double totalPriceOfBasket;

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
	 */
	public void add(Product product, int numberOfItems)
	{	
		for (int i = 0; i < numberOfItems; i++ )
		{
			basketList.add(product);
		}
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
			total = Math.round(totalPriceOfBasket * 100.0) / 100.0;
		}
		return   total;
	}

	
	/**
	 * 
	 * @param product
	 */
	public void remove(Product product)
	{
		for (int i = 0; i < basketList.size(); i++)
		{
			if (product.getProductName().equals(basketList.get(i).getProductName()))
			{
				basketList.remove(i);
				break;
			}
		}
	}
	
	public void clear()
	{
		basketList.clear();
	}
}
