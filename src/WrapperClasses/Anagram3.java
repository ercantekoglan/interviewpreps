package WrapperClasses;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram3 {

	public static void main(String[] args) {

		String s = "S;M;plasticCup()";
		 String myString = s.substring(4,s.length()-2);
		int charIndex = 0;
		String result1 = "";
		for (int i = 1; i < myString.length(); i++) {
			if (Character.isUpperCase(myString.charAt(i))) {
				charIndex = myString.indexOf(myString.charAt(i));
				result1 += myString.substring(0, charIndex) + " ";
				myString = myString.substring(charIndex);
			}
		}
		System.out.println(result1.toLowerCase().trim() + " " + myString.toLowerCase());

	}
}
