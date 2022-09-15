package edu.pitt.lab3;

import javax.swing.JOptionPane; 

public class UnitConverter 
{
	public static void main(String[] args) 
	{
		/* 1. Ask user for input
		 * 2. Separate string into number and unit
		 * 3. Based on unit inputed, convert number accordingly (Use function/method)
		 * 4. Display result and original values (include units for both)
		*/
		String userInput = JOptionPane.showInputDialog("Enter distance or weight amount (### unit): "); // Ask user for distance or weight amount
		
		String userUnits = "";
		for (int i = 0; i < userInput.length(); i++)
		{
			char a = userInput.charAt(i);
			if((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) 
			{
				userUnits = userUnits + a;
			}
			
		} // This takes the characters out of the inputed string 
		
		String z = "";
		for (int i = 0; i < userInput.length(); i++)
		{
			char b = userInput.charAt(i);
			{
			if(b >= '.' && b <= '9')
				z = z + b;
			}
		} // This takes the numbers out the inputed string
		
		double userNum = Double.parseDouble(z); //Changes the number from string to integers; allows for math operations to take place
		
		if ((userUnits.equalsIgnoreCase("centimeters")) || (userUnits.equalsIgnoreCase("cm")) || (userUnits.equalsIgnoreCase("centimeter")))
		{
			double finalNum = userNum / 2.54;
			JOptionPane.showMessageDialog(null, userNum + " " + userUnits + " = " + finalNum + " in");
		}
		else if ((userUnits.equalsIgnoreCase("inches")) || (userUnits.equalsIgnoreCase("in")) || (userUnits.equalsIgnoreCase("inch")))
		{
			double finalNum = userNum * 2.54;
			JOptionPane.showMessageDialog(null, userNum + " " + userUnits + " = " + finalNum + " cm");
		}
		else if ((userUnits.equalsIgnoreCase("yards")) || (userUnits.equalsIgnoreCase("yd")) || (userUnits.equalsIgnoreCase("yard")))
		{
			double finalNum = userNum / 1.094;
			JOptionPane.showMessageDialog(null, userNum + " " + userUnits + " = " + finalNum + " m");
		}
		else if ((userUnits.equalsIgnoreCase("meters")) || (userUnits.equalsIgnoreCase("m")) || (userUnits.equalsIgnoreCase("meter")))
		{
			double finalNum = userNum * 1.094;
			JOptionPane.showMessageDialog(null, userNum + " " + userUnits + " = " + finalNum + " yd(s)");
		}
		else if ((userUnits.equalsIgnoreCase("ounces")) || (userUnits.equalsIgnoreCase("oz")) || (userUnits.equalsIgnoreCase("ounce")))
		{
			double finalNum = userNum * 28.35;
			JOptionPane.showMessageDialog(null, userNum + " " + userUnits + " = " + finalNum + " g");
		}
		else if ((userUnits.equalsIgnoreCase("grams")) || (userUnits.equalsIgnoreCase("g")) || (userUnits.equalsIgnoreCase("gram")))
		{
			double finalNum = userNum / 28.35;
			JOptionPane.showMessageDialog(null, userNum + " " + userUnits + " = " + finalNum + " oz");
		}
		else if ((userUnits.equalsIgnoreCase("pounds")) || (userUnits.equalsIgnoreCase("lbs")) || (userUnits.equalsIgnoreCase("pound")) || (userUnits.equalsIgnoreCase("lb")))
		{
			double finalNum = userNum / 2.205;
			JOptionPane.showMessageDialog(null, userNum + " " + userUnits + " = " + finalNum + " kg(s)");
		}
		else if ((userUnits.equalsIgnoreCase("kilograms")) || (userUnits.equalsIgnoreCase("kg")) || (userUnits.equalsIgnoreCase("kilogram")) || (userUnits.equalsIgnoreCase("kgs")))
		{
			double finalNum = userNum * 2.205;
			JOptionPane.showMessageDialog(null, userNum + " " + userUnits + " = " + finalNum + " lb(s)");
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Check inputed units and try again");
		}
		// If/else if statements above use the users inputed units, converts the inputed number, and displays the conversion
	}

}