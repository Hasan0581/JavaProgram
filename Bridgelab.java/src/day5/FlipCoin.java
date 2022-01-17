package day5;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers ");
        int flipno=sc.nextInt();
        int i;
        for(i=0;i<flipno;i++)
        {
        	double rand=Math.random();
        	//System.out.println(rand);
        	if (rand<0.5) {
        		System.out.println("Tail");
        	}
        	else {
        		System.out.println("Head");
        	}
        }
	}

}
