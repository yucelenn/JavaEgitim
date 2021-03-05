public class MakineMuhendisi implements IMuhendis,ICalisma{   //bunda IMuhendis ve ICalisma yi implement ettik.
    private boolean askerlik;                                 // 2 interface oldu bunda.
    private boolean adli_sicil;

    @Override
    public void calis() {    //PcMuhendisi den farkli olarak bunu da implement ettik .
        System.out.println("Makine muhendisi calisiyor....");
    }

    public MakineMuhendisi(boolean askerlik, boolean adli_sicil) {  //constructor
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }
    
// is_tecrubesi haric PcMuhendisi ile ayni, referans_getir ekledik bir de.
    @Override
    public void askerlik_durumu_sorgulama() {        //PcMuhendisi ile ayni
        if (askerlik){
            System.out.println("Askerligimi yaptim.");
        }    
        else{
            System.out.println("Askerligimi yapmadim.");
        }   
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {    //PcMuhendisi ile ayni
        return "Ortalamam: " + derece;
    }

    @Override
    public void adli_sicil_sorgula() {                    //PcMuhendisi ile ayni
        if(adli_sicil){
            System.out.println("Adli sicil kaydim bulunuyor.");
        }
        else{
            System.out.println("Adli sicil kaydim yoktur.");
        }
    }

    @Override
    public void is_tecrubesi(String[] array) {   //PcMuhendisi ile farkli
        if (array.length==0) {
            System.out.println("Is tecrubem yok.");
        }
        else{
            System.out.println("Makine muhendisi olarak calistigim sirketler: ");
            for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            }
        }
    }
    
    public void referans_getir(String[] array){     //PcMuhendisi ile farkli bunu ekledik.
        if (array.length==0) {
            System.out.println("Referansim yok.");
        }
        else{
            System.out.println("Refefranslarim: ");
            for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            }
        }
    }
    
}
