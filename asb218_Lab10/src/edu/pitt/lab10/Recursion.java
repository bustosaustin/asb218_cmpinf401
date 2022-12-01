package edu.pitt.lab10;

public class Recursion 
{
	int sumOfDigits(int x)
	{
		if (x == 0)
		{
			return 0;
		}
		
		else if (x < 0)
		{
			return (x * (-1))%10 + sumOfDigits(x/10);
		}
		
		else
		{
			return x%10 + sumOfDigits(x/10);
		}
	}
	
	void printArrayElements(int a[], int index)
	{
		if (index != -1)
		{
			printArrayElements(a, index -1);
			System.out.println(a[index]);
		}
	}
	
	/*
	public static void main(String args[])
	{
		int[] a = {-2, 3, -4, 2};
		printArrayElements(a, a.length - 1);
	} 
	*/ // Driver program for printArrayElements. (Change the function to static for this driver function to work.)
	
	/*
	public static void main(String args[])
    {
        int x = -444;
        int result = sumOfDigits(x);
        System.out.println("Sum of digits in " + x + " is: " + result);
    }
    */ // Driver program for sumOfDigits. (Change the function to static for this driver function to work.)
}