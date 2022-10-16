package edu.pitt.menumanager;

/**
 * Class Entree
 * author: Austin Bustos
 * created: 10/14/2022
 */

public class Entree
{
	String Name;
	String Description;
	int entreeCalories;

	Entree(String Name, String Description, int entreeCalories)
	{
		this.Name = Name;
		this.Description = Description;
		this.entreeCalories = entreeCalories;
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
	
	int getEntreeCalories()
	{
		return entreeCalories;
	}
	
	void setEntreeCalories(int entreeCalories)
	{
		this.entreeCalories = entreeCalories;
	}
}
