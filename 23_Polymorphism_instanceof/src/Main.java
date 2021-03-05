class Hayvan{            // classlar boyle de yazilir.hayvan classi superclass(ustclass)
                         // Javada butun classlar Object isimli bir classtan gelir aslinda.
    private String isim;

    public Hayvan(String isim) {     //constructor.
        this.isim = isim;
    }                             // polymorphism in onemini anlamak icin bu proje.
                                  // instanceof sinif kontrol etmek icin. En asagida olay...
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
                                                  //inheritance olmasi gerek polymorphism icin.  
    public static void konustur(Hayvan hayvan){   //method (hayvan bir obje burda)
        System.out.println(hayvan.konus());
    }
    
    public static void konustur2(Object object){   //Object class icin yukardaki gibi bi method.
                                                 //polymorphism olmasaydi boyle her classi kontrol ederdik.
        if (object instanceof Kopek) {
            Kopek kopek1 = (Kopek)object;  //tur donusumu,int i double yapar gibi dusun. object nesnesi Kopek nesnesi oldu
            System.out.println(kopek1.konus());
        }
        else if(object instanceof Kedi){
            Kedi kedi1 = (Kedi)object;    //ayni sekilde Kedi icin
            System.out.println(kedi1.konus());
        }
        else if (object instanceof At) {
            At at1 = (At)object;          //ayni sekilde At icin
            System.out.println(at1.konus());            
        }
        else if (object instanceof Hayvan) {
            Hayvan hayvan1 = (Hayvan)object;    //ayni sekilde Hayvan icin kontrol ediyor instanceof.      
            System.out.println(hayvan1.konus());
        }
        
    }
    public static void main(String[] args) {   
        
        Kopek kopek = new Kopek("Karabas");   // kopek nesnesini olusturduk Kopek classtan .
        
        if(kopek instanceof Kopek){        // kopek nesnesinin Kopek classtan olup olmadigini anlamak icin 'instanceof'
            
            System.out.println("kopek nesnesi Kopek sinifindandir.");   //true ise bastiracak.
        }
        
        if (kopek instanceof Hayvan) {    //Hayvan class ustsinif oldugu icin bu da aynisi. Kedi-At kabul etmez ama.
            
            System.out.println("kopek nesnesi Hayvan sinifindandir. ");
        }
        //2. method icin bunlar:
        Kopek kopek1 = new Kopek("Comar");
        Kedi kedi1 = new Kedi("Tekir");
        At at1 = new At("Hidalgo");
        Hayvan hayvan1 = new Hayvan("Limon");
        
        konustur2(kopek1);
        konustur2(kedi1);
        konustur2(at1);
        konustur2(hayvan1);
               
    
    } 
}
