
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        System.out.println("Calisanlar programina hosgeldin...");
        String islemler="Islemler:\n"
                        + "1.Yazilimci islemleri\n"
                        + "2.Yonetici islemleri\n"
                        + "Cikis icin  q basin.";
        System.out.println("***************************");
        System.out.println(islemler);
        System.out.println("***************************");
        
        while(true){                              //sonsuz dongu q basana kadar calisacak.
            System.out.print("Islem seciniz:");
            String islem=girdi.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan cikiliyor...");
                break;
            }
            else if (islem.equals("1")) {
                Yazilimci yazilimci1=new Yazilimci("Yucelen", "Ustun", 501, "C,Java");  //yazilimci1 olsuturduk.
                String yazilimci_islem="1.Format\n"                                     //Yazilimci classtan obje
                                     + "2.Bilgi goster.\n"
                                     + "Cikis icin q basin.";
                System.out.println(yazilimci_islem );
                while(true){
                    System.out.println("islem seciniz:");                 
                    String y_islem=girdi.nextLine();
                    
                    if(y_islem.equals("q")){
                        System.out.println("Yazilimci islemlerinden cikiliyor...");
                        break;
                    }
                    else if(y_islem.equals("1")){
                        System.out.println("isletim sistemi:");
                        String isletim_sistemi=girdi.nextLine();
                        yazilimci1.formatAt(isletim_sistemi);           // Yazilimci siniftan method cagirdik.
                    }
                    else if(y_islem.equals("2")){
                        yazilimci1.bilgiGoster();            //Yazilimci siniftan method cagirdik.
                    }
                    else{
                        System.out.println("Gecersiz islem...");
                    }
                }
            }
            else if (islem.equals("2")) {
                Yonetici yonetici1=new Yonetici("serhat", "Say", 123, 10); //Yonetici classtan yonetici objesi olusturduk
                String yonetici_islem="Yonetici islemleri:\n"
                                    + "1.Zam yap\n"
                                    + "2.Bilgileri goster\n"
                                    + "Cikis icin q basin...";
                System.out.println(yonetici_islem);
                while (true){
                    System.out.println("islem seciniz:");
                    String y_islem=girdi.nextLine();
                    
                    if(y_islem.equals("q")){
                        System.out.println("Yonetici islemlerinden cikiliyor...");
                        break;
                    }
                    else if(y_islem.equals("1")){
                        System.out.println("Yoneticinin ne kadar zam yapmasini istiyorsunuz:");
                        int zam_miktari=girdi.nextInt();
                        girdi.nextLine();
                        yonetici1.zamYap(zam_miktari);   //Yonetici classtan method cagirdik.
                    }
                    else if(y_islem.equals("2")){
                        yonetici1.bilgiGoster();
                    }
                    else{
                        System.out.println("Gecersiz yonetici islemi...");
                    }
                }
            }
            else{
                System.out.println("Gecersiz islem");
            }   
        }

    }
    
}
