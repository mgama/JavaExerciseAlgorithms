// package com.javaexercises;

import java.util.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class EmailGenerator {

  public static String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

  public static String randomAlphaNumeric() {
    StringBuilder builder = new StringBuilder();
    int count = 10;
    while (count-- != 0) {
      int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
      builder.append(ALPHA_NUMERIC_STRING.charAt(character));
    }
    return builder.toString();
  }
	public static void main(String[] args) throws IOException
    {
      FileWriter write = new FileWriter("generatedEmailAddresses3.txt", true);
      PrintWriter print_line = new PrintWriter(write);
      int emailAddressCounter = 25000;
      while(emailAddressCounter-- != 0){
        String randomString = randomAlphaNumeric();
        // print_line.printf("%s" + "%n", randomString + "@hotmail.com,");
        // print_line.printf("%s" + "%n", randomString + "@gmail.com,");
        print_line.printf("%s" + "%n", randomString + "@yahoo.com,");
      }
      print_line.close();
    }

}
