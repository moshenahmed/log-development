
public class Multiplesof3and5 {

	public static void main(String[] args) {
		int sumone = 0;
		int sumtwo = 0;
		int total;
		for (int i = 0; i < 1000; i++){
			if (i%3 == 0){
				sumone = sumone + i;
				// System.out.println(sumone);
			}
			else if (i%5 == 0){
				sumtwo = sumtwo + i;
				//System.out.println(sumtwo);
			}
			
			
		}
		total = sumone + sumtwo;
		System.out.println(" the total is :" + total);

	}

}
