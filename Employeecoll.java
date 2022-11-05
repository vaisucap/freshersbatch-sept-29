package com.corejava.collections;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Comparator;
public class Employeecoll 
{
public static void main(String[] args){
	System.out.println("Choose any of the option");
	Scanner sc = new Scanner(System.in);
	System.out.println("1 id");
	System.out.println("2 Name");
	System.out.println("3 Department");
	System.out.println("4 Salary");
	int menuOption = sc.nextInt();
	switch (menuOption){
	case 1:
	break;
	case 2:
	{
    TreeSet<employeeDetails> Employeecoll = new TreeSet<>(new FirstComparator());
	Employeecoll.add(new employeeDetails(111,"anu","sales",24000));
	Employeecoll.add(new employeeDetails(112,"neenu","planning",25000));
	Employeecoll.add(new employeeDetails(113,"sara","admin",50000));
    Employeecoll.add(new employeeDetails(114,"ansu","HR",40000));
    for (employeeDetails empdt : Employeecoll)
    {
	System.out.println(empdt);
	}break;
	}
	}
	
	}
}

	