
public class PrimeNumber {

	public static void main(String[] args) {

//		int hedef = 100;
//
//		// n e kadar olan asal sayilar
//		for (int sayi = 2; sayi < hedef; sayi++) {
//			boolean asalMi = true;
//			for (int bolen = 2; bolen < sayi; bolen++) {
//
//				if (sayi % bolen == 0) {
//					asalMi = false;
//					break;
//				}
//
//			}
//			if (asalMi == true) {
//				System.out.println(sayi);
//			}
//
//		}
//
//		// n sayisi asal mi
//		int x = 13;
//		boolean result = true;
//		for (int i = 2; i < x; i++) {
//			if (x % i == 0) {
//				result = false;
//			}
//		}
//
//		if (result == true) {
//			System.out.println("x is " + x + " " + "prime");
//		} else {
//			System.out.println("x is " + x + " " + " not prime");
//		}

		int[] nums = { 2, 1, 3, 4, 5 };

		for (int element : nums) {

			boolean prime = true;

			for (int i = 2; i < element; i++) {
				if (element % i == 0) {
					prime = false;
					break;
				}
			}

			if (prime && element != 1) {
				System.out.println(element);
			}
		}
		System.out.println();

	}

}
