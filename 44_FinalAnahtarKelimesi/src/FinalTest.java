
public class FinalTest {           // final diyorsa sadece 1 kere deger verebilirsin.
    public final int obje_sayisi;  // burda verirsen de olur ama bi daha degismez.
                                   // ya tanimlarken ya da constructorda verebilirsin degeri.
    private static int say = 0;
    private final String isim;
    
    public FinalTest(String isim) {  //constructor
        this.isim = isim;
        say++;
        obje_sayisi = say;      // burda verirsen de olur ama bi daha degismez.        
    }

    public static int getSay() {
        return say;
    }

    public static void setSay(int say) {
        FinalTest.say = say;
    }
}
