package com.corejava.collections;

import java.util.Comparator;

import com.corejava.collections.Employeecoll.employeeDetails;

public class FirstComparator implements Comparator<employeeDetails>
{

	@Override
	public int compare(employeeDetails o1, employeeDetails o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}