package com.fizzbuzz;

import java.util.Scanner;

public class FizzBuzz {
    public static String fizzBuzz(String str) {
    	try{
    		int number = Integer.parseInt(str);
            if (number % 3 == 0 && number % 5 == 0) return "FizzBuzz";
            else if (number % 3 == 0) return "Fizz";
            else if (number % 5 == 0) return "Buzz";
            else return "Divided "+ number+ " by 3 "+"\n" +"Divided "+number +" by 5";
        } catch (NumberFormatException e) {
        	 return "Invalid Item";
        }
    }
 
    public static void main( String[] args ) {
        System.out.println( "Welcome to FizzBuzz \n" );
        String[] strArray = {"1", "3", "5", "", "15", "A", "23" };
        for(String str : strArray) {
        	  System.out.println(fizzBuzz(str));
        }
        boolean type = true;
        while(type) {
            Scanner input = new Scanner(System.in);
            System.out.println("Note: Type Exit to close the Application ");
            System.out.println("Enter your number to check FizzBuzz: ");
            String in = input.next();
            if(in.equalsIgnoreCase("exit")){
                type = false;
            } else {
                System.out.println(fizzBuzz(in));
            }
        }
    }
}
