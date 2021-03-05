import java.util.Scanner;  //throw kendi istediğimiz şeyi Exception olarak fırlatmamızı sağlar.

public class Main {
    
    public static void mekan_kontrol(int yas) {  //metod
        if (yas < 18) {
            throw new ArithmeticException(); // 18 den küçükse Exception olarak fırlatacak.
        }
        else {
            System.out.println("Mekana hoşgeldiniz...");
        }     
    }
    
    public static void main(String[] args) {
               
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        
        try {
            mekan_kontrol(yas);   
        }
        catch (ArithmeticException e) { 
            System.out.println("18 yaşından küçükler mekana giremez...");
        }     
    }
}
