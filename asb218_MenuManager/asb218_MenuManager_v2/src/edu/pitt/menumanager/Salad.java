package edu.pitt.menumanager;

/**
 * Class Salad
 * author: Austin Bustos
 * created: 10/14/2022
 */

public class Salad
{
	private String Name;
	private String Description;
	private int saladCalories;
	
	public Salad(String Name, String Description, int saladCalories)
	{
		this.Name = Name;
		this.Description = Description;
		this.saladCalories = saladCalories;
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
	
	public int getSaladCalories()
	{
		return saladCalories;
	}
	
	public void setSaladCalories(int saladCalories)
	{
		this.saladCalories = saladCalories;
	}
}
