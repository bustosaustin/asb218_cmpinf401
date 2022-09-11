package edu.pitt.lab2;

import javax.swing.JOptionPane; // Importing class to enable JOptionPane 
import java.lang.Math; // Importing class to enable math operations

public class PythagoreanTheorem 
{
	public static void main(String[] args) 
	{
		String aStr = JOptionPane.showInputDialog("Enter an integer number for triangle side 'a'"); // Asking user to enter first number for side "a". Initially stored as string variable
		int aSide = Integer.parseInt(aStr); // Convert inputed variables into integers
		String bStr = JOptionPane.showInputDialog("Enter another integer number for triangle side 'b'"); // Ask user to enter another number for other side
		int bSide = Integer.parseInt(bStr); // Convert to integer
		
		double c = Math.sqrt(Math.pow(aSide, 2)+Math.pow(bSide, 2)); // Calculate the hypotenuse using inputed variables 'a' and'b'
		
		double cMult = c*100;
		int cRound = (int)Math.round(cMult);
		double cFinal = cRound/100.0; // These lines help reduce calculated hypotenuse to two decimal places
		
		JOptionPane.showMessageDialog(null, "The hypotenuse is: " + cFinal); // Display result in window
	}

}
