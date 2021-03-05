public class Main {    // lokal inner class public olmaz static de olmaz. metodun uyesidir.baska metoddan ulasilmaz .
    
    public static void main(String[] args) {      
        
        class  Alan {  // Main metodunun icinde bir lokal inner class ve bu lokal inner class sadece Main metodunun icinde gecerli
            
            public void daire_alan(int yaricap) {   //metod
                
                System.out.println("Dairenin Alanı: " + (yaricap * yaricap * Math.PI));
                
            }
        }
        Alan alan = new Alan();   //obje olusturduk.
        Alan alan2 = new Alan();
        
        alan.daire_alan(10);
        alan2.daire_alan(3);
    }
    
    public static void deneme() {
        
        //Alan alan1 = new Alan();  //burada olmaz cunku Main metoduna ozgu bir lokal inner class.
    }
}
