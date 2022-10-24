package edu.pitt.lab7;

import javax.swing.JOptionPane; // Able to use JOptionPane
import java.util.Random; // Able to use Random class to fill array

public class Main
{
	public static void main(String[] args)
	{
		String userInput1 = JOptionPane.showInputDialog("How many elements will be entered into the array: ");
		int arraySize = Integer.parseInt(userInput1); // Asking user the size of the array; converting into an integer to make it usable when constructing array
		
		double[] userArray = new double[arraySize]; // Constructing array with given user array size
		
		Random rClass = new Random(); // Creating random integers
		
		for (int i = 0; i < userArray.length; i++)
		{
			userArray[i] = rClass.nextInt(); // Going through created array and filling each element with a randomly generated integer
		}
		
		double arrayMax = max(userArray);
		double arrayMin = min(userArray);
		double arraySum = sum(userArray);
		double arrayAvg = ave(userArray);
		
		System.out.println("The maximum value in the array is: " + arrayMax + "\n" + "The minimum value in the array is: " + arrayMin + "\n" + "The sum of the array is: " + arraySum + "\n" + "The average of the array is: " + arrayAvg);
		
	}
	public static double max(double [] userArray)
	{
		double arrayMax = 0;
		for (int i = 0; i < userArray.length; i++)
		{
			if (arrayMax < userArray[i])
			{
				arrayMax = userArray[i];
			}
		}
		return arrayMax;
	}
	
	public static double min(double [] userArray)
	{
		double arrayMin = 0;
		for (int i = 0; i < userArray.length; i++)
		{
			if (arrayMin > userArray[i])
			{
				arrayMin = userArray[i];
			}
		}
		return arrayMin;
	}
	public static double sum(double [] userArray)
	{
		double arraySum = 0;
		for (int i = 0; i < userArray.length; i++)
		{
			arraySum = arraySum + userArray[i];
		}
		return arraySum;
	}
	public static double ave(double [] userArray)
	{
		double arraySum1 = 0;
		double arrayAvg = 0;
		for (int i = 0; i < userArray.length; i++)
		{
			arraySum1 += userArray[i];
		}
		
		arrayAvg = arraySum1/userArray.length;
		return arrayAvg;
	}
}
