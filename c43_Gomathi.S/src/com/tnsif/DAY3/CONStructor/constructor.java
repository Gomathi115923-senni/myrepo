package com.tnsif.DAY3.CONStructor;

public class constructor {
	String name;
	int age;
	String dept;
	
	
	// Default Constructor
		public constructor() {
			System.out.println("Default Constructor");
		}
		
		//Parameterized Constructor
		//use of this keyword
		public constructor(String ConstructorName, int ConstructorAge, String ConstructorDept) {
			
			this(); //calling default constructor
			
			System.out.println("Parameterized Constructor");
			this.name = ConstructorName;
			this.age = ConstructorAge;
			this.dept = ConstructorDept;
		}
	
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
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "OopsConceptDemo [Name=" + name + ", age=" + age + ", dept=" + dept + "]";
		
	}
	
	public static void main(String[] args) {
		constructor obj = new constructor();
		obj.setName("Abhi");
		obj.setAge(22);
		obj.setDept("CSE");
		System.out.println(obj);
	}
}
