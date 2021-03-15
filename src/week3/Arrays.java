package week3;

public class Arrays {

	public static void main(String[] args) {
		// Arrays and Methods
		
		int ages[] = {3, 9, 23, 64, 2, 8, 28, 93, 40};
		System.out.println(ages[0] - ages[ages.length - 1]);
	

		// Sum up the total of ages and find the average age
		
		int ageTotal = 0;
		for(int i = 0; i < ages.length; i++) {
			
			ageTotal +=  ages[i];
			}
		System.out.println("The average age is: " + (ageTotal/ages.length));
		
		//String array with names and counting letters
		
		String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double letters = 0.00d;
		for(String name : names) {
			letters = name.length() + letters;
		}
		System.out.println(letters/names.length);
		
		//Concatenate all the names together
		String allNames = "";
		for(String name : names) {
			allNames += name + " " ;
		}
		System.out.println(allNames);
		
		//Create a new array for the length of each name
		
		double nameTotal = 0;
		double nameLengths[] = new double[names.length];
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
			nameTotal += nameLengths[i];
			}
		System.out.println("The average length of the names is: " + nameTotal/names.length);
		
	}
		
		
	
	
}
