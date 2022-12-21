import java.util.ArrayList;

public class Ogrenci{
    String ad;
    int sinif;
    ArrayList dersListesi = new ArrayList<Ders>();
    static int ogrenciSayisi;
    
    Ogrenci(){
        ogrenciSayisi += 1;
        OgrenciBilgisiYaz();
        OgrenciDersBilgisiYaz();
    }
    Ogrenci(String a, ArrayList<Ders> d){
        ad = a;
        dersListesi = d;
        ogrenciSayisi += 1;
        OgrenciBilgisiYaz();
        OgrenciDersBilgisiYaz();
    }
    Ogrenci(String a, int s, ArrayList<Ders> d){
        ad = a;
        sinif = s;
        dersListesi = d;
        ogrenciSayisi += 1;
        OgrenciBilgisiYaz();
        OgrenciDersBilgisiYaz();
    }

    public void OgrenciBilgisiYaz(){
        System.out.println("ogrenci adi           : "+ad);
        System.out.println("ogrenci sinif         : "+sinif);
        System.out.println("ogrenciSyisi          : "+ogrenciSayisi);
        System.out.println("ogrenci ders listesi  : "+dersListesi.size());
    }
    public void OgrenciDersBilgisiYaz(){
        for (int index = 0; index < dersListesi.size(); index++) {
            ((Ders) dersListesi.get(index)).DersBilgisiYaz();
        }
    }

}