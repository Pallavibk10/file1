package com.xworkz.rocket;

public class ThreadImpl extends Thread{

	@Override
	public void run() {
		System.out.println("RUNNING");
	}
	
	public void start() {
		System.out.println();
	}
}
