package com.xworkz.rocket;

public class Labour {
	private String name;
	private int expreance;
	private ThreadImpl threadImpl;
	
	public Labour(String name) {
		this.name=name;
		System.out.println("created"+name);
	}
	
	public void setExpereance(int expereance ) {
		this.expreance=expereance;
		System.out.println("created"+expereance);
	}
	
	public void setThreadImpl(ThreadImpl threadImpl ) {
		this.threadImpl=threadImpl;
		System.out.println("created"+threadImpl);
	}

	public void work() {
		this.threadImpl.start();
		this.threadImpl.run();
	}
}