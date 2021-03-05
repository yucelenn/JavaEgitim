import java.net.MalformedURLException;  //kendi Exception classımızı yazmamız için üst exception classlarından türetmememiz lazım
import java.util.Scanner;

public class Main {
    
    public static void mekanKontrol(int yas){  //metod.
        if (yas<18) {
            throw new InvalidAgeException("Invalid age.");
        }
        else
            System.out.println("Mekana hoşgeldiniz...");
    }
    
    public static void mekanKontrol2(int yas) throws InvalidAgeException2{  //2.metod.Checked exception olduğu için throws eklemek gerek
        if (yas<18) {
            throw new InvalidAgeException2("Invalid age.");
        }
        else
            System.out.println("Mekana hoşgeldiniz...");
    }
    
    public static void main(String args[]) {
      // CHECKED EXCEPTION ( InvalidAgeException2 )  İÇİN;
        Scanner girdi = new Scanner(System.in);
        System.out.println("YAŞ GİR: ");
        int yas2 = girdi.nextInt();
        
        try {
            mekanKontrol2(yas2);      // checked bir exception yaptığımız için kendimiz try da kontrol etmemiz lazım.hata verir yoksa.
        } 
        catch (InvalidAgeException2 e) {
            e.printStackTrace();   //metodu kullandık.
        }
        
      //UNCHECKED EXCEPTION ( InvalidAgeException ) İÇİN;   
        System.out.println("yaşınızı girin: ");
        int yas = girdi.nextInt();
        // try catch siz hata vermez.
        mekanKontrol(yas);      // Unchecked bir exception yaptığımız için kendimiz try da kontrol etmesek de olur.      
    }                           // çıktıda kırmızı olarak basar
}


    
