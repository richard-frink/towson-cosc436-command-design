package edu.towson.CS436.rsussan.Back_End;

/**
 * Returns to the System Interface a menu with only items under or equal to a specified price.
 * 
 * @author Richard Sussan
 *
 */

import edu.towson.CS436.rsussan.Interfaces.Command;

public class CMDGetPriceMenu implements Command {
	private PriceIterator itr;
	private double price;
	private Aggregator agg;
	
	public CMDGetPriceMenu(Aggregator agg, double p){
		this.price = p;
		this.agg = agg;
	}
	
	@Override
	public Object execute() {
		Menu menu = agg.getMenu();
		itr = (PriceIterator)menu.getPriceIterator(price);
		Menu priceMenu = new Menu();
		while(itr.hasNext()){
			priceMenu.addItem(itr.getItem());
			itr.next();
		}
		return priceMenu;
	}
}
