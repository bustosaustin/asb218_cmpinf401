package edu.pitt.menumanager;

public class MenuItem 
{
	private String Name;
	private String Description;
	private int Calories;
	private double Price; // Properties of MenuItem class

	public MenuItem(String Name, String Description, int Calories, double Price)
	{
		this.Name = Name;
		this.Description = Description;
		this.Calories = Calories;
		this.Price = Price;
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

	public int getCalories()
	{
		return Calories;
	}

	public void setCalories(int Calories)
	{
		this.Calories = Calories;
	}

	public double getPrice()
	{
		return Price;
	}

	public void setPrice(int Price)
	{
		this.Price = Price;
	} // Getters and setters for properties

	@Override
	public String toString()
	{
		return this.Name;
	}
}
