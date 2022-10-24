import java.util.Scanner;

public class circle{
    public static void main(String[] args){
        System.out.println("çemberin yarı çapını giriniz :");
        Scanner keyboard = new Scanner(System.in);
        double radius = keyboard.nextDouble();
        double c = Math.PI * (2 * radius);
        double field = Math.PI * Math.pow(radius, 2);
        System.out.println("cemberın cevresı : "+c);
        System.out.println("cemberın alanı   : "+field);

    }
}
