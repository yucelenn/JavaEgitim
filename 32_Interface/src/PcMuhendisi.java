public class PcMuhendisi implements IMuhendis{   //sag tik-> insert code -> implement method.

    private boolean askerlik;
    private boolean adli_sicil;

    public PcMuhendisi(boolean askerlik, boolean adli_sicil) {    //constructor
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }
    
    
    @Override
    public void askerlik_durumu_sorgulama() {    //implement ile yazmak zorundayiz hata vermemesi icin
        if (askerlik){
            System.out.println("Askerligimi yaptim.");
        }    
        else{
            System.out.println("Askerligimi yapmadim.");
        }   
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {   //implement ile yazmak zorundayiz hata vermemesi icin
        return "Ortalamam: " + derece;
    }

    @Override
    public void adli_sicil_sorgula() {    //implement ile yazmak zorundayiz hata vermemesi icin
        if(adli_sicil){
            System.out.println("Adli sicil kaydim bulunuyor.");
        }
        else{
            System.out.println("Adli sicil kaydim yoktur.");
        }
    }

    @Override
    public void is_tecrubesi(String[] array) {   //implement ile yazmak zorundayiz hata vermemesi icin
        System.out.println("Bilgisayar muhendisi olarak calistigim sirketler:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    
}
