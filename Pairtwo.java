package com.corejava.generics;
public class Pairtwo
{
	public static void main(String args[])
	{
		Pairs<String ,java.util.Date> myobj=new Pairs<String ,java.util.Date>("hello there",new java.util.Date());
		myobj.setkey("hello there");
		myobj.setvalue(new java.util.Date());
		System.out.println("key:"+myobj.getkey());
		System.out.println("value:"+myobj.getvalue());
		
	}
}
