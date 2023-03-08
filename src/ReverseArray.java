
public class ReverseArray {

	public static void main(String[] args) {

		 int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80};

		 int[] reversed = new int[numbers.length];
		 
		 for(int i = 0, j = numbers.length-1; i < numbers.length; i++, j-- ) {
			 
			 reversed[i] = numbers[j];
			 
		 }
		 
		 for(int i :reversed) {
			 System.out.println(i);
		 }
		
	}

}
