package edu.pitt.menumanager;

/**
 * Class Dessert
 * author: Austin Bustos
 * created: 10/14/2022
 */

public class Dessert
{
	String Name;
	String Description;
	int dessertCalories;
	
	Dessert(String Name, String Description, int dessertCalories)
	{
		this.Name = Name;
		this.Description = Description;
		this.dessertCalories = dessertCalories;
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
	
	int getDessertCalories()
	{
		return dessertCalories;
	}
	
	void setDessertCalories(int dessertCalories)
	{
		this.dessertCalories = dessertCalories;
	}
}
