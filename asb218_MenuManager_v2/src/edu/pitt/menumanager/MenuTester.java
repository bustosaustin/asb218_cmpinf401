package edu.pitt.menumanager;

public class MenuTester
{
	public static void main(String[] args)
	{
		MenuRandomize randomize = new MenuRandomize("data/entrees.txt",
				"data/sides.txt","data/salads.txt","data/desserts.txt");
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.menuDescription()+"\nTotal calories: "+
				myMenu.totalCalories());
	}
}

