
public class Yapicilar {
	
	int deger1, deger2; // nesne de�i�keni mi s�n�f de�i�keni mi ?

	public Yapicilar() {
		deger1 = 5;
	}

	public Yapicilar(int sayi) {
		deger2 = sayi;
	}

	public static void main(String[] args) {
		
		Yapicilar nesne1 = new Yapicilar();
		Yapicilar nesne2 = new Yapicilar(10);

		System.out.println("�lk nesnenin de�eri: " + nesne1.deger1);
		System.out.println("�kinci nesnenin de�eri: " + nesne2.deger2);

	}

}
