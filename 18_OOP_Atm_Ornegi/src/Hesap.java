public class Hesap {

    private String kullanici_adi;
    private String parola;
    private int bakiye; 

    public Hesap(String kul_adi, String kul_parola, int bakiye) {        // Constructor
        kullanici_adi = kul_adi;
        parola = kul_parola;
        this.bakiye = bakiye;    //ayniysa this kullan
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kul_adi) {
        this.kullanici_adi = kul_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String kul_parola) {
        this.parola = kul_parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    public void paraYatir(int tutar){         //method
        bakiye+=tutar;
        System.out.println("Yeni bakyieniz:"+bakiye);
    }
    public void paraCek(int tutar){           //method
        if((bakiye-tutar)<0)
            System.out.println("Yetersiz bakiye...");
        else{
            bakiye-=tutar;
            System.out.println("Kalan bakiyeniz: "+bakiye);
        }
    }
}
