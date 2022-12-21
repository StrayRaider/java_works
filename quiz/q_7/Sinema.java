public class Sinema {
    protected int Salon_no;
    protected int top_kolt_say;
    protected int satilan_bilet;
    protected int top_satilan_bilet;
    Sinema(){};

    Sinema(int Salon_no,int top_kolt_say){
        this.top_kolt_say= top_kolt_say;
        this.Salon_no = Salon_no;
    };
    public void bilet_sat(){
        satilan_bilet += 1;
        top_satilan_bilet +=1;
    };

    public void bilet_iptal(){
        satilan_bilet -= 1;
        top_satilan_bilet -=1;
    };
    public int bos_koltuk(){
        return top_kolt_say-satilan_bilet;
    };
    public int tüm_bilet_say(){
        return top_satilan_bilet;
    };
    }