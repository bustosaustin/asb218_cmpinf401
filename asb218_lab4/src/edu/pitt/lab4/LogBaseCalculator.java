package edu.pitt.lab4;

import javax.swing.JOptionPane;

public class LogBaseCalculator 
{
	public static void main(String[] args)
	{
		/* 1. Ask user to enter two values; one for log and one for base. Making sure to error check so that X is greater than 0 and b is greater than 1 (assuming integer values are inputed)
		 * 2. Calculate a logarithmic value using the value and the base provided by the user
		 * 3. Output calculations
		 */
		
		int x = 0;
		int b = 1; // Initializing variables for while loop (error checking)
		
		while (x <= 0 || b <= 1)
		{
			String userX = JOptionPane.showInputDialog("What is your X value: ");
			String userB = JOptionPane.showInputDialog("What is your b value: ");

			x = Integer.parseInt(userX);
			b = Integer.parseInt(userB); // Asking user to input x and b variables while error checking
		}
		
		int counter = 0; // Initializing counter
		
		while (x >= b)
		{
			x/=b;
			counter++; // Dividing x by b and making x equal to the answer. The counter is then updated by adding 1 for how many times the division occurs until x is greater than or equal to b.
		}
		JOptionPane.showMessageDialog(null, "Your answer is: " + counter);
	}
}
