import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double sum = 0;

        double kg=kilo("karpuz");
        double kgfiyat=kgfiyat("karpuz");
        Karpuz myKarpuz = new Karpuz(kg, kgfiyat);
        myKarpuz.meyveadi();
        sum += myKarpuz.getMaliyet();

        kg=kilo("Elma");
        kgfiyat=kgfiyat("Elma");
        Elma myElma = new Elma(kg, kgfiyat);
        myElma.meyveadi();
        sum += myElma.getMaliyet();

        kg=kilo("Çilek");
        kgfiyat=kgfiyat("Çilek");
        Cilek myCilek = new Cilek(kg, kgfiyat);
        myCilek.meyveadi();
        sum += myCilek.getMaliyet();

        kg=kilo("Armut");
        kgfiyat=kgfiyat("Armut");
        Armut myArmut = new Armut(kg, kgfiyat);
        myArmut.meyveadi();
        sum += myArmut.getMaliyet();
        
        System.out.println("toplam maliyet : "+sum);
    }

    public static double kgfiyat (String isim) {
        Scanner key=new Scanner(System.in);
        System.out.println(isim+"için kilogram fiyatini giriniz:");
        double kgfiyat=key.nextDouble();
        return kgfiyat;
    }

    public static double kilo (String isim) {
        Scanner key=new Scanner(System.in);
        System.out.println("alinan "+isim +" kilogrami giriniz:");
        double kg=key.nextDouble();
        return kg;
    }
}
