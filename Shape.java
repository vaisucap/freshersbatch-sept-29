package com.corejava.intoops;
abstract class Shape 
	{
		public abstract void draw();
	}
class Line extends Shape
{
	public void draw()
	{
		System.out.println("drawing a line");
	}
}
class Rectangle extends Shape
{
	public void draw()
	{
		System.out.println("drawing a rectangle");
	}
}
class Cube extends Shape
{
	public void draw()
	{
		System.out.println("drawing a Cube");
	}
}
public class Shapes
{
	public static void main(String args[])
	{
		Line a=new Line();
		Rectangle b=new Rectangle();
		Cube c=new Cube();
		a.draw();
		b.draw();
		c.draw();
	}
}

