package com.gl.service;

public class StockPrices {
	private static int rise = 0;
	private static int drop = 0;

	public static int stockPrices(boolean bool) {
		
		if(bool == true) {
			return rise++;
		}	
		else {
			return drop++;
		}
	}
			
	public void rise() {
		System.out.println("Total no. of companies for which stocks rose: " + rise);
	}
	
	public void drop() {
		System.out.println("Total no. of companies for which stocks dropped: " + drop);
	}
	
}
