package week04;

public class CodingWk4 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Create an array of ages with is initialized with the provides values
		
	
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; 
		
		//Subtract first element from last element 
		
		//ages[ages.length - 1] accesses the last element of the array using the length property to dynamically get the index.
		//ages[0] accesses the first element of the array. ages.lenth-1 subtracts ages[0] to find the difference and printed to console
		
		int result = ages[ages.length -1] - ages[0];
		System.out.println("Difference between first and last element " + result );
		
		//Create a new array ages2 w/ 9 elements while repeating subtraction
		
		int[] ages2 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		int result2 = ages2[ages2.length -1] - ages2[0];
		System.out.println("Difference between first and last element in ages2: " + result2 );
	
		// Calculate average age
		
		//A loop iterates through each element (age) in the 'ages' array.
		//Inside the loop, each element is added to the 'totalAge' variable.
		//After the loop, the average is calculated by dividing 'totalAge' by the number of elements in the array
		//(ages.length) and is printed to the console.

		int totalAge = 0;
			for (int age : ages) {
				totalAge += age;
			}
		double averageAge = (double) totalAge / ages.length;
		System.out.println("Average age " + averageAge);
		
		
			
		// Create and initialize a string array called names with provided elements
		
		String[] names = {"sam", "Tommy","Tim", "Sally", "Buck", "Bob" };
		
		// calculate average letters per name, iterate through names array using for loop, for each name
		// we add its length to the totalLetters variable
		
		int totalLetters = 0;
		for (String name : names) {
			totalLetters += name.length();
		}
		
		// after the loop we calculate the average by dividing totalLetters by the number of names
		// (names.length and print the result.
		
		double averageLetters = (double) totalLetters / names.length;	
	    System.out.println("Average letters per name: " + averageLetters);
	   
	    // Initializes string, 'concatenatedNames'.  It uses a for loop to iterate over an array called names.
	    // During each iteration, it appends the current element of the names array to the concatenatedNames string, followed by a space.
	    // After the loop it prints 'concatenatedNames' to console using the 'trim method to remove leading and trailing white space from 
	    // the final concatenated string.
	    String concatenatedNames = "";
	    for (int i = 0; i < names.length; i++) {
	    	concatenatedNames += names[i] + " ";
	    }
		System.out.println("concatenatedNames): " + concatenatedNames.trim());
		
	    //Accessing last element: names[names.length -1 print out the last element of 'names array to console.
		
		System.out.println(("Last element: " + names[names.length -1] ));
		
		//Accessing first element of 'names' array and prints to console.
		
		System.out.println("First element: " + names[0]);
		
		//Create and initialize the 'namesLength' array with the dame dumber of elements as the 'names array. Both elements are initially set to 0.
		// the for loop iterates through each index of the names array from 0 to 'namesLength-1'.
	    
		int[] nameLengths = new int [names.length];
	    for (int i = 0; i < names.length; i++) {
	    // this line inside the loop assigns the length of the string at 'names[i] to the index 'namesLength
	    	nameLengths[i] = names[i].length();
	    }
	   
	    // Code initialized  integer variable 'sumLength', used to accumulate the  the sum of elements in the 'nameLength' array. 
	    // using an enhanced for loop to iterate over each element in the 'nameLength' array. In the loop the value of length is added to 'sumLenght
	    // The code calculates and prints the total sum of elements using 'sumLength' concatenated message.  
	    int sumLength = 0;
	    for (int length : nameLengths) {
	    	sumLength += length;
	    }
	    
	    System.out.println("Sum of name lengths: " + sumLength);
	    
	   
	    
	    //Method 7 code: Using the 'repeatWord' method the code intends to repeat the string 'Hello" 3 times & print result
	    // to console
	   
	    String repeated = repeatWord("Hello", 3);
	    System.out.println(repeated); 
	    
	   
	    // Method 8 code; this code declares two String variables, it calls the method named getFullName passing the
	    // person1Firstname and person1Lastname as arguments. this method returns a string that creates the full name of the
	    // person and prints it to screen.
	
		String person1FirstName = "Joe";
		String person1LastName = "Blow";
		String fullName = getFullName(person1FirstName, person1LastName); 
		System.out.println(fullName);
		
		//Method 9 Testing method 9, returns true if age is under 100 and prints to console
		System.out.println(isSumGreaterThan100(ages));
	
		//A call to print Method 13
		printThreeTimes();
	
	
	} //end of main ***********************************************

	 	
		//Method 7: Using StringBuilder demonstrates the append method, the method 'repeatWord' takes a String called 'word' and an 'integer n' as the 
		//argument and will return a String. 
		
		private static String repeatWord(String word, int n) {
		StringBuilder result = new StringBuilder();
			for(int i = 0; i < n; i++)
				result.append(word).append(" ");
		return result.toString().trim();
		}
		
		//Method 8:  using two Strings firstName and lastName to return a fullName using concatenation.
		
		public static String getFullName(String firstName, String lastName) {
		return firstName + " " + lastName;	
		}
		
		//Method 9:  Method initializes integer variable 'sum'to 0, uses enhanced for loop to iterate
		//over each 'num' in input array. When loop is finished the method checks if the total sum is greater
		//than '100' and returns true if it is.  
		public static boolean isSumGreaterThan100(int[] nums) {
	        int sum = 0;
	        for (int num : nums) {
	            sum += num;
	        }
	        return sum > 100;
		}
	   
	    //Method 10. The variable 'sum' is initialized to 0 that will be used to accumulate the sum
	    // of arrays. enhanced for look goes through each element, calculates the sum and finds average. 
	    // Method will return a double value.
	        
	    public static double calculateAverage(double[] numbers) {
	    double sum = 0;
	    for (double num : numbers) {
	    	sum += num;
	    }
			return sum / numbers.length;
	    }
		
		//Method 11. Method takes two double arrays arr1 and arr2 as input. Calls the calculateAvergae helper method
		//to calculate each array. Method returns true if the average of arr1 is greater than arr2's average other
		//wise returns false.
		
		public static boolean isFirstArrayAverageHigher(double[] arr1, double[] arr2) {
			double avg1 = calculateAverage(arr1);
			double avg2 = calculateAverage(arr2);
			return avg1 > avg2; 
		}	
			
		//Method 12. Declares a public method named 'wiiBuyDrink' that returns a boolean value
		//the method take two double parameters isHotOutside and moneyInPocket.
		
		public boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
		//This line checks to see if both conditions are true and returns true otherwise false
		 return isHotOutside && moneyInPocket >	10.50;
		}
		
		//Method 13. Declare public method name 'printThreeTimes', create a for loop
		//to print to screen, "I just love Java", 3 times. 
		
			public static void printThreeTimes() {
			
			for(int i = 0; i < 3; i++)	{
			System.out.println("I just love Java!!!");
			}
			}
		
			 
		//END*********************************************************************
		
		
		
}
