import java.util.InputMismatchException;
import java.util.Scanner;

class CarpmaException extends Exception {

    @Override
    public void printStackTrace() {  // metodu override ettik ve kafamıza göre doldurduk.
        System.out.println("İki sayı da çok büyük. Lütfen daha küçük sayılar girin....");
    }
}

public class Main {

    public static void main(String[] args) {
        // Switch Case Kullanarak 4 işlem yapan bir hesap makinesi tasarlamaya çalışın.
        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************");
        String islemler = "1. Toplama İşlemi\n"
                + "2. Çıkarma İşlemi\n"
                + "3. Çarpma İşlemi\n"
                + "4. Bölme İşlemi";
        System.out.println(islemler);
        System.out.println("************************************");
        System.out.print("İşlemi Seçiniz:");
        String islem = scanner.nextLine();
        int a;
        int b;

        try {
            switch (islem) {  //switch case i try in içine koyduk ki hataları yakalasın.
                case "1":   //toplama
                    System.out.print("Birinci Sayı: ");
                    a = scanner.nextInt();
                    System.out.print("İkinci Sayı: ");
                    b = scanner.nextInt();
                    System.out.println("Girilen Değerlerin Toplamları : " + (a + b));
                    break;
                case "2":  //çıkarma
                    System.out.print("Birinci Sayı: ");
                    a = scanner.nextInt();
                    System.out.print("İkinci Sayı: ");
                    b = scanner.nextInt();
                    System.out.println("Girilen Değerlerin Farkları : " + (a - b));
                    break;
                case "3":  //çarpma
                    System.out.print("Birinci Sayı: ");
                    a = scanner.nextInt();
                    System.out.print("İkinci Sayı: ");
                    b = scanner.nextInt();
                    if (a > 10000 && b > 10000) { 
                        throw new CarpmaException();   //iki sayı da 10000 den büyükse exception fırlatacak.
                    }
                    System.out.println("Girilen Değerlerin Çarpımları : " + (a * b));
                    break;
                case "4":  //bölme
                    System.out.print("Birinci Sayı: ");
                    a = scanner.nextInt();
                    System.out.print("İkinci Sayı: ");
                    b = scanner.nextInt();
                    System.out.println("Girilen Değerlerin Bölümü : " + (a / b));
                    break;
                default:  //geçersiz
                    System.out.println("Geçersiz İşlem");
            }
        } 
        catch (ArithmeticException e) {  // aritmetik hataları yakalasın diye
            System.out.println("Bir sayı 0'a bölünemez...");
        } 
        catch (InputMismatchException e) {  //girdi alırken hata olursa diye    
            System.out.println("Lütfen Inputları Doğru Formatta Girin...");
        } 
        catch (CarpmaException ex) {  //çarpmada çok büyük sayıları çarpmasınlar diye uyarı amaclı 
            ex.printStackTrace(); //override ettiğimiz metodu kullandık.
        }
    }
}
