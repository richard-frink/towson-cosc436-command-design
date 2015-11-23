package edu.towson.CS436.rsussan.Back_End;

/**
 * Iterator for an entire Orders object (goes through all items)
 * 
 * @author Richard Sussan
 *
 */

import edu.towson.CS436.rsussan.Interfaces.OrderIterator;

public class AllOrderIterator implements OrderIterator {
private int current = 0;
    
    @Override
    public boolean hasNext(){
        if((Orders.items).length == current){
            return false;
        }
        else{
            if((Orders.items)[current + 1] != null){
            	return true;
            }
            return false;
        }
    }
    
    @Override
    public Menu_Item getItem(){
        return (Orders.items)[current];
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
