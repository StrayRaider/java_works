import java.util.Scanner;

public class cilek implements IMeyve{

    double fiyat;
    double kg;

    cilek(){

    }
    public double f () {
        Scanner key=new Scanner(System.in);
        System.out.println("cilek için fiyati giriniz:");
        fiyat=key.nextDouble();
        return fiyat;
    }

    public double kilo () {
        Scanner key=new Scanner(System.in);
        System.out.println("cilek için kilogram giriniz:");
        kg=key.nextDouble();
        return kg;
    }

    @Override
    public void meyveAdi() {
        System.out.println("cilek");
    }

    @Override
    public void alinanKg(double k) {
        System.out.println("cilekten alinan kg:"+k);    
    }

    @Override
    public double fiyat() {
        return fiyat*kg;
    }
}
