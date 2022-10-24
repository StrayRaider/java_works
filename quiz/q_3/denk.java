import java.util.Scanner;

public class denk{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double x = 1.2;
        double y = 14;
        double conc_1 = Math.pow((3*x + 7/y),2);
        System.out.println("1. sonuc : "+conc_1);

        x = 6;
        y = 4;

        double conc_2 = (Math.pow(x,2)+(2*y))/((Math.pow(y,2))/2);
        System.out.println("2. sonuc : "+conc_2);

        //double field = Math.PI * Math.pow(radius, 2);
        //System.out.println("cemberın alanı   : "+field);

    }
}
