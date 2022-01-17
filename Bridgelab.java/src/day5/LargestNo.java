package day5;

import java.util.Scanner;

public class LargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc1=new Scanner(System.in);
     System.out.println("Enter the first number");
     int num1=sc1.nextInt();
     Scanner sc2=new Scanner(System.in);
     System.out.println("Enter the second number");
     int num2=sc2.nextInt();
     Scanner sc3=new Scanner(System.in);
     System.out.println("Enter the third number");
     int num3=sc3.nextInt();
     
     if(num1>num2 && num1>num3)
     {
    	 System.out.println("The largest is" +num1);
     }
     
     else if(num2>num1 && num2>num3)
     {
    	 System.out.println("The largest is" +num2);
     }
     else {
    	 System.out.println("The largest is" +num3);
     }
	}

}
