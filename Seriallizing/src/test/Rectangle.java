package test;

import java.io.Serializable;

public class Rectangle implements Serializable
{
	double height;
	double width;
	
	public Rectangle(double height, double width)
	{
		this.height = height;
		this.width = width;
	}
	
	public double area()
	{
		return height*width;
	}
	
	public double perimeter()
	{
		return 2*(height+width);
	}
	
}
