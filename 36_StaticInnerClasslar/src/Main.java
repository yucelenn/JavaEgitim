public class Main {
    public static void main(String[] args) {      
        
    //ustClass.innerClass  nesneadi = ustClass.innerClass();     inner class static ise boyle nesne olusturulur.   
        Matematik.Alan alan = new Matematik.Alan();
               
        alan.daire_alan(5);  //nesne olusturup metodu cagirdik.
        
        Matematik.Alan.daire_alan(6);  //static inner class oldugu icin nesne olusturmadan boyle kullanilabilir metod.
       
    }
}
