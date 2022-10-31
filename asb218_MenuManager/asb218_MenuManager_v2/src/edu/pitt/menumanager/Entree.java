package edu.pitt.menumanager;

/**
 * Class Entree
 * author: Austin Bustos
 * created: 10/14/2022
 */

public class Entree
{
	private String Name;
	private String Description;
	private int entreeCalories;

	public Entree(String Name, String Description, int entreeCalories)
	{
		this.Name = Name;
		this.Description = Description;
		this.entreeCalories = entreeCalories;
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
	
	public int getEntreeCalories()
	{
		return entreeCalories;
	}
	
	public void setEntreeCalories(int entreeCalories)
	{
		this.entreeCalories = entreeCalories;
	}
}
