package edu.pitt.menumanager;

/**
 * Class Salad
 * author: Austin Bustos
 * created: 10/14/2022
 */

public class Salad
{
	String Name;
	String Description;
	int saladCalories;
	
	Salad(String Name, String Description, int saladCalories)
	{
		this.Name = Name;
		this.Description = Description;
		this.saladCalories = saladCalories;
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
	
	int getSaladCalories()
	{
		return saladCalories;
	}
	
	void setSaladCalories(int saladCalories)
	{
		this.saladCalories = saladCalories;
	}
}
