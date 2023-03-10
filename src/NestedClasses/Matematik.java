package NestedClasses;
import java.util.Scanner;

public class Matematik {

	private double PI = Math.PI;

	// Inner Class - 1 / Non-Static Nested Class
	public class Factorial {

		public void faktorial() {

			int fakt = 1;
			for (int i = 2; i <= 5; i++) {
				fakt = fakt * i;
			}
			System.out.println("Faktorial: " + fakt);
		}

	}

	// Inner Class - 2 / Non-Static Nested Class
	public class Asal {

		public boolean asal(int sayi) {
			int i = 2;
			while (i < sayi) {
				if (sayi % i == 0) {
					return false;
				}
				i++;
			}
			return true;
		}

	}

	// Inner Class - 3 / Non-Static Nested Class
	public class Alan {

		public class DaireAlan {

			public void daireAlan(int r) {
				// can accesses private fields.because our inner class inside the actual class
				System.out.println("Dairenin ALani: " + (r * r * PI));
			}
		}
	}

}
