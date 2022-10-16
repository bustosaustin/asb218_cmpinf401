package edu.pitt.menumanager;

/**
 * Class MenuTest
 * author: Austin Bustos
 * created: 10/15/2022
 */

public class MenuTest
{
	public static void main(String[] args)
	{
		Entree entree1 = new Entree("", "", 0);
		Entree entree2 = new Entree("", "", 0);
		Side side = new Side("", "", 0);
		Salad salad1 = new Salad("", "", 0);
		Salad salad2 = new Salad("", "", 0);
		Dessert dessert = new Dessert("", "", 0);
		Menu newMenu1 = new Menu("", entree1, salad1);
		Menu newMenu2 = new Menu("", entree2, side, salad2, dessert);
		
		newMenu1.Name = "Weekend Special";
		newMenu1.Entree.Name = "French Onion Soup";
		newMenu1.Entree.Description = "Carmelized onions in our house beef stock, baked with a layer of Parmesan crouton topped with a layer of Swiss cheese and baked.";
		newMenu1.Entree.entreeCalories = 300;
		newMenu1.Salad.Name = "Arugula Salad with Lemon Vinaigrette";
		newMenu1.Salad.Description = "Chopped arugula with shaved pieces of Asiago cheese topped with our house lemon vinaigrette";
		newMenu1.Salad.saladCalories = 100;
	
		newMenu2.Name = "October Special";
		newMenu2.Entree.Name = "New York Strip";
		newMenu2.Entree.Description = "A 10 oz New York strip steak from Japanese raised cows. It is seasoned with salt and peper, cooked in a cast iron skillet with olive oil, rosemary, garlic, and basted with unsalted butter. You choose how you would like it done. However, medium rare is recommended.";
		newMenu2.Entree.entreeCalories = 550;
		newMenu2.Side.Name = "Mashed Potatoes and Asparagus";
		newMenu2.Side.Description = "Mashed Yukon Gold potatoes with salt, pepper, and garlic with salt and pepper seasoned asparagus cooked in the same grill as your steak.";
		newMenu2.Side.sideCalories = 100;
		newMenu2.Salad.Name = "Caesar Salad";
		newMenu2.Salad.Description = "Chopped Romaine lettuce and croutons dressed with our house Caesar dressing: lemon juice, olive oil, egg, Worcestershire sauce, anchovies, garlic, Dijon mustard, Parmesan cheese, and black pepper.";
		newMenu2.Salad.saladCalories = 300;
		newMenu2.Dessert.Name = "Chocolate Lava Cake";
		newMenu2.Dessert.Description = "A frozen cylinder of our house ganache set in a ramekin and surrounded by chocolate cake. It is not undercooked chocolate cake in the center.";
		newMenu2.Dessert.dessertCalories = 300;
		
		newMenu1.menuDescription();
		newMenu1.totalCalories();
		
		newMenu2.menuDescription();
		newMenu2.totalCalories();
	}
}
