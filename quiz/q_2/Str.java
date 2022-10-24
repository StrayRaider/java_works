import java.util.Scanner;

public class Str{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("ilk veriyi giriniz");
        String s_1 = keyboard.nextLine();  // string veri alır

        System.out.println("2. veriyi giriniz");
        String s_2 = keyboard.nextLine();  // string veri alır


        System.out.println("\nalt alta ifadeler : \n"+s_1+ "\n" +s_2);
        }
    }
