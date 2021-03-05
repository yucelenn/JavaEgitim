public abstract class Sekil {           // Sekil abstract class.En az bir tane abstract(govdesiz-soyut) method olacak.
                                        // Abstract methodlar alt classlarda mutlaka doldurulmalidir.
    private String isim;                // Abstract classa ozellik eklenebilir.Normal method da eklenebilir.
                                        // Ust class gibi dusun.
    public Sekil(String isim) {  // constructor
        this.isim = isim;
    }
    
    public void isminiSoyle(){
        System.out.println("Bu obje "+isim+" objesidir.");
    }
    
    abstract void alanHesapla();   // abstract method;ici bos diger classlarda doldurulacak.

    public String getIsim() {      // getter
        return isim;
    }

    public void setIsim(String isim) {    // setter
        this.isim = isim;
    }
        
    
    
    
    
    
}
