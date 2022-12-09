package edu.pitt.menumanager;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

/**
 * Class FileManager
 * author Austin Bustos
 * created: 11/1/2022
 */

class FileManager
{
	/**
	 * Method reads menu items from text files into array list
	 * @param fileName
	 * @return
	 */
	public static ArrayList<MenuItem> readItems(String fileName)
	{
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();

		try
		{
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null)
			{
				list.add(line);
			}
			for (String x : list)
			{
				String[] string = x.split("@@");

				if (string[1].equals("entree"))
				{
					Entree entree = new Entree(string[0], string[2], Integer.parseInt(string[3]), Double.parseDouble(string[4]));
					menuItems.add(entree);
				}
				else if (string[1].equals("side"))
				{
					Side side = new Side(string[0], string[2], Integer.parseInt(string[3]), Double.parseDouble(string[4]));
					menuItems.add(side);
				}
				else if (string[1].equals("salad"))
				{
					Salad salad = new Salad(string[0], string[2], Integer.parseInt(string[3]), Double.parseDouble(string[4]));
					menuItems.add(salad);
				}
				else if (string[1].equals("dessert"))
				{
					Dessert dessert = new Dessert(string[0], string[2], Integer.parseInt(string[3]), Double.parseDouble(string[4]));
					menuItems.add(dessert);
				}
			}
			// MenuItem item = new MenuItem(string[0], string[2], Integer.parseInt(string[3]), Double.parseDouble(string[4]));
			br.close();
			fr.close();
		}catch (IOException e)
		{
			System.out.println("Something went wrong reading the text file!");
			System.out.println(e.getMessage() + "\n");
		}
		return menuItems; // Reads all different menu items from text file 
	}

	public static void writeMenu(String fileName, ArrayList<Menu> Menu)
	{
		try
		{
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < Menu.size(); i++)
			{
				bw.write(Menu.get(i).menuDescription() + "\n" + "Total Calories: " + Menu.get(i).totalCalories() + "\n" + "Total Price: " + Menu.get(i).totalPrice() + "\n");
				bw.newLine();
			}
			bw.close();
			fw.close();
		}catch (IOException e)
		{
			System.out.println("Something went wrong reading the text file!");
			System.out.println(e.getMessage() + "\n");
		}
	} // Writes menu with total calories and total price
}