
public class SumAndAverage {
	

	public static void main(String[] args) {
		int sum = 0;
		double average = 0;
		for (int i = 0; i < 101; i++){
			
			sum = sum + i;
			average = sum/100;
			
			 
		}
		
		System.out.println("The sum is :" + sum);
		System.out.println("The average is :" + average);

	}

}
