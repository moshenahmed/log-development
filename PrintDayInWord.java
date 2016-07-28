import java.util.Scanner;

public class PrintDayInWord {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.print("Enter number of the day : ");
		int day = number.nextInt();
		if (day == 0){
			System.out.println("Sunday");
		}
			
			if (day == 1){
				System.out.println("Monday");
			}
			
			if (day == 2){
				System.out.println("Tuesday");
			}
			
			if (day == 3){
				System.out.println("Wednesday");
			}
			
			if (day == 4){
				System.out.println("Thursday");
			}
			
			if (day == 5){
				System.out.println("Friday");
			}
			
			if (day == 6){
				System.out.println("Saturday");
			}
			
		
		
		else if (day > 6) {
			System.out.println("Not a valid day");
		}
		
		
		
		

	}

}
