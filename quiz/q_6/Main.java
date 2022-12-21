import java.util.Scanner;                                                                      
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main{
    public static void main(String[] args){
        //menu loop
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Menüye hoşgeldiniz");
        System.out.println("_____________________");
        System.out.println("1    number of char");
        System.out.println("2    find same character");
        System.out.println("3    to ArrayList");
        System.out.println("4    exit");
        System.out.println("_____________________");

        for(int i =0;i != -1;i++){
            System.out.print("select the action :");
            int input = keyboard.nextInt();
            System.out.println(" ");
            if(input == 1){
                System.out.print("Enter the Word: ");
                keyboard.nextLine();
                String word = keyboard.nextLine();
                c_1(word);
            }
            else if(input == 2){
                String word1, word2;
                System.out.print("First word : ");
                word1 = keyboard.next();
                System.out.print("Second word : ");
                word2 = keyboard.next();
                c_2(word1,word2);
            }
            else if(input == 3){
                keyboard.nextLine();
                System.out.println("Enter the word: ");
                String cumle = keyboard.nextLine();
                c_3(cumle);
            }
            else if(input == 4){
                //exit
                break;
            }
            else{
                System.out.println("Error !");
            }
        }
    }
    public static void c_1(String word){
        int wlength = word.length();
        System.out.println("word lenght: " + wlength);
    }
    public static void c_2(String word1, String word2){
        word1.contains(word2);
        ArrayList ortak_karakterler = new ArrayList<String>();
        for (int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);
            String cx = Character.toString(c);
            if (word2.contains(cx)) {
                if (!ortak_karakterler.contains(cx)) {
                ortak_karakterler.add(cx);
                    }
                }
            }
            System.out.print("Same Characters: ");
            System.out.println(ortak_karakterler);
        }
    public static void c_3(String cumle){
        ArrayList kelimeler = new ArrayList<ArrayList>();
        String tmp = new String();
        int son = cumle.length() - 1;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) != ' ') {
                tmp += cumle.charAt(i);
                }
            else {
                kelimeler.add(tmp);
                tmp = "";
                }
            if (i == son) {
                kelimeler.add(tmp);
                tmp = "";
                }
            }
            for (int j = 0; j < kelimeler.size(); j++) {
                System.out.println(kelimeler.get(j));
                }
        }
    }

    
