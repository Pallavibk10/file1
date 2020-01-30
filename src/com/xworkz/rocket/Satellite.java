package com.xworkz.rocket;

public class Satellite {
	private int launched;
	private String location;
	public Satellite() {
		System.out.println("invoked satellite"+this.getClass().getSimpleName());
	}

	public void setLaunched(int launched) {
		System.out.println("launched");
		this.launched=launched;
	}
	public void setLocataion(String location) {
		System.out.println("location");
		this.launched=launched;
	}
	
	public void launch(int time) {
		System.out.println("invoked"+time);
	}

	@Override
	public String toString() {
		return "Sattelite [launched=" + launched + ", location=" + location + "]";
	}
	
}
