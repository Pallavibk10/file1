package com.xworkz.rocket;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("context.xml");
		Rocket reffofrocket=con.getBean(Rocket.class);
		
		Labour reffoflabour=con.getBean(Labour.class);
		reffofrocket.launch();
		reffoflabour.work();
		
	}
}
