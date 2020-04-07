package com.evolvusion.test;

import java.util.LinkedList;
import java.util.List;

import com.evolvusion.pojo.Employee;

public class TestComparator {
	public static void main(String[] args) {
		
		Employee em1 = new Employee(20, 2131, "darshu");
		
		Employee em2 = new Employee(10, 2131, "darshu1");
		
		Employee em3 = new Employee(40, 2131, "darshu2");
		
		
		List<Employee> lt= new LinkedList<>();
		
		lt.add(em2);
		
		lt.add(em1);
		
		lt.add(em3);
		
		System.out.println(lt);
		
		
	}
}
