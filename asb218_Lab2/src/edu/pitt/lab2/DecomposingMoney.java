package edu.pitt.lab2;

import javax.swing.JOptionPane; // Import class to enable JOptionPane

public class DecomposingMoney 
{
	public static void main(String[] args) 
	{
		String mStr = JOptionPane.showInputDialog("Enter dollar amount"); // Ask user for dollar amount; assumes that user will enter integer between 1 and 9999
		int m = Integer.parseInt(mStr); // Converts string to integer
		
		int grands = m/1000;
		double bInitial = m%1000;
		int benjamins = (int)(bInitial/100);
		double sInitial = m%100;
		int sawbucks = (int)(sInitial/10);
		int bucks = m%10; // Calculating/decomposing the inputed number to grands, benjamin, sawbucks, and bucks
		
		JOptionPane.showMessageDialog(null, grands + " grands\n" + benjamins + " Benjamins\n" + sawbucks + " sawbucks\n" + bucks + " bucks"); // Output decomposed parts as a list
	}

}
