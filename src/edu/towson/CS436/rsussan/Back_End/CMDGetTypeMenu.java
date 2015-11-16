package edu.towson.CS436.rsussan.Back_End;

/**
 * Returns to the System Interface a menu with only items of a specified type.
 * 
 * @author Richard Sussan
 *
 */

import edu.towson.CS436.rsussan.Interfaces.Command;

public class CMDGetTypeMenu implements Command {
	private TypeIterator itr;
	private int type;
	private Aggregator agg;
	
	public CMDGetTypeMenu(Aggregator agg, int t){
		this.type = t;
		this.agg = agg;
	}
	
	@Override
	public Object execute() {
		Menu menu = agg.getMenu();
		itr = (TypeIterator)menu.getTypeIterator(type);
		Menu typeMenu = new Menu();
		while(itr.hasNext()){
			typeMenu.addItem(itr.getItem());
			itr.next();
		}
		return typeMenu;
	}
}
