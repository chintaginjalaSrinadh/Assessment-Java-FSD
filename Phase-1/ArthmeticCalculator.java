package com.srinadh.basic;

import java.util.Scanner;

public class cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 double number1 =sc.nextDouble();
		 
		 char operator = sc.next().charAt(0);
		 
		 double number2 = sc.nextDouble();
		 double result = 0.0;
		 
		 switch(operator) {
		 case '+' :
		  result = number1 + number2;
		  System.out.println( "The result of two Numbers is:"+result);
		  break;
		  
		 case '-' :
		  result = number1 - number2;
		  System.out.println( "The result of two Numbers is:"+result);
		  break;
		  
		 case '*' :
		  result = number1 * number2;
		  System.out.println("The result of two Numbers is:"+result); 
		  break;
		  
		 case '/' :
		  result = number1 / number2;
		  System.out.println("The result of two Numbers is:"+result); 
		  break;
		  
		  default:
			  System.out.println("Invalid operator. Please Enter the valid operator");
			  break;
		 }
	}

}
