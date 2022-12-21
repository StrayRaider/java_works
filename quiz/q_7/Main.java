

public class Main {
    public static void main(String[] args) {
        Sinema obj_1 = new Sinema(1,10);
        Sinema obj_2 = new Sinema(2,20);
        Sinema obj_3 = new Sinema(3,30);
        obj_1.bilet_iptal();
        obj_1.bilet_iptal();
        obj_1.bilet_iptal();
        obj_1.bilet_sat();
        obj_1.bilet_sat();
        obj_1.bilet_sat();
        obj_1.bilet_sat();
        obj_1.bilet_sat();
        System.out.println("bos koltuk : " +obj_1.bos_koltuk());
        System.out.println("bilet say  : " +obj_1.tüm_bilet_say());
        obj_2.bilet_iptal();
        obj_2.bilet_sat();
        obj_2.bilet_sat();
        obj_2.bilet_sat();
        System.out.println("bos koltuk : " +obj_2.bos_koltuk());
        System.out.println("bilet say  : " +obj_2.tüm_bilet_say());
        obj_3.bilet_iptal();
        obj_3.bilet_sat();
        obj_3.bilet_sat();
        obj_3.bilet_sat();
        obj_3.bilet_sat();
        System.out.println("bos koltuk : " +obj_3.bos_koltuk());
        System.out.println("bilet say  : " +obj_3.tüm_bilet_say());
    }
}

