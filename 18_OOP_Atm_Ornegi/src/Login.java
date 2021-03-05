import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesapp){   //login methodu olusturduk,Hesap classindan hesapp objesi
     Scanner girdi=new Scanner(System.in);
     String kul_adi;
     String kul_parola;
        System.out.print("Kullanici adi:");
        kul_adi = girdi.nextLine();
        System.out.print("Parola:");
        kul_parola = girdi.nextLine();
        
        if(hesapp.getKullanici_adi().equals(kul_adi) && hesapp.getParola().equals(kul_parola)){
            return true;
        }
        else
            return false;           
    }   
}
