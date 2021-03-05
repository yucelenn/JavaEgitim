import java.util.Scanner;                    // if-else else if ornegi
public class Main {                                      //  == esit mi?
    public static void main(String[] args) {             //  != esit degil mi?
        Scanner girdi=new Scanner(System.in);            //  <= kucuk esit mi?
        System.out.print("Notunuzu girin:");             //  && ve 
        int note=girdi.nextInt();                        //  || veya   demektir.
        
        if (note<=100 && note>=90) {                   // if(kosul)    kosul  true ise 
            System.out.println("Harf notunuz: AA");    // bunu okur    degil ise alta devam eder.     
        }
        else if (note<90 && note>=85) {                // else if de ayni ard arda if gibi 
            System.out.println("Harf notunuz: BA");              
        }
        else if (note<85 && note>=80) 
            System.out.println("Harf notunuz: BB");    // if veya else altinda tek satir varsa {} kullanmana gerek yok      
        else if (note<80 && note>=75) 
            System.out.println("Harf notunuz: CB");    // tek satirlar suslu parantezsiz yazilir.          
        else if (note<75 && note>=70)
            System.out.println("Harf notunuz: CC");              
        else if (note<70 && note>=65)
            System.out.println("Harf notunuz: DC");              
        else if (note<65 && note>=60) 
            System.out.println("Harf notunuz: DD");              
        else if (note<0 || note>100)
            System.out.println("YANLIS GIRIS");              
        else{
            System.out.println("Harf notunuz: FF");
        }
    }
}