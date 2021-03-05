public class Main {   // Yurtdışı çıkış programı örneğini exceptionlarla yapılmış hali.
                      // her şeyi kontrol edip çıkış izni verecek
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Atatürk Havalimanına Hoşgeldiniz....");
        String sartlar = "Yurtdışı Çıkış Kuralları...\n"
                         +"Herhangi bir siyasi yasağınızın bulunmaması gerekiyor...\n"
                         +"15 Tl harç bedelinizi tam olarak yatırmanız gerekiyor...\n"
                         +"Gideceğiniz ülkeye vizenizin bulunması gerekiyor...";
        String message = "Yurtdışı şartlarından hepsini sağlamanız gerekiyor";
        
        while(true) {
            System.out.println("*******************************************");
            System.out.println(sartlar);
            System.out.println("*******************************************");
            
            Yolcu yolcu = new Yolcu();  // yolcu objesini oluşturduk.
            System.out.println("Harç Bedeli Kontrol Ediliyor...");
            Thread.sleep(3000); // 3 sn beklesin diye.
            
            try {
                yolcu.yurtdisiHarciKontrol();   // checked exception olduğu için try-catch içine aldık.
            } 
            catch (HarcException ex) {
                ex.printStackTrace(); // metodu kullandık.
                continue;                
            }            
            System.out.println("Siyasi Yasak Kontrol Ediliyor...");
            Thread.sleep(3000);
            
            try {
                yolcu.siyasiYasakKontrol();     // checked exception olduğu için try-catch içine aldık.
            } catch (SiyasiException ex) {   
                ex.printStackTrace();  // metodu kullandık.
                continue;
            }
            System.out.println("Vize Durumu Kontrol Ediliyor...");
            Thread.sleep(3000);
            
            try {
                yolcu.vizeDurumuKontrol();     // checked exception olduğu için try-catch içine aldık.
            } 
            catch (VizeException ex) {
               ex.printStackTrace();  // metodu kullandık.
               continue;
            }
            System.out.println("İşlemleriniz Tamam ! Yurtdışına çıkabilirsiniz...");
            break;            
        }        
    }
}
