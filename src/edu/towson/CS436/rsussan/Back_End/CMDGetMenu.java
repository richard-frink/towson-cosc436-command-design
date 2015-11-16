package edu.towson.CS436.rsussan.Back_End;

/**
 * Implements the command interface.
 * Used by the Invoker to return the static menu in the system.
 * 
 * @author Richard Sussan
 *
 */

import edu.towson.CS436.rsussan.Interfaces.Command;

public class CMDGetMenu implements Command {
	private Aggregator agg;
	
	public CMDGetMenu(Aggregator agg){
		this.agg = agg;
	}

	@Override
	public Object execute() {
		return agg.getMenu();
	}
}
