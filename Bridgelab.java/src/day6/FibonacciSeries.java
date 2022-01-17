package day6;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter series no till you want to print");
		int num=sc.nextInt();
		
		    	  int  firstTerm = 0, secondTerm = 1;
			         System.out.println("Fibonacci Series till " + num + " terms:");

			      for (int i = 1; i <= num; ++i) {
			         System.out.print(firstTerm + ", ");

			      int nextTerm = firstTerm + secondTerm;
			      firstTerm = secondTerm;
			      secondTerm = nextTerm;
			    }
			  
	}

}
