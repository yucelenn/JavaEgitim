import java.util.Scanner;

public class Main {
    // Basit Matematik ve Fizik Problemler
    // Daire Alan - Matematik
    // Üçgen Cevresi - Matematik
    // 3 Boyutlu Vektorlerin İç Çarpımı - Fizik
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);        
        System.out.println("Matematik ve Fizik Problemleri Programına Hoşgeldiniz...");        
        String islemler = "İşlemler...\n"
                          + "1. Daire Alanı Hesaplama\n"
                          + "2. Üçgen Çevresi Hesaplama\n"
                          + "3. 2 Vektörün İç Çarpımını Hesaplama\n"
                          + "Çıkış :  q";        
        while(true) {           //her zamanki islem menumuz...
            System.out.println(islemler);
            System.out.print("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if (islem.equals("1")){    //1. islem
                System.out.print("Dairenin Yarıçapı : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
               //Matematik classi Problem classinin inner classi  
                Problem.Matematik.daireAlan(yaricap);  //static inner class oldugu icin obje olusturmadan direk kullandik
            }
            else if (islem.equals("2")){    //2. islem
                System.out.print("Kenar  1: ");
                int kenar1 = scanner.nextInt();
                System.out.println("Kenar 2 : ");
                int kenar2 = scanner.nextInt();
                System.out.println("Kenar 3 : ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
              //Matematik classi Problem classinin inner classi  
                Problem.Matematik.ucgenCevresi(kenar1, kenar2, kenar3);//static inner class oldugu icin obje olusturmadan direk kullandik
            }
            else if (islem.equals("3")){    //3. islem
                Vec vec1 = new Vec("Vektör1");
                Vec vec2 = new Vec("Vektör2");
               //Fizik classi Problem classinin inner classi  
                Problem.Fizik.icCarpim(vec1, vec2);  //static inner class oldugu icin obje olusturmadan direk kullandik
            }
            else { 
                System.out.println("Geçersiz işlem...");
            }
        }
    }       
}
