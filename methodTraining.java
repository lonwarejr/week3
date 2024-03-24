package lesson1methods;

public class methodTraining {

	public static void main(String[] args) {
		        int[] array = {1, 5, 2, 8, 13, 6};
		        
		        String[] names = {"Sam", "Sally", "Thomas", "Robert"};
    	        
		             //code not working past this line
		           // 12. Calculate the sum of all the letters in the new array
                   int sumOfLetters = 0;
                    for (String name : names) {
        	            sumOfLetters += name.length();
                }
                 // Methods:
				// 13. Write and test a method that takes a String name and prints out a greeting. 
				//			This method returns nothing.
				greet("Tom");
				greet("Sally");
				
				// 14. Write and test a method that takes a String name and  
				//			returns a greeting.  Do not print in the method.
                String greeting = greet2("Nick");
                System.out.println(greeting);
				
				// Compare method 13 and method 14:  
				//		a. Analyze the difference between these two methods.
				//		b. What do you find? 
				//		c. How are they different?
				
				
				// 15. Write and test a method that takes a String and an int and 
				//			returns true if the number of letters in the string is greater than the int
				System.out.println(isStringLongerThanNumber("Hello", 3));
				
				// 16. Write and test a method that takes an array of string and a string and 
				//			returns true if the string passed in exists in the array
				System.out.println(doesArrayContainString(names, "Sam"));
				
				// 17. Write and test a method that takes an array of int and 
				//			returns the smallest number in the array
				System.out.println(findTheSmallestNumber(array));
				
				// 18. Write and test a method that takes an array of double and 
				//			returns the average
				double[] doubles = {45.7, 30.2, 67.3};
				System.out.println(calculateAverage(doubles));

				// 19. Write and test a method that takes an array of Strings and 
				//			returns an array of int where each element
				//			matches the length of the string at that position
				int[] nameLengths = exctractStringLengths(names);
				for (int number : nameLengths) {
					System.out.println(number);
				}
						
				// 20. Write and test a method that takes an array of strings and 
				//			returns true if the sum of letters for all strings with an even amount of letters
				//			is greater than the sum of those with an odd amount of letters.
                System.out.println(hasMoreEvenWordCharacters(names));
			
				// 21. Write and test a method that takes a string and 
				//			returns true if the string is a palindrome
                System.out.println(isPalindrome("mom"));

	}
    //13
	public static void greet(String name) {
		System.out.println("Hello, " + name + "!");
	}
	//14
	public static String greet2(String name) {
		return "Hi " + name + "!";
	}	
	//15
	public static boolean isStringLongerThanNumber(String string, int number) {
		if (string.length() > number) {
			return true;
		}else {
			return false;
		}
	}
	//16
	public static boolean doesArrayContainString(String[] array, String string) {
		for (String str : array) {
			return true;
		}
		return false;
	}
	//17
	public static int findTheSmallestNumber(int[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			if (number < smallest) {
				smallest = number;
			}
		}
		return smallest;
	}
	//18
	public static double calculateAverage(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		return sum / array.length;
	}
	//19
	public static int[] exctractStringLengths(String[] strings) {
		int[] results = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			results[i] = strings[i].length();
		}
		return results;
	}
	//20
	public static boolean hasMoreEvenWordCharacters(String[] array) {
		int evenLetters = 0;
		int oddLetters = 0;
		
		for (String string : array) {
			if (string.length() % 2 == 0) {
				evenLetters += string.length();
			}else {
				oddLetters += string.length();
						
			}
			
		}
		return evenLetters > oddLetters;
		
    }
	//21
	public static boolean isPalindrome(String string) {
                                       // /2 divided by two can also be added due to in palindrome you only need half		
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
