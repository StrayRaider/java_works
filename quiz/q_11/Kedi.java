public class Kedi extends Hayvan{

    Kedi(String Isim){
        super(Isim);
        }

    @Override
    public String getKonus() {
        return "ben bir kediyim";
        
    }

    @Override
    public String toString() {
        return this.getIsim()+" => "+this.getKonus();
    }
    
}
