package JavaExercises;

public class AnagramFinder {
	
	public boolean inputDataIsValid(Object inputData) {
		boolean dataIsValid = false;
		try{
			if (inputData instanceof Integer) {
				dataIsValid = false;
				System.out.println("Detected inputData to be an Integer");
			}
			else if (inputData instanceof String) {
				dataIsValid = true;
				System.out.println("Detected inputData to be a String");
			}
		}
		catch(Exception e){
			System.out.println("The inputData " + inputData + "was not a string");
		}
		return dataIsValid;
	}

	public boolean isAnagram(String stringOne, String stringTwo){
		boolean foundAnagram = false;
		//Verify that the firstWord and secondWord variables 
		//are strings. Otherwise, return false
		if (inputDataIsValid(stringOne) && inputDataIsValid(stringTwo)){
			//Review the lengths of both strings. If they are different, 
			//then immediately return false
			if (stringOne.length() == stringTwo.length()) {
				//Start comparing the first character from stringOne
				//to every character from stringTwo
				char[] stringOneCharArray = stringOne.toCharArray();
				char[] stringTwoCharArray = stringTwo.toCharArray();
				boolean[] arrayOfFoundChars = new boolean[stringOne.length()];
				for(int i = 0; i < stringOne.length() -1; i++) {
					for(int j = 0; j < stringOne.length() -1; j++) {
						if (stringOneCharArray[i] == stringTwoCharArray[j]) {
							//If the character from the first string matches
							//the character from the second string, then add 
							//a true value to the array of Found Characters (arrayOfFoundChars)
							arrayOfFoundChars[i] = true;
							System.out.println("Found character that is present on both strings");
						}
					};
				};
				//Verify the array of true/false objects. If at least one
				//of them is false, then the word is not an anagram
				for(int k = 0; k < arrayOfFoundChars.length -1; k++){
					if (arrayOfFoundChars[k] == true){
						foundAnagram = true;
						System.out.println("Found anagram " + foundAnagram);
					}
				};
				return foundAnagram;
			}
			else {
				return foundAnagram; 
			}
		}
		else {
			return foundAnagram;
		}
	}
}