// package JavaExercises;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmailDuplicateFinder {

	public static void main(String[] args)
    {
        long startTime = System.nanoTime();
        // create a hash set
      	HashSet hs = new HashSet();

        // String csvFile = "MOCK_DATA.csv";
        String emailAddressesFile = "generatedEmailAddressesWithDuplicates.txt";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(emailAddressesFile))) { //Read the mock data file with the email addresses
          while ((line = br.readLine()) != null) {
              String[] email = line.split(cvsSplitBy); //Read each email address one by one
              hs.add(email[0]); //Add each email address to the hash set. If the value is duplicated, it wont be added.
          }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long elapsedTime = System.nanoTime() - startTime;
        // System.out.println(hs);
        System.out.println("Total execution time in Java in millis: "
                + elapsedTime/1000000);

        System.out.println(hs.size());
        //With the MOCK_DATA.csv test file, they are 500 duplicated email addresses out of 2500, therefore the hashset will be
        //only 2000 in size
    }

}
