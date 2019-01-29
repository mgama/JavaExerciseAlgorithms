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
		//Verify that the firstWord and secondWord variables 
		//are strings. Otherwise, return false
		if (inputDataIsValid(stringOne) && inputDataIsValid(stringTwo)){
			//Review the lengths of both strings. If they are different, 
			//then immediately return false
			if (stringOne.length() == stringTwo.length()) {
				return true;
			}
			else {
				return false; 
			}
		}
		else {
			return false;
		}
	}
}