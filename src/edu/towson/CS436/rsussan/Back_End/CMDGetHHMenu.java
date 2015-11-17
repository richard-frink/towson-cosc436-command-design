package edu.towson.CS436.rsussan.Back_End;

/**
 * Returns to the System Interface a menu with only heart healthy options.
 * 
 * this class may be entirely unneccesary
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
		int x = 0;
		Menu_Item[] temp = new Menu_Item[100];
		while(itr.hasNext()){
			temp[x] = itr.getItem();
			itr.next();
		}
		Menu hhMenu = new Menu();
		x = 0;
		while(temp[x] != null){
			hhMenu.addItem(temp[x]);
			x++;
		}
		return hhMenu;
	}
}
