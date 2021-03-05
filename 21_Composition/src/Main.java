public class Main {      //Composition, inheritance gibi ama bunda bir class diger classin sahibi
    
    public static void main(String[] args) {
        
        Cozunurluk cozunurluk = new Cozunurluk(1920,1080);
        
        Monitor monitor = new Monitor("XCV123","LG","20 inch", cozunurluk);   // cozunurluk direk yukardan geldi
        
        Kasa kasa = new Kasa("Rampage","Everest" , "Temperli cam");
        
        Anakart anakart = new Anakart("B450", "Asus", 20 , "Windows 10");
        
        Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);               // yukardan aldi hepsini
                                                                              // pc objesi Bilgisayar classtan
        pc.getKasa().bilgisayari_ac();       // pc objesine Kasa classtan getKasa methodunu ve bilgisayari_ac
                                             // methodunu cagirdik.
        pc.getMonitor().monitoru_kapat();    // bu da ayni sekilde Monitor classtan.
        
        pc.getAnakart().isletim_sistemi_yukle("linux");  // bu da Anakart classtan.
   
        
        
        
        
    }
    
}
