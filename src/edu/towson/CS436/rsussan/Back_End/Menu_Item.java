package edu.towson.CS436.rsussan.Back_End;

/**
 * Standard menu item that is held by "Menu" objects.
 * 
 * @author Richard Sussan
 *
 */

public class Menu_Item {
	private String name;
	private int type;
	//type is 1 - appetizer. 2 - entree, 3 - side, 4 - dessert
	private boolean HH;
	//HH => heart healthy (is or is not)
	private double price;
	
	public Menu_Item(String name, int type, boolean heartHealthy, double price){
		this.name = name;
		this.type = type;
		HH = heartHealthy;
		this.price = price;
	}
	
	public String getName(){
		return name;
	}
	
	public int getType(){
		return type;
	}
	
	public boolean isHH(){
		return HH;
	}
	
	public double getPrice(){
		return price;
	}
}
