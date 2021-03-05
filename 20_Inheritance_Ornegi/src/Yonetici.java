public class Yonetici extends Calisan{   //Calisan classinin alt classi
    
    private int sorumlu_kisi_sayisi;     //Yonetici classa ozellik ekledik.

    public Yonetici(String ad, String soyad, int id,int sorumlu_kisi_sayisi) {
        super(ad, soyad, id);                                    // Calisan classinin constructorini miras aldik
        this.sorumlu_kisi_sayisi=sorumlu_kisi_sayisi;            // bunu ekstra ekledik.
    } 

    @Override
    public void bilgiGoster() {     //buraya da override ettik ayni methodu.
        super.bilgiGoster(); 
        System.out.println("Yoneticinin sorumlu oldugu kisi sayisi:"+sorumlu_kisi_sayisi);//override methoda bunu da ekledik
    }
    
    public void zamYap(int zam_miktari){          // method
        System.out.println(getAd()+" calisanlara "+zam_miktari+" tl zam yapiyor");    //getAd miras aldik Calisan classtan 
        
    }
}
