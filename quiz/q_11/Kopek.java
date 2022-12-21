public class Kopek extends Hayvan{

    Kopek(String Isim){
        super(Isim);
        }

    @Override
    public String getKonus() {
        return "ben bir kopekğim";
        
    }

    @Override
    public String toString() {
        return this.getIsim()+" => "+this.getKonus();
    }
    
}
