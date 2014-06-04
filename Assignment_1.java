/*Menu
 *1.Quit the program
 *2.Output the most common integer from a list of integers, separated by commas
 *3.Display the average 
 *4.Adjust decimal point */ 

/*
	Program Bugs: 
	-User inputted a random list that aren't integers
*/

import java.util.Scanner; 

public class Assignment_1
{
	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
		String input; 

		System.out.println("Heyyy");
		System.out.println("Select an option: "+"\n" + "1. Quit" + "\n" + "2. Find most common integer out of a list" + "\n"+"3. Display average"+
			"\n"+"4. Adjust the decimal point of an integer");
		input = in.next();

		while(!input.equals("1"))
		{
			if(input.equals("2"))
			{	
				System.out.println("\n" + "Enter a list of integers, separated by a comma.");
				String intList = in.next(); 
				// delimit the commas into the array 
				String strArray [] = intList.split(",");

				// Convert strArray[] into type 'int'
				int intArray [] = new int [strArray.length]; 
				for (int i = 0; i < strArray.length; i++)
				{
					intArray[i] = Integer.parseInt(strArray[i]);
					System.out.println(intArray[i]);
				}
				
				// Search through the array and keep track of the most common integer
				// pivot and counter stores the current values in the array to be compared
				int pivot = 0; // The number 
				int counter = 0; // The occurrences of that number
				// The number and the highest occurences will be stored in these variables
				int cgreat = 0; 
				int pgreat = 0; 

				//Store the occurences of each element into track
				for (int i = 0; i < intArray.length; i++)
				{
					// Set pivot to the element to be compared with the other elements in the array
					pivot = intArray[i]; 

					// Parse through the array to find a match. If found, increment counter
					for (int j = 0; j < intArray.length; j++)
					{
						if (pivot == intArray[j])
							counter++; 
					}

					// Check if the counter is larger than the current 'greatest'
					if (counter > cgreat)
					{	
						cgreat = counter;
						pgreat = pivot;
					}
					counter = 0; // Reset the counter for the next element
				}
				if (cgreat > 1) 
					System.out.println("\n The most common integer is: " + pgreat + " \n number of instances: " + cgreat);
				else 
					System.out.println("There is no common integer in the given list.");
			}

			if(input.equals("3"))
			{
				System.out.println("\nEnter a list of integers, separated by a comma.");
				input = in.next(); 
				String strArray [] = input.split(",");
				// Convert array into 'int'
				int intArray [] = new int[strArray.length];
				int size = intArray.length; 
				for(int i = 0; i < size; i++)
				{
					intArray[i] = Integer.parseInt(strArray[i]);
				}


				int sum = 0; 
				for(int j = 0; j < size; j++)
				{
					sum += intArray[j];
				}	

				int average = sum/size; 
				System.out.println("\n The average is " + average);
			}

			if(input.equals("4"))
			{
				System.out.println("\nEnter an integer");
				double num = in.nextInt(); 
				System.out.println("How many spaces from the right of the integer to place the decimal point?");
				int spaces; 
				spaces = in.nextInt(); 

				double divide =1; 
				for(int i =0; i < spaces; i++)
				{
					divide *=10;
				}

				double result = num/divide; 
				System.out.println("\n Result : " + result);
			}

			System.out.println("Select an option: "+"\n" + "1. Quit" + "\n" + "2. Find most common integer out of a list" + "\n"+"3. Display average"+
				"\n"+"4. Adjust the decimal point of an integer");
			input = in.next();
		}
		System.out.println("\n" + "Goodbye~"); 
	}	
}