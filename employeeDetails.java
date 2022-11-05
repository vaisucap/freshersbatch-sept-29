package com.corejava.collections;

public class employeeDetails
{
public int id;
public String name;
public String department;
public double salary;
 employeeDetails(){

}

employeeDetails(int id, String name, String department, double salary)
{
this.id = id;
this.name = name;
this.department = department;
this.salary = salary;
        }
        public String toString()
        {
            return " "+this.id+" "+this.name+" "+this.department+" "+this.salary;
        }
}
