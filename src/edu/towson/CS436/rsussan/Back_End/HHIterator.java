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
	
	public HHIterator(){
    	if(((Menu.items)[current]).isHH() == false){
    		this.next();
    	}
	}
	
	@Override
	public boolean hasNext() {
		int temp = current;
		while((Menu.items[temp + 1] != null)){
			temp++;
			if(((Menu.items)[temp]).isHH() == true){
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
				if(((Menu.items)[current]).isHH() == true){
					break;
				}
			}
        }
        else{
            System.out.println("ERROR: There are no more available heart healthy items");
        }
	}
}
