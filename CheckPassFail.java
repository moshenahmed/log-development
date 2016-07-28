
// package moshenwork;
import java.util.Scanner;

public class CheckPassFail {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		 System.out.print("Enter the number :");
		int mark = number.nextInt();
		if (mark >= 50){
			System.out.println("PASS");
		}
		
		else {
			System.out.println("FAIL");
		}
	System.out.println("DONE");	
		

	}

}
