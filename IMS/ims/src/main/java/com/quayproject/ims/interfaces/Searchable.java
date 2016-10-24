package com.quayproject.ims.interfaces;

import java.util.List;

public interface Searchable {

	
/**
 * return an object by name
 * 
 * @return
 */
public  List<Object>  searchByName();

/**
 * return object by id
 * 
 * @return
 */
 public Object searchById();
	
 
/**
 * return object by term
 * 
 * @return
 */
 public Object searchByTerm();	
				
	
}
