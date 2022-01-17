package basic.java;
import java.util.*;
public class UC3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM");
        int EmpratePerHr = 20;
    	int EmpHr = 8;
    	int EmpPartTimeHr = 4;
    	
        int rand = (int) (Math.random() * 3);
        switch(rand) {
        case 0:
        		{
        	System.out.println("Employee is present");
        	int salary = (EmpratePerHr*EmpHr);
        	System.out.println("The salary of Employee"  +salary);
        	break;
        }
        case 1:
        {
        	System.out.println("Employee is PartTime");
        	int salary=(EmpratePerHr*EmpPartTimeHr);
        	System.out.println("The salary of Employee"  +salary);
            break;
        }
        
        default:System.out.println("Employee is absent");
        
        }
	}
}


