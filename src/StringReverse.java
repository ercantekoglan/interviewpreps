
public class StringReverse {

	public static void main(String[] args) {

		String[] arr = {"ercan", "ercre", "bergama", "demon","anna"};
		
		System.out.println("Array Normal");
		System.out.println("--------------");

		for(String s : arr) {
			System.out.println(s);
		}
		System.out.println("--------------");
		System.out.println("Array Reverse");
		System.out.println("--------------");
		for(int i = arr.length-1; i >=0; i--) {
			System.out.println(arr[i]);
		}
		
		System.out.println("--------------");
		System.out.println("String Reverse");
		System.out.println("--------------");
		
		for(int i = 0; i < arr.length; i++) {
			String s = arr[i];
			String reversed = "";
			for(int k = s.length()-1; k >=0; k--) {
				reversed += s.charAt(k);
			}
			System.out.println(reversed);
		
		if(reversed.equals(arr[i])) {
			System.out.println(arr[i] + " is palindrome");
		}else {
			System.out.println(arr[i] + " is not palindrome");
		}
		}
				
	}

}
