package edu.towson.CS436.rsussan.Interfaces;

/**
 * Iterator interface that will be used for the menu class
 * 
 * @author Richard Sussan
 *
 */

import edu.towson.CS436.rsussan.Back_End.Menu_Item;

public interface MenuIterator {
	int current = 0;
	
	public boolean hasNext();
	
	public Menu_Item getItem();
	
	public void next();
}
