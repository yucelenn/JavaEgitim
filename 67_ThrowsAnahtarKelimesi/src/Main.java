import java.io.IOException;    // RunTimeExceptionlar(arithmetic,nullpointer,outofbouns Exceptionlar) Unchecked Exceptionlardır.
import java.util.Scanner;      // Kalan diğer Exceptionlar Checked Exceptionlardır.Checked Exceptionları java öngörür ve yakalaman 
import java.util.logging.Level;// için uyarır.
import java.util.logging.Logger;

public class Main {
    
    public static void mekan_kontrol(int yas) throws IOException { // throws .... eklemen gerek Checked Exception olduğu için
        if (yas < 18) {                                            // ne fırlattığını belirtmen gerekiyor metodda yani. 
            throw new IOException();//IOException Checked Exception olduğu için metoda throws IOException yazmak gerek. 
        }
        else {
            System.out.println("Mekana hoşgeldiniz...");
        }     
    }
    
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        
        mekan_kontrol(yas);// bu hata çıkaracak Checked Exception olduğu için.Try catch bloğuna yaz düzelmesi için.        
    }                      // ya da main metoduna throws ... ekleyip(neyi fırlattığını belirtmek gibi) düzelt.Böyle yaparsan
}                          // programı kullanacak olan 2. kişi catch edecek.(API yı kullacak kişi)
