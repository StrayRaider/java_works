import java.util.Scanner;

public class armut implements IMeyve {
    //Scanner key=new Scanner(System.in);
    double fiyat;
    double kg;

    armut(){

    }
    public double f () {
        Scanner key=new Scanner(System.in);
        System.out.println("armut için fiyati giriniz:");
        fiyat=key.nextDouble();
        return fiyat;
    }

    public double kilo () {
        Scanner key=new Scanner(System.in);
        System.out.println("armut için kilogram giriniz:");
        kg=key.nextDouble();
        return kg;
    }

    @Override
    public void meyveAdi() {
        System.out.println("armut");
    }

    @Override
    public void alinanKg(double k) {
        System.out.println("armuttan alinan kg:"+k);    
    }

    @Override
    public double fiyat() {
        return fiyat*kg;
    }
    
}
