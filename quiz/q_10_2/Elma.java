
public class Elma extends Meyve {

    Elma(double alinanKg, double kgFiyat) {
        super(alinanKg, kgFiyat);
        //TODO Auto-generated constructor stub
    }

    double fiyat;
    double kg;

    @Override
    protected void meyveadi() {
        System.out.println(this.getClass().toString());
        // TODO Auto-generated method stub
        
    }

    @Override
    public double fiyat() {
        return fiyat*kg;
    }
    
}
