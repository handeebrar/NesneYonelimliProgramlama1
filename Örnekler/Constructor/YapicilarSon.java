
public class YapicilarSon {
	
	static int sayi = 0;

	public YapicilarSon() {
		sayi++;
	}

	public static void dongu(YapicilarSon nesne[]) {
		for (int i = 0; i < 8; i++) {
			nesne[i] = new YapicilarSon();
		}
	}

	public static void main(String[] args) {
		YapicilarSon nesne[] = new YapicilarSon[8]; // nesne dizisi
		YapicilarSon.dongu(nesne);
		System.out.println(sayi + " adet nesne oluþturuldu.");

	}

}
