package erdincege;

import static org.junit.Assert.*;
import org.junit.Test;

public class HesaplamaTest {
	private Hesaplama testSinif = new Hesaplama();
	@Test
	public void testSayilariCarp() {
		int sayi1 = 2;
		int sayi2 = 3;
		int beklenen = 6;
		
		
		int sonuc = testSinif.sayilariCarp(sayi1, sayi2);
		
		assertEquals(beklenen,sonuc);
	}

	@Test
	public void testSayilariBol() {
		int bolunen = 6;
		int bolen = 2;
		int beklenen = 3;
		
		
		int sonuc = testSinif.sayilariBol(bolunen, bolen);
		
		assertEquals(beklenen,sonuc);
	}

	@Test
	public void testSayiCikartmaYap() {
		int cikartilan = 4;
		int cikan = 3;
		int beklenen = 1;
		
		
		int sonuc = testSinif.sayiCikartmaYap(cikartilan, cikan);
		
		assertEquals(beklenen,sonuc);
	}

}
