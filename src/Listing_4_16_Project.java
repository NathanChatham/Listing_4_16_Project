
public class Listing_4_16_Project {
	public static void main(String[] args) {
		// Call a method to generate a random number in the range of a character.
			int randomUpperCaseNumberLetter = randomUpperCaseLetter();

		// Display the upper case letter 
			System.out.println("Your random upper case letter is: " + (char)randomUpperCaseNumberLetter);}
	
	public static int randomUpperCaseLetter(){
		// Declare our number range for the upper case letter
			int minLimit = 65;
			int maxLimit = 90;
			int Range = maxLimit-minLimit + 1;
			int randomNumberForLetter = minLimit + (int)(Math.random()*Range);
		// Return our static method
			return randomNumberForLetter;
	}
}