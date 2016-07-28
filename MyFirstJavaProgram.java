import java.util.Scanner;
public class MyFirstJavaProgram{
/* This is my first java program.
* This will print 'Hello World' as the output
*/
	
	
public static void main(String[]args){
/*System.out.println(7 == 7);
System.out.println(true && true);// prints Hello World
System.out.print(true && false);
System.out.println(false && true);
System.out.print(false && false);
String cup;
 cup = "moshen is fake";
 System.out.println(cup);*/
 double tax;
 double bonus;
 double totalpay;
 String EmployeeName;
 
 Scanner pay = new Scanner(System.in);
 System.out.print("Name of the employee : ");
 EmployeeName = pay.next();
 System.out.print("Enter basic pay : ");
 double basicpay = pay.nextDouble();
 System.out.print("What is the total bonus : ");
 bonus = pay.nextDouble();
 tax = 0.3*basicpay;
 System.out.println("Total tax deductions = " + tax);
	  totalpay = (basicpay + bonus) - tax;
	if (totalpay > 20000){
		 tax = 0.45*basicpay;
		 totalpay = (basicpay + bonus) - tax;
		 System.out.println(EmployeeName + "  " + "earns" + " " + totalpay);
	  
		 
	  }
	else {
		System.out.println(EmployeeName +  "  " + "earnings = " + "  " + totalpay);
	}
  }
  
  
}
