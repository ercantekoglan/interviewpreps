package NestedClasses;

public class Matematik1 {
	
	// static static de calisir method da calismaz
	private static double PI = Math.PI;
	
	// Nested_Classes / Static Inner Class
	public static class Alan{
//		public void daireAlan(int r) {
//			System.out.println("Dairenin Alani: " + (r*r*Math.PI));
//		}

		public static void daireAlan(int r) {
			System.out.println("Dairenin Alani: " + (r*r*PI));
		}
	}

}
