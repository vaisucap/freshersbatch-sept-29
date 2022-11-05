package com.corejava.intoops;
import java.util.Scanner;

public class Fixed {
	public class CurrentAccount {
		
			int c;
		Scanner s=new Scanner(System.in);
		c=s.nextInt();
	}
	
	public class SavingsAccount {
		
		{
			int c;
		Scanner s=new Scanner(System.in);
		c=s.nextInt();
	}
	
	public static void credit()

	{
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		String tot_amt = c+(s-a);
		s=tot_amt;
		System.out.println("total amount="+tot_amt);
		
	}
public static void main(String args[])
{
	int tot_amt,a,b;
	CurrentAccount c=new CurrentAccount();
	SavingsAccount s=new SavingsAccount();
	credit();
}

}
