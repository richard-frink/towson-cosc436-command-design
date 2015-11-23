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
	private int[] order;
	
	public CMDSubmitOrder(Aggregator agg, int[] arr){
		this.agg = agg;
		this.order = arr;
	}
	
	@Override
	public Object execute() {
		int x = 0;
		while(order[x] != 0){
			agg.submitOrder(Menu.items[order[x] - 1]);
			x++;
		}
		return true;
	}
}
