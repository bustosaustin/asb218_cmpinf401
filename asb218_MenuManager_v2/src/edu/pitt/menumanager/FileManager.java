package edu.pitt.menumanager;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

/**
 * Class FileManager
 * author Austin Bustos
 * created: 11/1/2022
 */

class FileManager
{
	/**
	 * Method reads entrees from text files into arraylist
	 * @param fileName
	 * @return arraylist of entrees --> eList
	 */
	public static ArrayList<Entree> readEntrees(String fileName)
	{
		ArrayList<Entree> eList = new ArrayList<>(); // Creating ArrayList for entrees.txt file

		try
		{
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) // Going through all the line in the text file
			{
				String[] string = line.split("@@"); // Splitting each line by @@
				Entree entrees = new Entree(string[0], string[1], Integer.parseInt(string[2])); // Creating object for strings
				eList.add(entrees); // Adding to ArrayList 

			}
			br.close();
			fr.close();
		} catch (IOException e)
		{
			System.out.println("Something went wrong reading the entree text file!");
			System.out.println(e.getMessage() + "\n"); // If reading files fails, this catches the error and outputs what went wrong
		}
		return eList;	
	}
	/**
	 * Method reads sides from text files into arraylist
	 * @param fileName
	 * @return arraylist of sides --> siList
	 */
	public static ArrayList<Side> readSides(String fileName)
	{
		ArrayList<Side> siList = new ArrayList<>();

		try
		{
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null)
			{
				String[] string = line.split("@@");
				Side sides = new Side(string[0], string[1], Integer.parseInt(string[2])); 
				siList.add(sides);

			}
			br.close();
			fr.close();

		}catch (IOException e)
		{
			System.out.println("Something went wrong reading the side text file!");
			System.out.println(e.getMessage() + "\n");
		}
		return siList;
	}
	/**
	 * Method reads salads from text files into arraylist
	 * @param fileName
	 * @return arraylist of salads --> saList
	 */
	public static ArrayList<Salad> readSalads(String fileName)
	{
		ArrayList<Salad> saList = new ArrayList<>();

		try
		{
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null)
			{
				String[] string = line.split("@@");
				Salad salads = new Salad(string[0], string[1], Integer.parseInt(string[2]));
				saList.add(salads);

			}
			br.close();
			fr.close();

		} catch (IOException e)
		{
			System.out.println("Something went wrong reading the salad text file!");
			System.out.println(e.getMessage() + "\n");
		}
		return saList;
	}
	/**
	 * Method reads desserts from text files into arraylist
	 * @param fileName
	 * @return arraylist of desserts --> dList
	 */
	public static ArrayList<Dessert> readDesserts(String fileName)
	{
		ArrayList<Dessert> dList = new ArrayList<>();

		try
		{
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null)
			{
				String[] string = line.split("@@");
				Dessert desserts = new Dessert(string[0], string[1], Integer.parseInt(string[2]));
				dList.add(desserts); 

			}
			br.close();
			fr.close();

		} catch (IOException e)
		{
			System.out.println("Something went wrong reading the dessert txt file!");
			System.out.println(e.getMessage() + "\n");
		}
		return dList;
	}

}