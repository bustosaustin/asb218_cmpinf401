package edu.pitt.menumanager;

/**
 * Class Side
 * author: Austin Bustos
 * created: 10/14/2020
 */

public class Side
{
	private String Name;
	private String Description;
	private int sideCalories;
	
	public Side(String Name, String Description, int sideCalories)
	{
		this.Name = Name;
		this.Description = Description;
		this.sideCalories = sideCalories;
	}
	
	public String getName()
	{
		return Name;
	}

	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	public String getDescription()
	{
		return Description;
	}
	
	public void setDescription(String Description)
	{
		this.Description = Description;
	}
	
	public int getSideCalories()
	{
		return sideCalories;
	}
	
	public void setSideCalories(int sideCalories)
	{
		this.sideCalories = sideCalories;
	}
	
}
