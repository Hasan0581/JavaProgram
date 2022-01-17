package day6;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to reverse");
		int num=sc.nextInt();
		int reverse=0;  
		while(num != 0)   
		{  
		int remainder = num%10;  
		reverse = reverse*10+remainder;  
		num=num/10;  
		}  
		
		System.out.println("The reverse of the given number is: " + reverse);  
		 
		  
	}

}
