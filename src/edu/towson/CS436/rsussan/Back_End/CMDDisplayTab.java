package edu.towson.CS436.rsussan.Back_End;

/**
 * Implements the command interface.
 * Used by the Invoker to return the current tab in the system
 * 
 * @author Richard Sussan
 *
 */

import edu.towson.CS436.rsussan.Interfaces.Command;

public class CMDDisplayTab implements Command {
	private Aggregator agg;
	
	public CMDDisplayTab(Aggregator agg){
		this.agg = agg;
	}
	
	@Override
	public Object execute() {
		// TODO Auto-generated method stub
		return null;
	}
}
