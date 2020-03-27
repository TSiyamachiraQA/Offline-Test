package main;

import java.lang.annotation.Repeatable;

import javax.print.DocFlavor.INPUT_STREAM;

import jdk.internal.util.xml.impl.Input;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") returns "TTThhheee"
	// multChar("AAbb") returns "AAAAAAbbbbbb"
	// multChar("Hi-There") returns "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		
		
	 for (int i = 0; i < 1 ; i++) {
		
	  input.substring(i, i + 1) + input.substring(i, i + 1);
		 
	 }
		return "" ;
	}

	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") returns "evilc"
	// getBert("xxbertfridgebertyy") returns "egdirf"
	// getBert("xxBertfridgebERtyy") returns "egdirf"
	// getBert("xxbertyy") returns ""
	// getBert("xxbeRTyy") returns ""

	public String getBert(String input) {
		
		
		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) returns true
	// evenlySpaced(4, 6, 2) returns true
	// evenlySpaced(4, 6, 3) returns false
	// evenlySpaced(4, 60, 9) returns false

	public boolean evenlySpaced(int a, int b, int c) {
		
		int differenceAB = b - a;
		int differenceBA = a - b;
		int differenceCB = b - c;
		int differenceBC = c - b;
		
		if( differenceAB == differenceBC ) {
			System.out.println("true");
			return true;
		}
		else if (differenceBA == differenceBC ) {
				System.out.println("true");
				return true;
			}
		else if(differenceAB == differenceCB ) {
			System.out.println("true");
			return true;
		}
		else if (differenceBA == differenceCB ) {
				System.out.println("true");
				return true;
			}
		else {
			System.out.println(false);
		return false;
		}
	}

	// Given a string and an int n, return a string that removes n letters from the
	// 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input
	// is odd.

	// nMid("Hello", 3) returns "Ho"
	// nMid("Chocolate", 3) returns "Choate"
	// nMid("Chocolate", 1) returns "Choclate"

	public String nMid(String input, int a) {
		
		String start = input.substring(0, (input.length()-(1))/2 - (a%2));
		String end = input.substring(input.length()/2 + (a-1) , input.length());
		// String end = input.substring(input.length()/2 + (input.length() - a) , input.length());
		
		System.out.println(start + end);
		
		return start + end;
		
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") returns true
	// endsDev("wehateDev") returns true
	// endsDev("everoyonehatesdevforreal") returns false
	// endsDev("devisnotcool") returns false

	public boolean endsDev(String input) {
		if (input.endsWith("dev")) {
			
			return true;
		}
		else {
		}
		return false;
	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") returns 2
	// superBlock("abbCCCddDDDeeEEE") returns 3
	// superBlock("") returns 0

	public int superBlock(String input) {
	
		return -1;

	}

	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") returns 1
	// amISearch("I am in Amsterdam am I?") returns 2
	// amISearch("I have been in Amsterdam") returns 0

	public int amISearch(String arg1) {

	
		return 0;

	}

	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5return "fizzbuzz"
	//
	// fizzBuzz(3) returns "fizz"
	// fizzBuzz(10) returns "buzz"
	// fizzBuzz(15) returns "fizzbuzz"

	public String fizzBuzz(int arg1) {
	
		 if (arg1 % 3 == arg1 % 5) {
		 System.out.println("fizzbuzz");
		 return "fizzbuzz"; 
		 }
		 
		 else if ( arg1 % 3 == 0) {
			System.out.println("fizz");
			 return "fizz";
		 }
		 else if (arg1 % 5 == 0) {
			 System.out.println("buzz");
			 return "buzz";
		
		 }
		 else {
		 }
		 
		 return null;
		 }
		

	// Given a string split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") returns 14
	// largest("15 72 80 164") returns 11
	// largest("555 72 86 45 10") returns 15

	public int largest(String arg1) {

		return 0;

	}

}
