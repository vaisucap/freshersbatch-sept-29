package com.corejava.intoops;
public class Singleton {
	private static Singleton INSTANCE=null;
	private Singleton()
	{
	}
	public static Singleton getInstance()
	{
		if(INSTANCE==null)
		{
			synchronized(Singleton.class)
			{
				INSTANCE=new Singleton();
			}
		}
		return INSTANCE;
	}

}
