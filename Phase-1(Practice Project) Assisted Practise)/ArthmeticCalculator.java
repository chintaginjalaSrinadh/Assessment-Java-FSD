package phase1.project.Lesson12;

import java.util.Scanner;
public class ArthmeticCalculator {
public static void main(String[] args) {
	int n1,n2,res;
Scanner scan = new Scanner(System.in);
System.out.println("Select the method u like 	+ , -, /, or *");
String mathType = scan.next();

if (mathType.equalsIgnoreCase("+")) 
{ System.out.println("enter the first number ");
n1 = scan.nextInt ();
System.out.println("Enter your second number");
n2 = scan.nextInt ();
res=n1+n2;
System.out.println(" the addition of two numbers is:" +(res));
}

else if (mathType.equalsIgnoreCase("-")) {	System.out.println("enter the first number");
n1= scan.nextInt();
System.out.println("Enter your second number");
n2 = scan.nextInt();
res=n1-n2;
System.out.println(res); } 

else if (mathType.equalsIgnoreCase("/")) {
System.out.println("enter the first number ");
n1 = scan.nextInt();
System.out.println("Enter your second number");
n2 = scan.nextInt();
res=n1/n2;
System.out.println("the divide answer is:" +res);} 

else if (mathType.equalsIgnoreCase("*")){
System.out.println("enter the first number ");
n1 = scan.nextInt ();
System.out.println("Enter your second number");
n2 = scan.nextInt();
res=n1*n2;
System.out.println(" the multiplication answer is:" +res);
}
}
}
