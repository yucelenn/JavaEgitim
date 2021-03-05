import java.util.Scanner;           // inner class(dahili class): ic ice classlar.Javada coklu kalitim yapmak icin.

public class Main {                 // en ustteki classtan ozellik miras alabilir inner classlar.
    public static void main(String[] args) {   // Matemetik class alayini kapsar.
        /* çesitleri
        1. Statik Olmayan Inner Classlar
        2. Statik Inner Classlar
        3. Lokal(Yerel) Inner Classlar
        4. Anonymous(Anonim) Inner Classlar
        */
      //ustClass.innerClass  nesneadi = new ustClass().new innerClass();      obje olustururken boyle
        Matematik.Factorial factorial = new Matematik().new Factorial();    
        Matematik.Asal asal = new Matematik().new Asal();
        Matematik.Alan deneme = new Matematik().new Alan();
        
     //EnustClass.ustClass.innerClass  nesneadi = new EnustClass().new ustClass().new innerClass();
        Matematik.Alan.DaireAlan daire_alan = new Matematik().new Alan().new DaireAlan();
          
        Scanner scanner = new Scanner(System.in);      
        System.out.println("Bir sayı giriniz:");
        int sayi = scanner.nextInt();
        
        if (asal.asal_mi(sayi)) {   //metodu cagirdik.
            System.out.println("Bu sayı Asaldır.");
        }
        else {
            System.out.println("Bu sayı asal değildir..");
        }
        factorial.faktoriyel();
        daire_alan.daire_alan(2);       
    }   
}
