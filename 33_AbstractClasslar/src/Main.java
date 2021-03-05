public class Main {                               // Interface ile inheritance arasi bisey gibi.
    public static void main(String[] args) {
        
        Kare kare1 = new Kare("Kare1", 4);        // kare1 objesini olusturduk.
        Daire daire1 = new Daire("Daire1", 3);    // daire1 objesini olusturduk.
        
        Sekil sekil1;
        sekil1 = new Kare("boyle de olur kare", 5);         // Abstract Sekil classin referansini Kare classa gonderdik.
        
        kare1.alanHesapla();
        daire1.alanHesapla();
        sekil1.alanHesapla();
        
        kare1.cevreHesapla();        // sekil1 bunu kullanamaz ama. Cunku bu method Kare classta.
        
        
    
    }
    
}
