package edu.towson.CS436.rsussan.Back_End;

/**
 * System interface has one of these to invoke (execute) specific commands it needs 
 * to have carried out.
 * 
 * @author Richard Sussan
 *
 */

public class Invoker {
	private Aggregator agg;
	
	public Invoker(Aggregator agg){
		this.agg = agg;
	}
	
	public Menu getMenu(){
		return (Menu)(new CMDGetMenu(agg)).execute();
	}
	
	public Menu getHHMenu(){
		return (Menu)(new CMDGetHHMenu(agg)).execute();
	}
	
	public Menu getPriceMenu(double price){
		return (Menu)(new CMDGetPriceMenu(agg, price)).execute();
	}
	
	public Menu getTypeMenu(int type){
		return (Menu)(new CMDGetTypeMenu(agg, type)).execute();
	}
	
	public Orders getOrders(){
		return (Orders)(new CMDGetOrders(agg)).execute();
	}
}
