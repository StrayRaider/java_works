import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main{
    public static void main(String[] args){
    cpy();
    dimention();
    arry_c();
    } 

    public static void arry_c(){
        System.out.println("int list to arrylist---------------------");
        int[] array = {1, 3, 4, 5, 6, 17, 28, 39, 10};
        List<Integer> intList = new ArrayList<Integer>(array.length);
        for(int i=0;i<array.length;i++){
            intList.add(array[i]);
            }
	    System.out.println(intList); 		
	    for (int i = 0; i < intList.size();i++){ 		      
	        System.out.println(intList.get(i)); 		
	        }
        }

    public static void dimention(){
        System.out.println("2D array-------------------");
        Scanner keyboard = new Scanner(System.in);
        int x = 3;
        int y = 2;
        int arry[][];
        arry = new int[x][y];

        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(i+","+j+" .objeyi giriniz : ");
                int val = keyboard.nextInt();
                arry[i][j] = val;
                System.out.print("\n");
            }
            System.out.print("\n");
        }
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(arry[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    public static void cpy(){
        System.out.println("Ortalama bulma---------------------------");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("oluşturulacak dizinin boyutlarını giriniz :");
        int size = keyboard.nextInt();
        int arry[];
        arry = new int[size];
        for(int i =0;i<size;i++){
            System.out.print(i+1+". elemam :");
            int ind = keyboard.nextInt();
            arry[i] = ind;
        }
        System.out.print("dizi :");
        int new_arry[];
        new_arry = new int[size];
        for(int i =0;i<size;i++){
            new_arry[i] = arry[i];
        }
        double avr = 0;
        for(int i =0;i<size;i++){
            System.out.print(new_arry[i]+" ");
            avr += new_arry[i];
        }
        System.out.print("\n");
        avr = avr/size;
        System.out.println("ortalama : "+avr);
        
    }
}

