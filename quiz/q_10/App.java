import java.util.Scanner;

public class App {

    public static void main(String[] args){
        double fiyat_;
        double kg;
  
        armut a=new armut();
        a.meyveAdi();
        fiyat_=a.f();
        kg=a.kilo();
        a.alinanKg(kg);
        double m_1=a.fiyat();
        System.out.println(a.fiyat());

        cilek c=new cilek();
        c.meyveAdi();
        fiyat_=c.f();
        kg=c.kilo();
        c.alinanKg(kg);
        double m_2=c.fiyat();
        System.out.println(c.fiyat());

        elma e=new elma();
        e.meyveAdi();
        fiyat_=e.f();
        kg=e.kilo();
        e.alinanKg(kg);
        double m_3=e.fiyat();
        System.out.println(e.fiyat());

        karpuz k=new karpuz();
        k.meyveAdi();
        fiyat_=k.f();
        kg=k.kilo();
        c.alinanKg(kg);
        double m_4=k.fiyat();
        System.out.println(k.fiyat());

        double sum_m=m_1+m_2+m_3+m_4;
        System.out.println("TOPLAM MALİYET:"+sum_m);
    }
}