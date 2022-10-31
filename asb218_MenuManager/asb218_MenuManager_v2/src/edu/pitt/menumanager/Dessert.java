package edu.pitt.menumanager;

/**
 * Class Dessert
 * author: Austin Bustos
 * created: 10/14/2022
 */

public class Dessert
{
	private String Name;
	private String Description;
	private int dessertCalories;
	
	public Dessert(String Name, String Description, int dessertCalories)
	{
		this.Name = Name;
		this.Description = Description;
		this.dessertCalories = dessertCalories;
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
	
	public int getDessertCalories()
	{
		return dessertCalories;
	}
	
	public void setDessertCalories(int dessertCalories)
	{
		this.dessertCalories = dessertCalories;
	}
}
