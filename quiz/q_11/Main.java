import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Hayvan> Hayvanlar = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if(i<4)
            Hayvanlar.add(new Kedi("kedi"+(i+1)));
            else if(i<6)
            Hayvanlar.add(new Kopek("Kopek"+(i-3)));
            else
            Hayvanlar.add(new At("At "+(i-5)));
        }
        for (Hayvan hayvan : Hayvanlar) {
            System.out.println(hayvan.toString());
        }
        System.out.println("\n");
    }
}