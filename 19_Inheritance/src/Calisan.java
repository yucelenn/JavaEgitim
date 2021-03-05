public class Calisan {  //Superclass-baseclass-temel,ana class
    
    private String isim;
    private int maas;
    private String departman;

    public String getIsim() {   // Yonetici classta bilgilerigoster methodunu overrride yapmak icin koyduk getter setter.
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public Calisan(String isim, int maas, String departman) {                 //Constructor.
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }
    public void bilgilerigoster(){                 //method
        System.out.println("isim:"+isim);
        System.out.println("maas:"+maas);
        System.out.println("departman:"+departman);
    }
 
    
            
    
}
