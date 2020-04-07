package com.evolvusion.pojo;

public class Employee implements Comparable<Employee> {

	private int age;

	private int id;

	private String name;

	@Override
	public String toString() {
		return "Employee [age=" + age + ", id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if (o.age > age) {
			return 1;
		}

		if (o.age < age) {
			return -1;
		}

		return 0;
	}

	public Employee(int age, int id, String name) {
		super();
		this.age = age;
		this.id = id;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
