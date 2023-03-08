import java.util.Arrays;

public class ArraysUtility {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5 };

		System.out.println(nums); // hashcode
		System.out.println(Arrays.toString(nums)); // {1, 2, 3, 4, 5}

		System.out.println("-----------------------------------");

		int[] scores = { 95, 100, 55, 65, 85, 70 };
		System.out.println(Arrays.toString(scores));
		Arrays.sort(scores); // {55, .. 100}
		System.out.println(Arrays.toString(scores));
		System.out.println("Min score:" + scores[0]);
		System.out.println("Max score:" + scores[scores.length - 1]);

		System.out.println("-----------------------------------");

		String[] names = { "Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinem" };
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));

		String[] words = { "Anna", "ANNA" };

		Arrays.sort(words);

		System.out.println(Arrays.toString(words));

		System.out.println("------------------------------");

		int[] arr1 = { 1, 3, 2 };
		int[] arr2 = { 1, 2, 3 };

		boolean r1 = Arrays.equals(arr1, arr2);

		System.out.println(r1);

		boolean r2 = Arrays.equals(arr1, arr2);

		System.out.println(r2);

		System.out.println("-----------------------------");
		// "acb", "bac"

		char[] ch1 = { 'a', 'c', 'b' };
		char[] ch2 = { 'b', 'a', 'c' };

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		boolean anagram = Arrays.equals(ch1, ch2);

		System.out.println("anagram =" + anagram);

		System.out.println("--------------------------------------------");

		String[] students = { "Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel" };
		String[] earlyBirds = Arrays.copyOf(students, 2);

		System.out.println(Arrays.toString(earlyBirds));

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		numbers = Arrays.copyOf(numbers, 4); // {1,2,3,4,5}

		System.out.println(Arrays.toString(numbers));

		System.out.println("--------------------------------------------");
		
		  char[] cah1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
	        char[] cah2 = Arrays.copyOfRange(cah1, 2, 6+1 );

	        System.out.println(Arrays.toString(cah2));


	        int[] scores1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
	        //index:         0   1   2   3   4   5   6   7   8  9
	        int[] result = Arrays.copyOfRange(scores1, 3, 8);


	        System.out.println(Arrays.toString(result));


	        int[] result2 = Arrays.copyOfRange(scores1, 5, scores1.length);
	        System.out.println(Arrays.toString(result2));
	}

}
