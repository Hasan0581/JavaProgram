package day6;

import java.util.Scanner;
public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int i,m=0,flag=0;      
		  m=num/2;      
		  if(num==0||num==1)
		  {   
		   System.out.println(num+" is not prime number");      
		  }
		   else{  
		   for(i=2;i<=m;i++){      
		    if(num%i==0){      
		     System.out.println(num+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(num+" is prime number"); }  
		  }  
		}    
		
	}


