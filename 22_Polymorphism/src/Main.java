class Hayvan{         // classlar boyle de yazilir.hayvan classi superclass(ustclass)
    
    private String isim;

    public Hayvan(String isim) {     //constructor.
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public String konus(){          // method
        return "Hayvan konusuyor";
    }
}

class Kedi extends Hayvan{          // Hayvan classinin alt classi Kedi classi

    public Kedi(String isim) {      // constructor.
        super(isim); 
    }

    @Override
    public String konus() {                       // konus methodu override ettik.
        return this.getIsim()+ " miyavliyor.";    // return u degistirdik getIsim cagirdik buraya
    }
}   

class Kopek extends Hayvan{

    public Kopek(String isim) {   // constructor.
        super(isim);
    }

    @Override
    public String konus() {                       // konus methodu override ettik.
        return this.getIsim() + " havliyor.";     // return u degistirdik getIsim cagirdik buraya
    }  
}
   
class At extends Hayvan{

    public At(String isim) {    // constructor.
        super(isim);
    }

    @Override
    public String konus() {                       // konus methodu override ettik.
        return this.getIsim() + " kisniyor.";     // return u degistirdik getIsim cagirdik buraya
    } 
}

                                                  //polymorphism:cok bicimlilik.
public class Main {                               //bir objenin birden fazla obje gibi davranmasi.
                                                  //inheritance olmaasi gerek polymorphism icin.  
    public static void konustur(Hayvan hayvan){   //method (hayvan bir obje burda)
        System.out.println(hayvan.konus());
        
    }
    public static void main(String[] args) {      
        
        Hayvan hayvan1 = new Hayvan("Limon");
        System.out.println(hayvan1.konus());      //"Hayvan konusuyor" yazdiracak         |
                                                                            //            |
        Hayvan hayvan2 = new Kedi("Tekir");       //hayvan2 objesine Kedi objesi atadik.  |
        System.out.println(hayvan2.konus());      //"Tekir miyavliyor." yazdiracak.       |
                                                                            //            |>Buralar polymorphism ile 
        Hayvan hayvan3 = new Kopek("Comar");      //hayvan3 objesine Kopek objesi atadik. | oldu hep
        System.out.println(hayvan3.konus());      //"Comar havliyor." yazdiracak.         |
                                                                            //            |
        Hayvan hayvan4 = new At("Sahbatur");      //hayvan4 objesine At objesi atadik.    |
        System.out.println(hayvan4.konus());      //"Sahbatur kisniyor." yazdiracak.      |
        
        //alt classlardaki override method olmasa hayvan2-3-4 de de Hayvan konusuyor yazdirirdi.
        
        
        
        konustur(new Kedi("Pamuk"));    //bu da farkli sekilde.Method icinde nesne olustu. hayvan=kedi oldu,Pamuk oldu.
        konustur(new Kopek("Zeytin"));  //bunlar da polymorphism
        konustur(new At("Hidalgo"));
    } 
}
