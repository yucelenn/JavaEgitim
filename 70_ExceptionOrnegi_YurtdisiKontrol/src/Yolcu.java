import java.util.Scanner;

class SiyasiException extends Exception { // Kendi exception classımızı oluşturduk ve Exception dan extend ettik.

    @Override
    public void printStackTrace() {  // metodu override ettik ve kafamzıza göre doldurduk.
        System.out.println("Siyasi Yasağınız Bulunuyor...");
    } 
}

class VizeException extends Exception { // Kendi exception classımızı oluşturduk ve Exception dan extend ettik.

    @Override
    public void printStackTrace() {  // metodu override ettik ve kafamzıza göre doldurduk.
        System.out.println("Gideceğiniz Ülkeye Vizeniz Bulunmamaktadır...");
    }
}

class HarcException extends Exception { // Kendi exception classımızı oluşturduk ve Exception dan extend ettik.

    @Override
    public void printStackTrace() {  // metodu override ettik ve kafamzıza göre doldurduk.
        System.out.println("Lütfen yurtdışı harcını tam yatırın...");
    }    
}

public class Yolcu{
    
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;
    
    public Yolcu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yatırdığınız Harç Bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Herhangi bir siyasi yasağınız bulunuyor mu(evet ya da hayır) ? ");
        String cevap = scanner.nextLine();
        
        if (cevap.equals("evet")) {
            this.siyasiYasak = true;
        } 
        else {
            this.siyasiYasak = false;
        }
        System.out.print("Vizeniz bulunuyor mu ? (evet ya da hayır)");
        String cevap2 = scanner.nextLine();
        
        if (cevap2.equals("evet") ){
            this.vizeDurumu = true;        
        }
        else {
            this.vizeDurumu = false;
        }       
    }
    
    public void yurtdisiHarciKontrol() throws HarcException { //cheked exception olduğu için throws eklenmeli.
        
        if (this.harc < 15) {
           throw new HarcException(); //15 tlden düşükse HarcException ı fırlatacak.
        }
        else {
            System.out.println("Yurtdışı harcı işlemi tamam!");
        }
    }
    
    public void siyasiYasakKontrol() throws SiyasiException { //cheked exception olduğu için throws eklenmeli.
        
        if (this.siyasiYasak == true) {
            throw new SiyasiException();   //siyasi yasak varsa SiyasiException fırlatacak.
        }
        else {
            System.out.println("Siyasi yasağınız bulunmuyor..."); 
        }
    }
   
    public void vizeDurumuKontrol() throws VizeException { //cheked exception olduğu için throws eklenmeli.
        
        if (this.vizeDurumu == true) {
            System.out.println("Vize işlemleri tamam!");
        }
        else {
            throw new VizeException();  //vize yoksa VizeException fırlatacak.          
        }
    }   
}
