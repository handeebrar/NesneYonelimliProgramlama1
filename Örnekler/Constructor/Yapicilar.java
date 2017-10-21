
public class Yapicilar {
	
	int deger1, deger2; // nesne değişkeni mi sınıf değişkeni mi ?

	public Yapicilar() {
		deger1 = 5;
	}

	public Yapicilar(int sayi) {
		deger2 = sayi;
	}

	public static void main(String[] args) {
		
		Yapicilar nesne1 = new Yapicilar();
		Yapicilar nesne2 = new Yapicilar(10);

		System.out.println("İlk nesnenin değeri: " + nesne1.deger1);
		System.out.println("İkinci nesnenin değeri: " + nesne2.deger2);

	}

}
