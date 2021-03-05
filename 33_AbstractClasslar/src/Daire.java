public class Daire extends Sekil{        // Sekil classin alt classi. Implement et. Constructor ekle.
    private int yaricap;            // ozellik ekledik (constructora da ekle)
    
    public Daire(String isim,int yaricap) {      // constructor
        super(isim);
        this.yaricap=yaricap;
    }

    @Override
    void alanHesapla() {      // Daire class icin alanHesapla methodu olusturduk mecbur.(Abstract classtan aldik methodu)
        System.out.println(getIsim() + " alani: " + (Math.PI*yaricap*yaricap) );
    }
    
}