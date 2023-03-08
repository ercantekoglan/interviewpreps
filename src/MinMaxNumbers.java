import java.util.Scanner;

public class MinMaxNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many number you have?");
		int[] myArr = null;
		try {
			
			myArr = new int[scanner.nextInt()];
			
		}catch(Exception e) {
			System.out.println("Invalid Input!");
		}
		
		for(int k = 0; k < myArr.length; k++) {
			
			myArr[k] = scanner.nextInt();
		}
		
		int max =myArr[0];
		int min =myArr[0];
		
		for(int i =1; i < myArr.length; i++) {
			
			if(max < myArr[i]) {
				max = myArr[i];
			}
			
			if(min > myArr[i]) {
				min = myArr[i];
			}
		}
		
		System.out.println(min + " min and " + max + " is max");
		
		
	}

}
