import java.util.Arrays;                             //Arrays methodu kullandik. 
import java.util.Scanner;
public class Main {                                  // sort siralama demek.
     public static int [] dizi_doldur(int sayi){     // method.
         System.out.println("Elemanlari gir:");   
        Scanner girdi = new Scanner(System.in);
        int array[]=new int[sayi];                   // sayi kadar girdi alcaz (uzunlugu sayi kadar)
            
        for (int i = 0; i < sayi; i++) {
            array[i] = girdi.nextInt();              // diziye girdi almak boyledir.                
        }
        return array;                   
    }
    public static void dizi_bastir(int [] dizi){     // method.
        for (int i = 0; i <dizi.length; i++) 
            System.out.println((i+1)+". eleman: "+dizi[i]); 
    }
    public static void dizi_sirala(int [] dizii){    // elemanlari siralar.Arrays methodlarindan
        Arrays.sort(dizii);
        dizi_bastir(dizii);
    }
    public static void main(String[] args) {
        int[] a = dizi_doldur(4);     // boyle de kullanilir method.4 elemanli dizi 
        dizi_bastir(a);               // dizi referanslari esitlendi methodlar calisti.(doldur ve bastir)
                                      // a dizisi ile array dizisini esitledi .
        System.out.println("**********************");                              
        dizi_sirala(a);
        
        int a1[]={1,2,3,4,5};
        int a2[]={1,2,3,4,5};
        
        if (Arrays.equals(a1, a2)) {            // dizilerin elemanlari kiyaslamak icin Arrays.equals( , )
            System.out.println("Esitler");            
        }
        else
            System.out.println("degiller.");
    
        
        
        
        
        
    }
    
}
