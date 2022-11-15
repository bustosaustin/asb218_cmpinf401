package edu.pitt.lab9;

public class Circle 
{
	final double PI = 3.14;
	private double radius = 5.0;
	private String color = "Green"; // Declare pi, radius, and color

	public Circle()
	{
	}

	public Circle(double radius)
	{
		this.radius = radius;
	}

	public Circle(double radius, String color)
	{
		this.radius = radius;
		this.color = color;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	public double getRadius()
	{
		return this.radius;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public String getString()
	{
		return this.color;
	}

	public double getArea()
	{
		return PI*radius*radius;
	} // Getter, setters, and circle parameters
}