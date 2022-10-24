import java.util.Scanner;

public class chr{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("bir paragraf giriniz : ");
        String str_1 = keyboard.nextLine();
        int a_counter = 0;
        int c_counter = 0;
        for(int i =0;i<str_1.length() ;i++){
            char chr = str_1.charAt(i);
            if(chr  == 'a'){
               a_counter +=1; 
            }
            if(Character.isUpperCase(chr)){
                c_counter +=1;
            }
        }
        System.out.println("a sayısı : "+a_counter);
        System.out.println("büyük harf : "+c_counter);
    }
}
