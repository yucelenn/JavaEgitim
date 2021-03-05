import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner girdi=new Scanner(System.in);
        System.out.print("Islem seciniz:");
        int islem=girdi.nextInt();
        
        switch(islem){           // girdiye gore case lere girecek
            case 1:                                      // islem=1 olursa buna girer.
                System.out.println("1. islemi sectin");
                break;                                   // break;   olmazsa alttaki case lere de girer.
            case 2:
                System.out.println("2. islemi sectin");
                break;    
            case 3:
                System.out.println("3. islemi sectin");
                break;
            default:                                     // yanlis girdi olursa calisir.
                System.out.println("gecersiz islem sectin...");
                break;            
        }
    }
}