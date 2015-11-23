package edu.towson.CS436.rsussan.Back_End;

/**
 * System Interface.
 * Works out everything that the user interface needs done.
 * All methods return an array of strings to the UI.
 * 
 * (All static methods maybe???)
 * 
 * @author Richard Sussan
 *
 */

import edu.towson.CS436.rsussan.Interfaces.*;

public class System_Interface {
	private static Invoker invoker = new Invoker(new Aggregator());
	
	public static String[] getMenu(){
		Menu menu = invoker.getMenu();
		MenuIterator itr = menu.getMenuIterator();
		
		String[] str = new String[100];
		int x = 0;
		do {
			if(x != 0) itr.next();
			Menu_Item i = itr.getItem();
			str[x] = String.format("%2d - %-31s $%.2f", x + 1, i.getName(), i.getPrice());
			x++;
		} while(itr.hasNext());
		return str;
	}
	
	public static String[] submitOrder(int[] orders){
		invoker.submitOrders(orders);
		String[] str = new String[10];
		str[0] = "Order Successfully submitted!";
		return str;
	}
	
	public static String[] getOrder(){
		Orders order = invoker.getOrders();
		OrderIterator itr = order.getOrdersIterator();
		
		String[] str = new String[100];
		int x = 0;
		do {
			if(x != 0) itr.next();
			Menu_Item i = itr.getItem();
			str[x] = String.format("%2d - %-31s $%.2f", x + 1, i.getName(), i.getPrice());
			x++;
		} while(itr.hasNext());
		return str;
	}
	
	/**
	 * 
	 * THIS IS TO BE IMPLMENTED AFTER INITAL CODE DEADLINE
	 * 
	public static String[] getHHMenu(){
		Menu menu = invoker.getMenu();
		MenuIterator itr = menu.getHHIterator();
		
		String[] str = new String[100];
		int x = 0;
		do {
			if(x != 0) itr.next();
			Menu_Item i = itr.getItem();
			str[x] = String.format("%-31s $%.2f", i.getName(), i.getPrice());
			x++;
		} while(itr.hasNext());
		return str;
	}
	
	public static String[] getPriceMenu(double price){
		Menu menu = invoker.getMenu();
		MenuIterator itr = menu.getPriceIterator(price);
		
		String[] str = new String[100];
		int x = 0;
		do {
			if(x != 0) itr.next();
			Menu_Item i = itr.getItem();
			str[x] = String.format("%-31s $%.2f", i.getName(), i.getPrice());
			x++;
		} while(itr.hasNext());
		return str;
	}
	
	*/
}
