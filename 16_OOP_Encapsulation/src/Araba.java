public class Araba {
    private String marka;          // buralar private oldugu icin direk erisilemez
    private String motor;          
    private String renk;
    private int kapi;
    private int teker;             // o yuzden public bir method yapariz ona ulasilabilir.  
    
    public void setMarka(String marka){   //setter getter methodlari
        this.marka = marka;       
    }    
    public String getMarka(){             //setter getter methodlari (sag tik_refactor_encapsulate fields)
        return this.marka;  
    }
    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;               //isimler ayniysa this koyariz farkliysa direk yaz.
    }
    public String getRenk() {
        return renk;
    }
    public void setRenk(String renk) {
        this.renk = renk;
    }
    public int getKapi() {
        return kapi;
    }
    public void setKapi(int kapi) {
        if(kapi<2)                     //kapi sayisi 2 den kucuk girilirse diye.
            System.out.println("Kapi sayisi 2 den kucuk olamaz.");
        else
        this.kapi = kapi;
    }
    public int getTeker() {
        return teker;
    }
    public void setTeker(int teker) {
        if(teker<4){                   //teker sayisi 4 den kucuk girilirse diye
            System.out.println("Teker sayisi 4 den kucuk olamaz.");
        }
        else {
        this.teker = teker;
        }
    }
        
}
