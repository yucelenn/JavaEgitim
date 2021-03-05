import java.util.Scanner;

public class Matematik {
    
    private double PI = Math.PI;
        
    public class Factorial{           //Matematik classinin icinde bir inner class Factorial classi
        
        public void faktoriyel() {    //metod
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bir sayı giriniz:");
            
            int sayi = scanner.nextInt();
            int fakt = 1;
            
            for (int i =  2 ; i <= sayi ; i++) {  
                fakt *= i;
            }
            System.out.println("Faktoriyel : " + fakt);
            
        } 
    }
    
    public class Asal {           //bir inner class daha
        
        public boolean asal_mi(int sayi) {   // metod
            int i = 2;
            
            while (i < sayi) {
                if (sayi % i == 0 ) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }
    
    public class Alan {         //bir inner class daha
        
        public class DaireAlan{   // Alan classinin inner classi oldu bu DaireAlan classi ic ice kume gibi...
            
            public void daire_alan(int yaricap) {   //metod
                System.out.println("Dairenin Alanı : " + (yaricap * yaricap * PI));           
            }
        }
    }      
}
