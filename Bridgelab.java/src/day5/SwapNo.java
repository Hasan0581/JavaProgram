package day5;

import java.util.Scanner;

public class SwapNo {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		Scanner sc1=new Scanner(System.in);
		int num2=sc1.nextInt();
		
		System.out.println("Number before swapping"+" " +num1+"   " +num2);
		int var;
		var=num1;
		num1=num2;
		num2=var;
		System.out.println("Number after swapping"+" " +num1+"   "+num2);
	}

}
