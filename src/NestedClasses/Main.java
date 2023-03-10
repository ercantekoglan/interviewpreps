package NestedClasses;

public class Main {
	public static void main(String[] args) {

//									NESTED CLASS
//									  |		|
//									  |		|
//								------		--------
//								^					^
//					Nested_Classes				Inner Classes
//			    (Static Inner Class)		(Non-Static Nested Classes)
//			    								|					|
//			    								|					|
//			    						Local Classes		Anonymous Classes

		// Inner class lar ile coklu kalitimi saglayabiliriz.

		// *****************************************
		// Inner Class / Non-Static Nested Class
		// Ana class in bir uyesidir.
		Matematik.Factorial faktorial = new Matematik().new Factorial();
		faktorial.faktorial();

		Matematik.Asal asal = new Matematik().new Asal();
		System.out.println(asal.asal(21));

		Matematik.Alan.DaireAlan daireAlan = new Matematik().new Alan().new DaireAlan();
		daireAlan.daireAlan(3);

		// *****************************************

		// Nested_Classes / Static Inner Class
		// non static method call
		// Ana class in bir uyesidir.
		Matematik1.Alan alan = new Matematik1.Alan();
		alan.daireAlan(5);
		// static method call
		Matematik1.Alan.daireAlan(5);

		// *****************************************
		// Local Inner Classes
		// Static degildir. - methodlarin uyesidir.methodlarin icerisinde tanimlanir.
		// local inner classlara baska methodlardan ulasamiyoruz.method a ozgudur.
		// public - static gibi anahtar kelimleri kullanamiyoruz. sadece class in bir
		// ozelligi olgudu zaman kullnilir.
		// sanki bir degisken gibi davranir.

		// bu class sadece main classinin icerisinde gecerli
		class Alan {
			public void alan(int r) {
				System.out.println("Alan: " + (r * r * Math.PI));
			}
		}

		Alan alan1 = new Alan();
		alan1.alan(2);
		
		
		
		//*****************************************
		// Anonymous Classes ornek
		
		IOgrenci ogrenci = new IOgrenci() {
			
			@Override
			public void derseGir() {
				System.out.println("Ogrenci Derse girdi");
				
			}
			
			@Override
			public void dersCalis() {
				System.out.println("Ogrenci ders calisti");
				
			}
		};
		ogrenci.dersCalis();
		ogrenci.derseGir();
		
		Aogrenci aOgrenci = new Aogrenci() {
			
			@Override
			void kayit() {
				System.out.println("kayitlandi");
				
			}
		};
		aOgrenci.kayit();
		aOgrenci.selamla();
	}
	
	//*****************************************
	
	// Local Inner Classes ornek
	public static void deneme() {
		
		// Alan alan2 = new Alan();
		// disardan erismeye calistigimiz icin erisemeyiz.
	}
	
	//*****************************************
	// Anonymous Classes
	// her hangi bir class tanimlasi olmadan obje olusturabiliyoruz.
	// interface- abstrac class dan herhangi bir class turetmeden 
	// direk obje olusturabiliriz.
	public interface IOgrenci{
		void dersCalis();
		void derseGir();
	}
	
	
	
	//*****************************************
	// abstract class i sadece burada static yapabiliriz DIKKAT!!!!
	// main method da ulasabilmek icin static yapiyoruz -govdeli methodlardan kaynaklaniyo sorun
	public static abstract class Aogrenci{
		
		abstract void kayit();
		public void selamla() {
			System.out.println("Selam");
		}
	}
	
}



































