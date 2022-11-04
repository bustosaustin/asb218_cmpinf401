package edu.pitt.menumanager;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class MenuRandomize
 * author Austin Bustos
 * created: 11/3/2022
 */

public class MenuRandomize
{
	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;

	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile)
	{
		entrees = FileManager.readEntrees(entreeFile);
		sides = FileManager.readSides(sideFile);
		salads = FileManager.readSalads(saladFile);
		desserts = FileManager.readDesserts(dessertFile);
	}

	public Menu randomMenu()
	{		
		Random rand = new Random();

		int rEntree = rand.nextInt(entrees.size());
		Entree randEntree = entrees.get(rEntree);

		int rSide = rand.nextInt(sides.size());
		Side randSide = sides.get(rSide);

		int rSalad = rand.nextInt(salads.size());
		Salad randSalad = salads.get(rSalad);

		int rDessert = rand.nextInt(desserts.size());
		Dessert randDessert = desserts.get(rDessert);

		return new Menu(null, randEntree, randSide, randSalad, randDessert);
	}
}
