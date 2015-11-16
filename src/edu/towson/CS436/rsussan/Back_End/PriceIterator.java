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
	}
	
	@Override
	public boolean hasNext() {
		int temp = current;
		while((Menu.items[current] != null)){
			if(((Menu.items)[current]).getPrice() <= price){
				return true;
			}
			current++;
		}
		current = temp;
		return false;
	}

	@Override
	public Menu_Item getItem() {
		return (Menu.items)[current];
	}

	@Override
	public void next() {
		if(this.hasNext()){
			current++;
		}
        else{
            System.out.println("ERROR: There are no more available items");
        }
	}
}
