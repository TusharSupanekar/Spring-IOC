package com.jsp.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver2 {
	public static void main(String[] args) {
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("myspring.xml");
		
		Car car = (Car) applicationContext.getBean("myCar");
		car.drive();
	}

}
