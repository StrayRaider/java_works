abstract class Meyve {
    //Sınıfların fiyat bilgisi alınankg miktarı ile kg fiyatının çarpımı ile elde
    //edilmektedir. Bu özellik soyut sınıf içerisinde yer almalıdır.
    protected double maliyet;
    protected double alinanKg;
    protected double kgFiyat;

    Meyve(double alinanKg, double kgFiyat) {
        this.alinanKg = alinanKg;
        this.kgFiyat = kgFiyat;
        double fiyat = this.alinanKg*this.kgFiyat;
        this.maliyet = fiyat;
    };

    protected double getMaliyet(){
        System.out.println(maliyet);
        return maliyet;
    }

    abstract protected void meyveadi();

    abstract protected double fiyat();
}