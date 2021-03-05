public class Monitor {         //monitor classi Cozunurluk classinin sahibidir.
    
    private String model;
    private String uretici;
    private String boyut;
    private Cozunurluk cozunurluk;          //composition budur. ozelligi oldu 

    public Monitor(String model, String uretici, String boyut, Cozunurluk cozunurluk) {      //constructor.
        this.model = model;
        this.uretici = uretici;
        this.boyut = boyut;
        this.cozunurluk = cozunurluk;
    }

    public void monitoru_kapat(){        //method
        System.out.println("Monitor kapatiliyor.");
    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public Cozunurluk getCozunurluk() {
        return cozunurluk;
    }

    public void setCozunurluk(Cozunurluk cozunurluk) {
        this.cozunurluk = cozunurluk;
    }
     
    
    
}
