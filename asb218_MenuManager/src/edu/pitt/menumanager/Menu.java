package edu.pitt.menumanager;

import javax.swing.JOptionPane;

/**
 * Class Menu
 * author: Austin Bustos
 * created: 10/14/2022
 */

public class Menu
{
	String Name;
	Entree Entree;
	Side Side;
	Salad Salad;
	Dessert Dessert;
	int totalCalories;
	String menuDescription;
	
	Menu(String Name)
	{
		this.Name = Name;
		this.Entree = null;
		this.Side = null;
		this.Salad = null;
		this.Dessert = null;
	}
	
	Menu(String Name, Entree Entree, Salad Salad)
	{
		this.Name = Name;
		this.Entree = Entree;
		this.Side = null;
		this.Salad = Salad;
		this.Dessert = null;
	}
	
	Menu(String Name, Entree Entree, Side Side, Salad Salad, Dessert Dessert)
	{
		this.Name = Name;
		this.Entree = Entree;
		this.Side = Side;
		this.Salad = Salad;
		this.Dessert = Dessert;
	}
	
	int totalCalories()
	{
		int ecals;
		int sicals;
		int sacals;
		int dcals;
		
		if(Entree == null)
		{
			ecals = 0;
		}
		else
		{
			ecals = Entree.getEntreeCalories();
		}
		if(Side == null)
		{
			sicals = 0;
		}
		else
		{
			sicals = Side.getSideCalories();
		}
		if(Salad == null)
		{
			sacals = 0;
		}
		else
		{
			sacals = Salad.getSaladCalories();
		}
		if(Dessert == null)
		{
			dcals = 0;
		}
		else
		{
			dcals = Dessert.getDessertCalories();
		}
		
		this.totalCalories = ecals + sicals + sacals + dcals;
		JOptionPane.showMessageDialog(null, "Total calories: " + totalCalories);
		return totalCalories;
	}

	String menuDescription()
	{
		String entreeString;
		String sideString;
		String saladString;
		String dessertString;
		
		if(Entree == null)
		{
			entreeString = "N/A";
		}
		else
		{
			entreeString = Entree.getDescription();
		}
		
		if(Side == null)
		{
			sideString = "N/A";
		}
		else
		{
			sideString = Side.getDescription();
		}
		
		if(Salad == null)
		{
			saladString = "N/A";
		}
		else
		{
			saladString = Salad.getDescription();
		}
		
		if(Dessert == null)
		{
			dessertString = "N/A";
		}
		else
		{
			dessertString = Dessert.getDescription();
		}
		
		this.menuDescription = ("Entree: " + entreeString + "\n" + "Side: " + sideString + "\n" + "Salad: " + saladString + "\n" + "Dessert: " + dessertString);
		JOptionPane.showMessageDialog(null, Name + "\n" + menuDescription);
		return menuDescription;
	}
}