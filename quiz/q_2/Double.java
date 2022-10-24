import java.util.Scanner;

public class Double{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        //double , ile veri alıyor
        System.out.println("double veri giriniz");
        double d_1 = keyboard.nextDouble();  // double veri alır

        System.out.println("toplamak için ikinci bir double veri giriniz");
        double d_2 = keyboard.nextDouble();  // double veri alır

        System.out.println("1. is: " + d_2);
        System.out.println("2. is: " + d_1);
        System.out.println("sum is: " + (d_1+d_2));

        }
    }
