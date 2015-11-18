package edu.towson.CS436.rsussan.Back_End;

/**
 * Stores all ordered items, in form of a list or a menu object, i'm not quite sure yet.....
 * 
 * @author Richard Sussan
 *
 */

public class Tab {
	private Menu_Item[] items;
	
	public Tab(){
		items = new Menu_Item[100];
	}
	
	public Menu_Item[] getTab(){
		return items;
	}
	
	public void addItem(Menu_Item i){
		int x = 0;
		while(x < 100){
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
}
