
import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		
		Scanner text = new Scanner(System.in);
		String reverse = "";
		
		System.out.print("Enter any text you want to reverse read :");
		
	String name = text.nextLine();
	 int length = name.length();
	for (int i = length - 1; i >= 0; i--)
	reverse = reverse + name.charAt(i);
	System.out.println("the reverse of the text is :" + reverse);
	
		

	}

}
