package edu.towson.CS436.rsussan.Back_End;

/**
 * Invoker uses this to retrieve the actual data needed upon invoker's "execute" calls.
 * 
 * @author Richard Sussan
 *
 */

public class Aggregator {
	private Menu menu = new Menu();
	private Orders orders = new Orders();
	
	public Menu getMenu(){
		return menu;
	}
	
	public void submitOrder(Menu_Item i){
		orders.addItem(i);
	}
	
	public Orders getOrders(){
		return orders;
	}
}
