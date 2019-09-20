package com.mycompany.ssh;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
			}
	public void setAge(int age) {
		this.age = age;
			if(age<0)
				this.age = 0;
			else
				this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
		if(height<0)
			this.height = 0;
		else
			this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
}
