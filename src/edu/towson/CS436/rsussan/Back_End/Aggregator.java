package edu.towson.CS436.rsussan.Back_End;

/**
 * Invoker uses this to retrieve the actual data needed upon invoker's "execute" calls.
 * 
 * @author Richard Sussan
 *
 */

public class Aggregator {
	private Menu menu = new Menu(0);
	private Orders orders;
	
	public Menu getMenu(){
		return menu;
	}
	
	public Orders getOrders(){
		return orders;
	}
}
