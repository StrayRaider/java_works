import java.util.Scanner;

public class ext{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("string 1");
        String str_1 = keyboard.nextLine();
        System.out.println("string 2");
        String str_2 = keyboard.nextLine();
        int indx[] = is_ex(str_1,str_2);
        //System.out.println("start : "+indx[0]);
        //System.out.println("stop : "+indx[1]);
        System.out.println(" ");
        for(int i=0;i<str_1.length();i++){
            if(i<indx[0] || i>indx[1]){
                System.out.print(str_1.charAt(i));
            }
        }
    }
    public static int[] is_ex(String str_1, String str_2){
        int indx = -1;
        for(int i=0; i< str_1.length() ;i++){
            int k=0;
            //eğer ilk karakterler eşit ise
            if(str_1.charAt(i) == str_2.charAt(0))
                indx = i;
            for(k=0; k< str_2.length();k++){
                if(str_1.charAt(i) != str_2.charAt(k)){
                    break;
                }
                i+=1;
            }
            if(k == str_2.length()){
                //System.out.println("founded");
                int ret[] = {indx, indx+k};
                return ret;
            }
        }
    int ret[] = {-1, -1};
    return ret;
    }
}
