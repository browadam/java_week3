package week3;

public class Methods {
	
	public static void main(String[] args) {
		
	System.out.println(addWords("Hello", 3));	
	
	System.out.println(myFullName("Adam", "Brown"));
	
	int[] numbers = new int[5];
		numbers[0] = 35;
		numbers[1] = 4;
		numbers[2] = 27;
		numbers[3] = 9;
		numbers[4] = 63;
	
	System.out.println(greaterThan100(numbers));
	System.out.println(myAverage(numbers));
	
	double[] numbers1 = new double[5];
		numbers1[0] = 15;
		numbers1[1] = 26;
		numbers1[2] = 81;
		numbers1[3] = 2;
		numbers1[4] = 6;
		
	double[] numbers2 = new double[5];
		numbers2[0] = 3;
		numbers2[1] = 53;
		numbers2[2] = 41;
		numbers2[3] = 20;
		numbers2[4] = 29;
		
		System.out.println(averageTwoArrays(numbers1, numbers2));
		
	System.out.println(willBuyDrink(true, 15.00));
	
	System.out.println("You will receive $" + stimulusAmount(2,4));
		
	}
	
	// Create a method that takes a string and concatenates the number of time passed as an int
	
	public static String addWords (String word, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += word;
		}
		return result;
	}
	
	// Create a method that concatenates the first and last name passed through to it
	
	public static String myFullName (String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	} 
	
	// Create a method that return true is sum of an array is greater than 100
	
	public static boolean greaterThan100(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		boolean total = sum > 100;
		return total;
	} 
	
	// Create a method that calculates the average off the elements in an array
	
	public static double myAverage(int[] elements) {
		int sum = 0;
		for(int element : elements) {
			sum += element;
		}
		double average = sum / elements.length;
		return average;
	}
	
	//Method to evaluate the average of 2 arrays and return true if the average of 1 is larger than the average of 2
	
	public static boolean averageTwoArrays(double[] numbers1, double[] numbers2) {
		double sum1 = 0;
		double sum2 = 0;
		double average1 = sum1 / numbers1.length;
		double average2 = sum2 / numbers2.length;
		boolean isLarger = average1 > average2;
		for(double num1 : numbers1) {
			sum1 += num1;
		}
		for(double num2 : numbers2) {
			sum2 += num2;
		}
		return isLarger;
	}
	
	// Method to determine if a drink will be bought based upon a boolean that determines if it is hot and whether enough money is had.
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		boolean buyDrink = isHotOutside == true && moneyInPocket > 10.50;
		return buyDrink;
	}
	
	// Method to calculate stimulus payment amount
	
	public static int stimulusAmount(int adults, int dependents) {
		int stimulus = 1400;
		int totalAmount = (adults + dependents) * stimulus;
		return totalAmount;
	}
	
	
	
}
