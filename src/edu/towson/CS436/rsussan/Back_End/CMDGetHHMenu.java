package edu.towson.CS436.rsussan.Back_End;

/**
 * Returns to the System Interface a menu with only heart healthy options.
 * 
 * @author Richard Sussan
 *
 */

import edu.towson.CS436.rsussan.Interfaces.Command;

public class CMDGetHHMenu implements Command {
	private HHIterator itr;
	private Aggregator agg;
	
	public CMDGetHHMenu(Aggregator agg){
		this.agg = agg;
	}
	
	@Override
	public Object execute() {
		Menu menu = agg.getMenu();
		itr = (HHIterator)menu.getHHIterator();
		Menu hhMenu = new Menu();
		while(itr.hasNext()){
			hhMenu.addItem(itr.getItem());
			itr.next();
		}
		return hhMenu;
	}
}
