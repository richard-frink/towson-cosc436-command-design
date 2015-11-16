package edu.towson.CS436.rsussan.Back_End;

/**
 * Simple menu class that holds a static list of menu items to be displayed by the client
 * or traversed through by specific iterators.
 * 
 * @author Richard Sussan
 *
 */

import edu.towson.CS436.rsussan.Interfaces.MenuIterator;

public class Menu {
	public static Menu_Item[] items = new Menu_Item[100];
	
	public Menu(){} // if it is not called with an integer in the parameters than the menu will be empty
	
	public Menu(int premade){
		items[0] = new Menu_Item("BBQ Wings (5)", 1, false, 3.99);
		items[1] = new Menu_Item("Spinach Dip", 1, true, 5.99);
		items[2] = new Menu_Item("Loaded Potato Skins", 1, false, 4.99);
		items[3] = new Menu_Item("Crabby Fries", 1, false, 6.99);
		items[4] = new Menu_Item("Crab Pretzel", 1, false, 7.99);
		items[5] = new Menu_Item("Shrimp Salad Wrap", 2, true, 11.99);
		items[6] = new Menu_Item("Maryland Crab Cake", 2, false, 15.99);
		items[7] = new Menu_Item("Garden Burger", 2, true, 9.99);
		items[8] = new Menu_Item("Bacon Cheeseburger", 2, false, 10.99);
		items[9] = new Menu_Item("Greek Salad", 2, false, 9.99);
		items[10] = new Menu_Item("Large Nachos Supreme ", 2, false, 10.99);
		items[11] = new Menu_Item("Grilled Chicken Club", 2, true, 10.99);
		items[12] = new Menu_Item("Cheese Tortelinni w/ Pork", 2, false, 4.99);
		items[13] = new Menu_Item("Oreo Sundae", 3, false, 6.99);
		items[14] = new Menu_Item("Fresh Strawberries", 3, true, 3.99);
		items[15] = new Menu_Item("Churros", 3, false, 4.99);
		items[16] = new Menu_Item("Frech Fries", 4, false, 3.49);
		items[17] = new Menu_Item("Steamed Broccoli", 4, true, 2.99);
		items[19] = new Menu_Item("Green Beans", 4, true, 2.99);
		items[20] = new Menu_Item("Mashed Potatoes", 4, false, 3.49);
	}
	
	public void addItem(Menu_Item i){
		int x = 0;
		while(items[x] != null){
			x++;
		}
		items[x] = i;
	}
	
	public MenuIterator getMenuIterator(){
		return new AllItemsIterator();
	}
	
	public MenuIterator getHHIterator(){
		return new HHIterator();
	}
	
	public MenuIterator getPriceIterator(double p){
		return new PriceIterator(p);
	}
	
	public MenuIterator getTypeIterator(int t){
		return new TypeIterator(t);
	}
}
