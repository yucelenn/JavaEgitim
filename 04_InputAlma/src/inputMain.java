import java.util.Scanner;
public class inputMain {    
    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);   // "girdi" yerine istedigini yaz.
        System.out.print("yas gir: ");

        int yas = girdi.nextInt();                // yukariyla ayni olacak. int icin   .nextInt()
        
        girdi.nextLine();                 // int den sonra string almak icin dummy input sikintili stringde  
        
        System.out.print("yazi girin: ");
        String abc = girdi.nextLine();            // kelime almak icin  .nextLine()
        
        System.out.print("sayi1: ");              // ard arda int (ya da string harici) alirken sikinti yok
        int sayi1=girdi.nextInt();
        System.out.print("sayi2: ");
        int sayi2=girdi.nextInt();
        
        System.out.println("yasiniz: "+yas);
        System.out.println("yaziniz: "+ abc);
        System.out.println("sayi1:"+sayi1+" sayi2:"+sayi2);
        
        System.out.printf("birinci sayin: %d yasin: %d",sayi1,yas);  //C deki gibi kullanma sekli var. printf
        
        
        
        
        
   }
    
}
