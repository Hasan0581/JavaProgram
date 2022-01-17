package day5;

import java.util.Scanner;

public class AlphabetVowel {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char vowel=sc.next().charAt(0);
		
		if( vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel=='u' ) {
			 System.out.println("The character is vowel");
		}
		else {
			 System.out.println("The character is constant");
		}
	}

}
