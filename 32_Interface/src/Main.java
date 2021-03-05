public class Main {                            // interfacelerden obje olusturamazsin.
    public static void main(String[] args) {   // sadece interface i implement eden classlarin objelerine referans olabilir
   
        PcMuhendisi muhendis1 = new PcMuhendisi(false, false); 
      //IMuhendis de olurdu referans olarak(en baştaki PcMuhendisi yerine)
      
        muhendis1.askerlik_durumu_sorgulama();
        muhendis1.adli_sicil_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.1));
        
        String[] tecrube = {"Vestel","Tai","Aselsan"};
        muhendis1.is_tecrubesi(tecrube);
        
        System.out.println("***********************************");
        
        IMuhendis muhendis2 = new MakineMuhendisi(true,false);
      //MakineMuhendisi yerine IMuhendis yazarak (gostermek amacli).
        MakineMuhendisi muhendis3 = new MakineMuhendisi(true, true); //anlasilsin diye
        
        muhendis2.askerlik_durumu_sorgulama();
        muhendis2.adli_sicil_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalamasi(2.7));
        
        String[] tecrubee ={};    //degistirdimiz yer icin.
        String[] referans = {"Ali Yilmaz","Giray Çelik"};
        muhendis2.is_tecrubesi(tecrubee);
        ((MakineMuhendisi)muhendis2).referans_getir(referans);    // ekledigimiz yer icin
        //Tur donusumu uyguladik, IMuhendis yazdigimizda hata verdigi icin
        ((MakineMuhendisi)muhendis2).calis(); 
        
        System.out.println("**************************");
        
        muhendis3.calis();   //anlasilsin diye .
        muhendis3.askerlik_durumu_sorgulama();
        muhendis3.adli_sicil_sorgula();
        System.out.println(muhendis3.mezuniyet_ortalamasi(2.1));
        
        
        
    }
    
}
