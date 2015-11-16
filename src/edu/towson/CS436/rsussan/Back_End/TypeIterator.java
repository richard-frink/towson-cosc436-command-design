package edu.towson.CS436.rsussan.Back_End;

/**
 * Iterator for a Menu object that goes through items of a specified type
 * 
 * @author Richard Sussan
 *
 */

import edu.towson.CS436.rsussan.Interfaces.MenuIterator;

public class TypeIterator implements MenuIterator {
	private int type;
	private int current = 0;
	
	public TypeIterator(int t){
		this.type = t;
	}
	
	@Override
	public boolean hasNext() {
		int temp = current;
		while((Menu.items[current] != null)){
			if(((Menu.items)[current]).getType() == type){
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
