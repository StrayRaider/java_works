import java.util.Scanner;

public class elma implements IMeyve{

    double fiyat;
    double kg;

    elma(){

    }
    public double f () {
        Scanner key=new Scanner(System.in);
        System.out.println("elma için fiyati giriniz:");
        fiyat=key.nextDouble();
        return fiyat;
    }

    public double kilo () {
        Scanner key=new Scanner(System.in);
        System.out.println("elma için kilogram giriniz:");
        kg=key.nextDouble();
        return kg;
    }

    @Override
    public void meyveAdi() {
        System.out.println("elma");
    }

    @Override
    public void alinanKg(double k) {
        System.out.println("elmatan alinan kg:"+k);    
    }

    @Override
    public double fiyat() {
        return fiyat*kg;
    }
    
}
