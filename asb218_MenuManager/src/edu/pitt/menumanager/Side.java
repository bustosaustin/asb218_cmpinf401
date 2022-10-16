package edu.pitt.menumanager;

/**
 * Class Side
 * author: Austin Bustos
 * created: 10/14/2020
 */

public class Side
{
	String Name;
	String Description;
	int sideCalories;
	
	Side(String Name, String Description, int sideCalories)
	{
		this.Name = Name;
		this.Description = Description;
		this.sideCalories = sideCalories;
	}
	
	String getName()
	{
		return Name;
	}

	void setName(String Name)
	{
		this.Name = Name;
	}
	
	String getDescription()
	{
		return Description;
	}
	
	void setDescription(String Description)
	{
		this.Description = Description;
	}
	
	int getSideCalories()
	{
		return sideCalories;
	}
	
	void setSideCalories(int sideCalories)
	{
		this.sideCalories = sideCalories;
	}
	
}
