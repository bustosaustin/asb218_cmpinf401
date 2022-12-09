package edu.pitt.menumanager;

/**
 * Class Menu
 * author: Austin Bustos
 * created: 10/14/2022
 */

public class Menu
{
	private String Name;
	private Entree Entree;
	private Side Side;
	private Salad Salad;
	private Dessert Dessert;

	public Menu(String Name)
	{
		this.Name = Name;
		this.Entree = null;
		this.Side = null;
		this.Salad = null;
		this.Dessert = null;
	}

	public Menu(String Name, Entree Entree, Salad Salad)
	{
		this.Name = Name;
		this.Entree = Entree;
		this.Side = null;
		this.Salad = Salad;
		this.Dessert = null;
	}

	public Menu(String Name, Entree Entree, Side Side, Salad Salad, Dessert Dessert)
	{
		this.Name = Name;
		this.Entree = Entree;
		this.Side = Side;
		this.Salad = Salad;
		this.Dessert = Dessert;
	}

	public int totalCalories()
	{
		int totalCalories = 0;
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
			ecals = Entree.getCalories();
		}
		if(Side == null)
		{
			sicals = 0;
		}
		else
		{
			sicals = Side.getCalories();
		}
		if(Salad == null)
		{
			sacals = 0;
		}
		else
		{
			sacals = Salad.getCalories();
		}
		if(Dessert == null)
		{
			dcals = 0;
		}
		else
		{
			dcals = Dessert.getCalories();
		}

		totalCalories = ecals + sicals + sacals + dcals;
		return totalCalories;
	}

	public double totalPrice()
	{
		double totalPrice = 0;
		double ePrice;
		double siPrice;
		double saPrice;
		double dPrice;

		if(Entree == null)
		{
			ePrice = 0;
		}
		else
		{
			ePrice = Entree.getPrice();
		}
		if(Side == null)
		{
			siPrice = 0;
		}
		else
		{
			siPrice = Side.getPrice();
		}
		if(Salad == null)
		{
			saPrice = 0;
		}
		else
		{
			saPrice = Salad.getPrice();
		}
		if(Dessert == null)
		{
			dPrice = 0;
		}
		else
		{
			dPrice = Dessert.getPrice();
		}

		totalPrice = ePrice + siPrice + saPrice + dPrice;
		return totalPrice;
	}

	public String menuDescription()
	{
		String menuDescription = "";
		String entreeString;
		String sideString;
		String saladString;
		String dessertString;

		if(getEntree() == null)
		{
			entreeString = "N/A";
		}
		else
		{
			entreeString = getEntree().getDescription();
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

		menuDescription = ("Entree: " + entreeString + "\n" + "Side: " + sideString + "\n" + "Salad: " + saladString + "\n" + "Dessert: " + dessertString);
		return menuDescription;
	}

	public String getName()
	{
		return Name;
	}

	public void setName(String name)
	{
		Name = name;
	}

	public Entree getEntree()
	{
		return Entree;
	}

	public void setEntree(Entree entree)
	{
		Entree = entree;
	}

	public Side getSide()
	{
		return Side;
	}

	public void setSide(Side side)
	{
		Side = side;
	}

	public Salad getSalad()
	{
		return Salad;
	}

	public void setSalad(Salad salad)
	{
		Salad = salad;
	}

	public Dessert getDessert()
	{
		return Dessert;
	}

	public void setDessert(Dessert dessert)
	{
		Dessert = dessert; 
	} // Getters and setters

	public String toSring()
	{
		return Name;
	}
}