package com.xworkz.rocket;

public class Fuel {
	private int liters;
	private Fuel(int liters) {
		this.liters=liters;
		System.out.println("creatd"+liters);
	}
	
	public void fire() {
		System.out.println("invoked");
	}

	@Override
	public String toString() {
		return "Fuel [liters=" + liters + "]";
	}
	
	

}
