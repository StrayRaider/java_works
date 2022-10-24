import java.util.Scanner;                                                       

public class ext{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        //System.out.println("string 1");
        //String str_1 = keyboard.nextLine();
        //System.out.println("string 2");
        //String str_2 = keyboard.nextLine();
        String str_1 = "Java Programlama Dersi Fall 2012";
        String str_2 = "Programlama Dersi";
        int indx = str_1.indexOf(str_2);
        for(int i=0;i<str_1.length();i++){                                      
            if(i<indx || i>indx+str_2.length()){
                System.out.print(str_1.charAt(i));
            }
        }
    }
}
