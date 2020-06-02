// package JavaExercises;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmailDuplicateFinder {

	public static void main(String[] args)
    {

        // create a hash set
      	HashSet hs = new HashSet();

        //Sample set
        // hs.add("mgama12345@gmail.com");
        // hs.add("sford3456@hotmail.com");
        // hs.add("hwolfram5677@hotmail.com");
        // hs.add("greyes789@yahoo.com");
        // hs.add("j.tesla789@gmail.com");
        // hs.add("j.tesla789@gmail.com");

        String csvFile = "MOCK_DATA.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) { //Read the CSV with the email addresses
          while ((line = br.readLine()) != null) {
              String[] email = line.split(cvsSplitBy); //Read each email address one by one
              hs.add(email[0]); //Add each email address to the hash set. If the value is duplicated, it wont be added.
          }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(hs);
        System.out.println(hs.size());
        //With the MOCK_DATA.csv test file, they are 500 duplicated email addresses out of 1500, therefore the hashset will be
        //only 1000 in size
    }

}
