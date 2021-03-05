public abstract class Sekil {
    private String isim;

    public Sekil(String isim) {      //constructor
        this.isim = isim;
    }
    
    abstract void alanHesapla();     //abstract metod

    public String getIsim() {        //getter setter
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    
}
