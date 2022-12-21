import java.util.Scanner;

public class  karpuz implements IMeyve {

    double fiyat;
    double kg;

    karpuz(){

    }
    public double f () {
        Scanner key=new Scanner(System.in);
        System.out.println("karpuz için fiyati giriniz:");
        fiyat=key.nextDouble();
        return fiyat;
    }

    public double kilo () {
        Scanner key=new Scanner(System.in);
        System.out.println("karpuz için kilogram giriniz:");
        kg=key.nextDouble();
        return kg;
    }

    @Override
    public void meyveAdi() {
        System.out.println("karpuz");
    }

    @Override
    public void alinanKg(double k) {
        System.out.println("karpuztan alinan kg:"+k);    
    }

    @Override
    public double fiyat() {
        return fiyat*kg;
    }
    
}
