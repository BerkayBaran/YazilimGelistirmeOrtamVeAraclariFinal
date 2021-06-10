package tr.edu.medipol.yazilimaraclari.YazilimOrtamVeAraclariFinalProjesi;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.List;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class YazilimOrtamVeAraclariFinalProjesiApplicationTests {

	Urunler urunler = new Urunler();
    private static List<String> urunadi = Urunler.urunlerinadi;

    @Test
    public void testListele() {
        List<String> sonuc = Urunler.UrunListele();
        assertEquals(urunadi,sonuc);
    }

    @Test
    public void testEkle() {
        String adi = "Berkay";
        String sonuc = Urunler.UrunEkle(adi);
        assertEquals("Berkay",sonuc);
    }

    @Test
    public void testSil() {
        String adi = "Berkay";
        Urunler.urunlerinadi.add(adi);
        String sonuc = Urunler.UrunSil(adi);
        assertEquals("Berkay",sonuc);
    }

}
