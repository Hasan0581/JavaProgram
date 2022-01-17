package day5;

import java.util.Scanner;

public class EvenOddNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		num=num%2;
		if(num==0) {
			System.out.println("The number is Even");
		}
		else {
			System.out.println("The number is Odd");
		}
	}
}
