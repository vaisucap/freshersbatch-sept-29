package com.corejava.intoops;

class Employee {
	int salary=6000;

}
class Manager extends Employee
{
	int incentive=salary+2000;
}
class Labour extends Employee{
	int overtime=salary+1000;
}
public class Inh
{
	public static void main(String[] args)
	{
		Manager m= new Manager();
		Labour l=new Labour();
		System.out.println("manager salary:"+m.salary);
		System.out.println("salary with incentive:"+m.incentive);
		System.out.println("labour salary:"+l.salary);
		System.out.println("salary with overtime:"+l.overtime);
	}
}