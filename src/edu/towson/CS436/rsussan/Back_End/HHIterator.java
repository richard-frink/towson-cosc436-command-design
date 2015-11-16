package edu.towson.CS436.rsussan.Back_End;

/**
 * Iterator for all heart healthy options in a given Menu object (only return heat healthy items)
 * 
 * @author Richard Sussan
 *
 */

import edu.towson.CS436.rsussan.Interfaces.MenuIterator;

public class HHIterator implements MenuIterator {
	private int current = 0;
	
	@Override
	public boolean hasNext() {
		int temp = current;
		while((Menu.items[current] != null)){
			if(((Menu.items)[current]).isHH() == true){
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
