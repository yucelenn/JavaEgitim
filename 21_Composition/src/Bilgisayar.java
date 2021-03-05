public class Bilgisayar {         //bu class Anakart-Kasa-Monitor classlarinin sahibi.
    
    private Monitor monitor;
    private Kasa kasa;
    private Anakart anakart;

    public Bilgisayar(Monitor monitor, Kasa kasa, Anakart anakart) {    //constructor.
        this.monitor = monitor;
        this.kasa = kasa;
        this.anakart = anakart;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Kasa getKasa() {
        return kasa;
    }

    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }

    public Anakart getAnakart() {
        return anakart;
    }

    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }
    
    
}
