
public class YapicilarOverloading {
	
	void metod1() {
		System.out.println("Parametre almayan metod �a��r�ld�.");
	}

	void metod2(int sayi) {
		System.out.println("Parametre alan metod �a��r�ld�.");
	}

	public YapicilarOverloading() {
		metod1();
	}

	public YapicilarOverloading(int sayi1) {
		metod2(sayi1);
	}

	public static void main(String[] args) {
		YapicilarOverloading nesne1 = new YapicilarOverloading();
		YapicilarOverloading nesne2 = new YapicilarOverloading(10);

	}

}
