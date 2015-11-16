package edu.towson.CS436.rsussan.Back_End;

/**
 * Iterator for an entire Menu object (goes through all items)
 * 
 * @author Richard Sussan
 *
 */

import edu.towson.CS436.rsussan.Interfaces.MenuIterator;

public class AllItemsIterator implements MenuIterator{
    private int current = 0;
    
    @Override
    public boolean hasNext(){
        if((Menu.items).length == current){
            return false;
        }
        else{
            if((Menu.items)[current + 1] != null){
            	return true;
            }
            return false;
        }
    }
    
    @Override
    public Menu_Item getItem(){
        return (Menu.items)[current];
    }
    
    @Override
    public void next(){
        if(this.hasNext()){
            current++;
        }
        else{
            System.out.println("ERROR: There are no more available items");
        }
    }
}
