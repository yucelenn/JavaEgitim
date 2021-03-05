
import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesapp){                //calis diye bir method olusturduk
        Login loginn =new Login();         // Login sinifindan yeni bir obje loginn
        Scanner girdi = new Scanner(System.in);
        
        System.out.println("hosgeldiniz....");
        System.out.println("**********************");
        System.out.println("Kullanici girisi");
        System.out.println("**********************");
        int giris_hakki=3;
        
        
        while(true){
            if(loginn.login(hesapp)) {   
                System.out.println("Giris basariili...");
                break;
            }         
            else{
                System.out.println("Giris basarisiz");
                giris_hakki-=1;
                System.out.println("Kalan giris hakki:"+giris_hakki);
            }
            if(giris_hakki==0){
                System.out.println("Giris hakkiniz bitti.");
                return;
            }
        }
        System.out.println("*********");
        String islemler= "1.Bakiye goruntuleme\n"
                       + "2.Para yatirma\n"
                       + "3.Para cekme\n"
                       + "Cikis icin q ya basin.";
        System.out.println(islemler);
        System.out.println("*********");
         
        while(true){
            System.out.println("İslem seciniz:");
            String islem = girdi.nextLine();
            if(islem.equals("q"))
                break;
            else if(islem.equals("1"))
                System.out.println("Bakiyeniz:"+hesapp.getBakiye());           
            else if(islem.equals("2")){
                System.out.println("Yatirmak istediginiz tutar:");
                int tutar=girdi.nextInt();
                girdi.nextLine();   //dummy
                hesapp.paraYatir(tutar);
            }
            else if(islem.equals("3")){
                System.out.println("Cekmek istediginiz tutar:");
                int tutar=girdi.nextInt();
                girdi.nextLine();   //dummy
                hesapp.paraCek(tutar);
            }
            else
                System.out.println("Gecersiz islem...");                
        }
    }
    
}
