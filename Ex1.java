package com.corejava.exhand;

import java.util.Scanner;

public class Ex1 {
	public static void main(String args[])
	{
		try
		{
			int num1,num2,num;
			Scanner a=new Scanner(System.in);
			System.out.println("enter frst num");
			num1=a.nextInt();
			System.out.println("enter second num");
			num2=a.nextInt();
			num=num1/num2;
			System.out.println("result:"+num);
		}
catch(ArithmeticException e)
		{
	System.out.println("error"+e.getMessage());
	System.out.println("error"+e);
		}

}
}