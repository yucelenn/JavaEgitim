public class Yazilimci extends Calisan{    // Calisan classinin alt classi
    
    private String diller;                 //ozellik ekledik Yazilimci classina
     
    public Yazilimci(String ad, String soyad, int id,String diller) {     //Calisan classin constructorini cagirdi.
        super(ad, soyad, id);
        this.diller=diller;                      //constructor a ozellik ekledi ekstra
        
    }
    public void formatAt(String isletim_sistemi){           //method
        System.out.println(getAd()+" "+isletim_sistemi+" OS yukluyor...");   //getAd() Calisan dan miras geliyor.
        
    }

    @Override
    public void bilgiGoster() {           //override ettik methodu.
        super.bilgiGoster();
        System.out.println("Yazilimcinin bildigi diller:"+diller);  //override methoda bunu da ekledik.
    }
    
}
