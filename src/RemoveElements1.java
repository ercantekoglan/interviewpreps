import java.util.Arrays;

public class RemoveElements1 {

	public static void main(String[] args) {
		 int[] numbers = {100, 200, 300, 400, 500, 600};

	        numbers = removeElement(numbers, 1); //{100, 300, 400, 500, 600}

	        numbers = removeElement(numbers, 1); //[100, 400, 500, 600]

	        System.out.println(Arrays.toString(numbers));

	}

	private static int[] removeElement(int[] numbers, int index) {
		
		if(index < 0 || index > numbers.length -1 ) {
			System.err.println("Invalid Index: " + index);
			System.exit(0);
		}
		
		int[] result = new int[numbers.length-1];
		
		int j = 0;
		
		for(int i =0; i < numbers.length; i++) {
			if(i == index) {
				continue; //skip
			}
			result[j++] = numbers[i];
		}
		
		
		
		return result;
	}

}
