package edu.towson.CS436.rsussan.Back_End;

/**
 * One specific table's instance of their "check".
 * It holds "menu items" that some specific table orders.
 * 
 * @author Richard Sussan
 *
 */

public class Orders {
	private Menu_Item[] items;
	
	public Orders(){
		items  = new Menu_Item[100];
	}
	
	public void addItem(Menu_Item i){
		int x = 0;
		while(items[x] != null){
			x++;
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
}
