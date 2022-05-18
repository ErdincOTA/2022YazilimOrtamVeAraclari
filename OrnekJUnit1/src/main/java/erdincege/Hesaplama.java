package erdincege;

public class Hesaplama {

	public static void main(String[] args) {
		
		System.out.println(sayilariCarp(2,2)+" "+sayilariBol(6,2)+" "+sayiCikartmaYap(4,3));
	}
	
	public static Integer sayilariCarp(int sayi1,int sayi2) {
		return sayi1*sayi2;
	}
	public static Integer sayilariBol(int sayiBolunen, int sayiBolen) {
		return sayiBolunen/sayiBolen;
	}
	public static Integer sayiCikartmaYap(int sayiCikartilan, int sayiCikan) {
		return sayiCikartilan-sayiCikan;
	}

}
