import java.util.Scanner;                      // Abstract classlar ile Geometrik sekil hesaplama uygulamasi

public class Main {
    public static void main(String[] args) {
                                                         
        Scanner scanner = new Scanner(System.in);
        String islemler = "İşlemler...\n"
                          +"1. Kare Alan Hesapla\n"
                          +"2. Üçgen Alan Hesapla\n"
                          +"3. Daire Alan Hesapla\n"
                          +"Çıkış : q";
        
        while(true) {
            System.out.println(islemler);
            System.out.print("Hangi Şeklin Alanını Hesaplamak İstiyorsunuz : ");
            String sekil_turu = scanner.nextLine();
            Sekil sekil = null;          //sekil objesi olusturduk ici bos su an.
            
            if (sekil_turu.equals("q")) {                  //q basinca cikar programdan
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if (sekil_turu.equals("1")){              // 1 basinca sekil objesi kare objesi olacak.
                System.out.print("Karenin Kenarı : ");
                int kenar = scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Kare("Kare1", kenar);
                
                sekil.alanHesapla();
            }
            else if (sekil_turu.equals("2")) {             // 2 basinca sekil objesi ucgen objesi olacak.
                
                System.out.print("Kenar 1 : ");
                int kenar1 = scanner.nextInt();
                System.out.print("Kenar 2 : ");
                int kenar2 = scanner.nextInt();
                System.out.print("Kenar 3 : ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                                
                sekil = new Ucgen("Ucgen 1", kenar1, kenar2, kenar3);
                
                sekil.alanHesapla();
                
            }
            else if (sekil_turu.equals("3")){               // 3 basinca sekil objesi daire objesi olacak.
                System.out.print("Dairenin Yarıçapı : " );
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Daire("Daire 1", yaricap);
                
                sekil.alanHesapla();
            }
            else {
                System.out.println("Geçersiz İşlem....");
            }
        }
    }
}
