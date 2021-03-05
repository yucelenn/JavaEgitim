
public class Daire extends Sekil {
    private int yaricap;

    public Daire(String isim,int yaricap) {    //constructor,yaricap ekledik.
        super(isim);
        this.yaricap = yaricap;
    }
    
    
    @Override
    public void alanHesapla() {           //abstract metodu doldurduk.
        
        System.out.println(getIsim() + " in alanı : " + (Math.PI * yaricap * yaricap));
    }
}
