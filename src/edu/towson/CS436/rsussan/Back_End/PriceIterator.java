package edu.towson.CS436.rsussan.Back_End;

/**
 * Iterator for a Menu object that goes through items under or equal to a given price
 * 
 * @author Richard Sussan
 *
 */

import edu.towson.CS436.rsussan.Interfaces.MenuIterator;

public class PriceIterator implements MenuIterator {
	private double price;
	private int current = 0;
	
	public PriceIterator(double p){
		this.price = p;
		if(((Menu.items)[current]).getPrice() <= p){
    		this.next();
    	}
	}
	
	@Override
	public boolean hasNext() {
		int temp = current;
		while((Menu.items[temp + 1] != null)){
			temp++;
			if(((Menu.items)[temp]).getPrice() <= price){
				return true;
			}
		}
		return false;
	}

	@Override
	public Menu_Item getItem() {
		return (Menu.items)[current];
	}

	@Override
	public void next() {
		if(this.hasNext()){
			while((Menu.items[current + 1] != null)){
				current++;
				if(((Menu.items)[current]).getPrice() <= price){
					break;
				}
			}
		}
        else{
            System.out.println("ERROR: There are no more available items under $" + price);
        }
	}
}
