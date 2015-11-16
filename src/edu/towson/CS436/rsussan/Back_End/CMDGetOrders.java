package edu.towson.CS436.rsussan.Back_End;

import edu.towson.CS436.rsussan.Interfaces.Command;

public class CMDGetOrders implements Command {
	private Aggregator agg;
	
	public CMDGetOrders(Aggregator agg){
		this.agg = agg;
	}

	@Override
	public Object execute() {
		return agg.getOrders();
	}
}
