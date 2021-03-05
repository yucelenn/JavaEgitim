
public class Kare extends Sekil{
    private int kenar;

    public Kare(String isim,int kenar) {   //constructor,kenar ekledik.
        super(isim);
        this.kenar = kenar;
    }

    @Override
    public  void alanHesapla() {         //abstract metodu doldurduk.

        System.out.println(getIsim() + " in alanı : " + (kenar * kenar));
    } 
}
