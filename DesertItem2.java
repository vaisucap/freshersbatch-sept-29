package com.corejava.intoops;


import java.util.Scanner;

abstract class Desertitem{
	abstract int getCost(int cost);
}
class CandyItem extends Desertitem{
	int dollarCurrency=60;
	//override
	int getCost(int cost)
	{
		return cost*dollarCurrency;
	}
}
class Cookie extends Desertitem{
	int euroCurrency=70;
	//override
	int getCost(int cost)
	{
		return cost*euroCurrency;
	}
}
class IceCream extends Desertitem{
	//override
	int getCost(int cost)
	{
		return cost;
	}
}
class DesertItems{
	public String addItemsToStorage(String item1,String item2,String item3) {
		return item1+" " +item2 +" "+ item3 +"  :  3  Desert Added Successfully";
	}
}

public class DesertItem2 extends DesertItems{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the role  :  customer (or) owner");
		String role=sc.next();
		if(role.equals("owner"))
		{
			DesertItem2 ds= new DesertItem2();
			System.out.println(ds.addItemsToStorage("Candy","Cookie","IceCream"));
		}
		else if(role.equals("customer"))
		{
			System.out.println("candies available");
			System.out.println("....................");
			Desertitem obj= new CandyItem();
			System.out.println("Candy  :" +obj.getCost(1)+" in rupees");
			Desertitem obj1= new Cookie();
			System.out.println("Cookie  :" +obj1.getCost(1)+" in rupees");
			Desertitem obj2= new IceCream();
			System.out.println("Icecream  :" +obj2.getCost(1)+" in rupees");
			System.out.println("Please select the product");
		}
		else
		{
			System.out.println("please enter valid input");
		}
		sc.close();

	}

}

