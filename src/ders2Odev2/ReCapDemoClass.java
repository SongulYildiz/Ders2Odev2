package ders2Odev2;

public class ReCapDemoClass {

	public static void main(String[] args) {
		DortIslemClass dortIslemClass = new DortIslemClass();
		int toplam = dortIslemClass.Toplama(15, 20);
		int cikarma = dortIslemClass.Cikarma(30, 20);
		int carpma = dortIslemClass.Carpma(15, 20);
		int bolme = dortIslemClass.Bolme(60, 20);
		
		System.out.println(toplam);
		System.out.println(cikarma);
		System.out.println(carpma);
		System.out.println(bolme);
	}

}
