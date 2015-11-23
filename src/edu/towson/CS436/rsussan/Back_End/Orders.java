package edu.towson.CS436.rsussan.Back_End;

/**
 * One specific table's instance of their "check".
 * It holds "menu items" that some specific table orders.
 * 
 * @author Richard Sussan
 *
 */

import edu.towson.CS436.rsussan.Interfaces.OrderIterator;

public class Orders {
	public static Menu_Item[] items;
	
	public Orders(){
		items  = new Menu_Item[100];
	}
	
	public void addItem(Menu_Item i){
		int x = 0;
		while(x < 99){
			if(items[x] != null) x++;
			else break;
		}
		items[x] = i;
	}
	
	public double getTotal(){
		int x = 0;
		double temp = 0;
		while(items[x] != null){
			temp += items[x].getPrice();
			x++;
		}
		return temp;
	}
	
	public OrderIterator getOrdersIterator(){
		return new AllOrderIterator();
	}
}
