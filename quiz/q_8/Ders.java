public class Ders {
    String ad;
    int sinif;
    String hoca;
    static int dersSayisi =0;
    
    Ders(){
        dersSayisi += 1;
    }
    Ders(String a){
        ad = a;
        dersSayisi += 1;
    }
    Ders(String a, int s, String h){
        ad = a;
        sinif = s;
        hoca = h;
        dersSayisi += 1;
    }

    public void DersBilgisiYaz(){
        System.out.println("ders adi        : "+ad);
        System.out.println("ders sinifi     : "+sinif);
        System.out.println("ders hocasi     : "+hoca);
    }
    public void DersSayiBilgisiYaz(){
        System.out.println("derssayisi : "+dersSayisi);
    }
}
