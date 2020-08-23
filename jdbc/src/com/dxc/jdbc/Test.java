package com.dxc.jdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");
		
		
		  int status = dao.saveEmployee(new Employee(1, "DXC", 35000));
		  System.out.println(status);
		  
		 

		
		/*
		 * int status = dao.updateEmployee(new Employee(1, "Raghu", 15000));
		 * System.out.println(status);
		 */

		
		
		  //int status=dao.deleteEmployee(1);
		  //System.out.println(status);
		 

	}

}
