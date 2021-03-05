public class Yonetici extends Calisan{  //subclass-alt class  ,Calisan sinifindan ozellik-method alacak.
    
    private int sorumlu_ol_kisi_sayisi;   //ekstra ozellik ekledik yonetici sinifa.
    
    public Yonetici(String isim,int maas,String departman,int sorumlu_kisi){    //constructor
        //this.isim=isim;
        //this.maas=maas;          bunlar yerine super kullan.
        //this.departman=departman;
        super(isim, maas, departman);  //Calisan classtan constructor miras alabilmek icin
        
        this.sorumlu_ol_kisi_sayisi=sorumlu_kisi;
    }
    
    @Override
    public void bilgilerigoster(){    //Calisan classtaki methodu override ettik ayni isim kullanarak.
            //super i silip deneyebilirsin sorumlu kisi sayisini vermez
        super.bilgilerigoster();   // Calisan classtaki methodu buraya miras aldik.
        System.out.println("sorumlu oldugu kisi sayisi:"+sorumlu_ol_kisi_sayisi);  //methoda bunu ekledik.
        
    }
    
}
