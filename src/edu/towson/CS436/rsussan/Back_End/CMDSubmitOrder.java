package edu.towson.CS436.rsussan.Back_End;

/**
 * Implements the command interface.
 * Used by the Invoker to return a notification to the system interface that an order was submitted
 * 
 * @author Richard Sussan
 *
 */

import edu.towson.CS436.rsussan.Interfaces.Command;

public class CMDSubmitOrder implements Command {
	private Aggregator agg;
	
	public CMDSubmitOrder(Aggregator agg){
		this.agg = agg;
	}
	
	@Override
	public Object execute() {
		// TODO Auto-generated method stub
		return null;
	}
}
