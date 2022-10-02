package edu.pitt.lab5;

import java.util.Random;
import javax.swing.JOptionPane; // Importing classes for showing input and generating random numbers

public class RollingTwoDice 
{
	public static void main(String[] args) 
	{
		/*
		 * 1. Write static void method called RollDice with two parameters: int and Random
		 * 		int: will indicate how many times to roll the dice. This will be just asking the user to enter an integer.
		 * 		Random: generate the actual values. Will create method that produces an integer between 1 and 6. Add these up later for the actual roll value.
		 * 2. Once the rolls are carried out, divide how many times each possible outcome occurred divided by the integer given by the user earlier and print them out
		 * 3. Add loop to ask user if they want to run the program again
		 */
		String userInput = "Y";
		while (userInput.equalsIgnoreCase("Y")) // Loop to ask user if they want to run the program again
		{
			Random rand = new Random(); // Object to create random integers 
			String userNum = JOptionPane.showInputDialog("How many times do you want to roll the dice?"); // Ask users how many times they want to roll the dice
			int x = Integer.parseInt(userNum);
			RollDice(x, rand); // Calling upon method to roll dice twice how ever many times the user inputed
			userInput = JOptionPane.showInputDialog("Would you like to roll again? (Y/N)"); // Asking user if they would like to loop again
		}
	}
	
	public static void RollDice(int x, Random rand)
	{
		int upperBound = 6;
		int die1;
		int die2;
		int total;
		int poss2 = 0;
		int poss3 = 0;
		int poss4 = 0;
		int poss5 = 0;
		int poss6 = 0;
		int poss7 = 0;
		int poss8 = 0;
		int poss9 = 0;
		int poss10 = 0;
		int poss11 = 0;
		int poss12 = 0; // Initializing variables
		
		for (int i = 0; i < x; i++)
		{
			die1 = rand.nextInt(upperBound) + 1;
			die2 = rand.nextInt(upperBound) + 1; // Generating two random numbers 1-6
			total = die1 + die2;
			
			if (total == 2)
			{
				poss2++;
			}
			else if (total == 3)
			{
				poss3++;
			}
			else if (total == 4)
			{
				poss4++;
			}
			else if (total == 5)
			{
				poss5++;
			}
			else if (total == 6)
			{
				poss6++;
			}
			else if (total == 7)
			{
				poss7++;
			}
			else if (total == 8)
			{
				poss8++;
			}
			else if (total == 9)
			{
				poss9++;
			}
			else if (total == 10)
			{
				poss10++;
			}
			else if (total == 11)
			{
				poss11++;
			}
			else if (total == 12)
			{
				poss12++;
			} // Loop that generates two numbers 1-6 and adds them together. Total then goes through if statements and adds up how many times a certain outcome was produced. 
		}
		JOptionPane.showMessageDialog(null, "The probabilites for the outcomes are: \n" + "Outcome of 2: " + (double)poss2/x * 100 + "% \n" + "Outcome of 3: " + (double)poss3/x * 100 + "% \n" + "Outcome of 4: " + (double)poss4/x * 100 + "% \n" + "Outcome of 5: " + (double)poss5/x * 100 + "% \n" + "Outcome of 6: " + (double)poss6/x * 100 + "% \n" + "Outcome of 7: " + (double)poss7/x * 100 + "% \n" + "Outcome of 8: " + (double)poss8/x * 100 + "% \n" + "Outcome of 9: " + (double)poss9/x * 100 + "% \n" + "Outcome of 10: " + (double)poss10/x * 100 + "% \n" + "Outcome of 11: " + (double)poss11/x * 100 + "% \n" + "Outcome of 12: " + (double)poss12/x * 100 + "%");	
	}
}
