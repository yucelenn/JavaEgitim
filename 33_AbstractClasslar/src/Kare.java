public class Kare extends Sekil{        // Sekil classin alt classi. Implement et. Constructor ekle.
    private int kenar;            // ozellik ekledik (constructora da ekle)
    
    public Kare(String isim,int kenar) {    // constructor
        super(isim);
        this.kenar=kenar;
    }

    @Override
    void alanHesapla() {      // Kare class icin alanHesapla methodu olusturduk mecbur.(Abstract classtan aldik methodu)
        System.out.println(getIsim() + " alani: " +(kenar*kenar) );
    }
    
    public void cevreHesapla(){
        System.out.println(getIsim() + " cevresi: " + (4*kenar));
    }
}