package basic.java;
import java.util.*;
public class UC1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM");
        
        int rand = (int) (Math.random() * 2);
        if (rand == 0) {
        	System.out.println("Employee is present");
        	int EmpratePerHr = 20;
        	int EmpHr = 8;
        	int salary = (EmpratePerHr*EmpHr);
        	System.out.println("The salary of Employee"  +salary);
        }
        else {
        System.out.println("Employee is absent");
        }
	}

}
