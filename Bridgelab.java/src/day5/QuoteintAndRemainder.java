package day5;

import java.util.Scanner;

public class QuoteintAndRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int dividend=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the divisor");
        int divisor=sc1.nextInt();
        
        int quoteint=dividend/divisor;
        int remainder=dividend%divisor;
        
        System.out.println("Quoteint=" +quoteint);
        System.out.println("Remainder=" +remainder);
	}

}
