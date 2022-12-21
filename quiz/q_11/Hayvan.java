abstract class Hayvan implements ICanli{
    private String Isim;

    Hayvan(String Isim){
        setIsim(Isim);;
    }

    public void setIsim(String isim) {
        Isim = isim;
    }
    @Override
    public String getIsim() {
        return this.Isim;
    }

    public String getKonus(){
        return Isim;

    }
}
