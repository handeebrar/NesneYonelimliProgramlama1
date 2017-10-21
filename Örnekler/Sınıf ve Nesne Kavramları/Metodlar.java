
public class Metodlar {
	
	int carp(int sayi1, int sayi2) {
		return sayi1 * sayi2;
	}

	int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	

	public static void main(String[] args) {

		Metodlar islem1 = new Metodlar();
		Metodlar islem2 = new Metodlar();

		int sonuc1 = islem1.carp(5, 4);
		int sonuc2 = islem2.topla(7, 1);

		System.out.println("Çarpma sonucu= " + sonuc1);
		System.out.println("Toplama sonucu= " + sonuc2);

	}

}
