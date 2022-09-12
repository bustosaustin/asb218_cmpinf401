package edu.pitt.lab2;

import javax.swing.JOptionPane; // Import class to enable JOptionPane
import java.lang.Math; // Import class to enable required math operations

public class AreaPerimeter 
{
	public static void main(String[] args) 
	{
		String rStr = JOptionPane.showInputDialog("Enter radius of a circle"); // Ask user for radius of a circle
		double r = Double.parseDouble(rStr); // Convert inputed string into double
		
		final double PI = 3.14159; // Declaring pi as a constant
		double p = 2*PI*r;
		double a = PI*(r*r); // Calculated the perimeter, p, and area, a, based off of inputed variable, r
		
		double rMult = r*100;
		int rRound = (int)Math.round(rMult);
		double rFinal = rRound/100.0; // Rounding r to two decimal places
		
		double pMult = p*100;
		int pRound = (int)Math.round(pMult);
		double pFinal = pRound/100.0; // Rounding p to two decimal places
		
		double aMult = a*100;
		int aRound = (int)Math.round(aMult);
		double aFinal = aRound/100.0; // Rounding a to two decimal places
		
		JOptionPane.showMessageDialog(null, "The circle with radius " + rFinal + " has a perimeter of " + pFinal + " and an area of " + aFinal); // Display results in a window
	}

}
