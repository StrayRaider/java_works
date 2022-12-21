import java.util.ArrayList;

public class ClassesAndMethod {
    public static void main(String[] args) {
        ArrayList dersListesi = new ArrayList<Ders>();
        dersListesi.add(new Ders("mat"));
        dersListesi.add(new Ders("tr"));
        Ogrenci ogr_1 = new Ogrenci();
        Ogrenci ogr_2 = new Ogrenci("Emre",dersListesi);
        Ogrenci ogr_3 = new Ogrenci("Selin", 5,dersListesi);
    }
}
