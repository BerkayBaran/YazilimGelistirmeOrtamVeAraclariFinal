package tr.edu.medipol.yazilimaraclari.YazilimOrtamVeAraclariFinalProjesi;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/urunekle")


public class Urunler {


    public static List<String> urunlerinadi = new ArrayList<>();

    @GetMapping("/listele")
    public static List<String> UrunListele(){
        return urunlerinadi;
    }

    @PostMapping("/ekle")
    public static String UrunEkle(@RequestBody String adi) {
    	urunlerinadi.add(adi);
        return adi;
    } 

    @PostMapping("/sil")
    public static String UrunSil(@RequestBody String adi) {
    	urunlerinadi.remove(adi);
        return adi;


    }

}

