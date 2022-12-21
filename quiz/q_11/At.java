public class At extends Hayvan{

    At(String Isim){
        super(Isim);
        }

    @Override
    public String getKonus() {
        return "ben bir atim";
        
    }

    @Override
    public String toString() {
        return this.getIsim()+" => "+this.getKonus();
    }
    
}
