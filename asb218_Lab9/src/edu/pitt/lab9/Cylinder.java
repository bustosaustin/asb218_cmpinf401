package edu.pitt.lab9;

public class Cylinder extends Circle
{
	private double height = 1.0;

	public Cylinder()
	{
	}

	public Cylinder(double radius, String color)
	{
		super(radius, color);
	}

	public Cylinder(double radius, String color, double height)
	{
		super(radius, color);
		this.height = height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	public double getHeight()
	{
		return this.height;
	}

	public double getVolume()
	{
		return getArea()*height; // Return the volume by multiplying the area by the height
	}
}
