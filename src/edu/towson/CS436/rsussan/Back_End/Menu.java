package edu.towson.CS436.rsussan.Back_End;

/**
 * Simple menu class that holds a static list of menu items to be displayed by the client
 * or traversed through by specific iterators.
 * 
 * @author Richard Sussan
 *
 */

public class Menu {
	private static Menu_Item[] items = new Menu_Item[100];
	
	public Menu(){
		items[0] = new Menu_Item("BBQ Wings (5)", 1, false, 3.99);
		items[1] = new Menu_Item("Spinach Dip", 1, true, 5.99);
		items[2] = new Menu_Item("Loaded Potato Skins", 1, false, 4.99);
		items[3] = new Menu_Item("Crabby Fries", 1, false, 6.99);
		items[4] = new Menu_Item("Crab Pretzel", 1, false, 7.99);
		items[5] = new Menu_Item("Shrimp Salad Wrap", 2, true, 11.99);
		items[6] = new Menu_Item("Maryland Crab Cake", 1, false, 15.99);
		items[7] = new Menu_Item("", 1, false, 4.99);
		items[8] = new Menu_Item("", 1, false, 4.99);
		items[9] = new Menu_Item("", 1, false, 4.99);
		items[10] = new Menu_Item("", 1, false, 4.99);
		items[11] = new Menu_Item("", 1, false, 4.99);
		items[12] = new Menu_Item("", 1, false, 4.99);
		items[13] = new Menu_Item("", 1, false, 4.99);
		items[14] = new Menu_Item("", 1, false, 4.99);
		items[15] = new Menu_Item("", 1, false, 4.99);
		items[16] = new Menu_Item("", 1, false, 4.99);
		items[17] = new Menu_Item("", 1, false, 4.99);
		items[18] = new Menu_Item("", 1, false, 4.99);
		items[19] = new Menu_Item("", 1, false, 4.99);
		items[20] = new Menu_Item("", 1, false, 4.99);
	}
	
	
}
