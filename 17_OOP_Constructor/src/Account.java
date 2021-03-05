public class Account {                     //banka hesap sistemi ornegi ile 
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String eMail;
    private String telNo;
    
    public Account(){      // Constructor (ismi classin ismiyle ayni olmak zorunda)
        System.out.println("ilk constructor...");
    }
    
    // Constructor methodunu overload edersek butun ozellikleri alabiliriz:
    public Account(String hesapNoo,double bakiye,String isimm,String eMail,String telNoo){
        
        hesapNo=hesapNoo;    // sagdaki constructordan soldaki OOP ozelliklerinden(en yukarisindan)
        this.bakiye=bakiye;  // isim farkini anla buradan. ayniysa this. koy basina
        isim=isimm;
        this.eMail=eMail;
        telNo=telNoo;
    }
    
    public void paraYatir(double miktar){         // para yatirma methodu
        bakiye+=miktar;                           // bakiye=bakiye gibi olsaydi (isim ayni) this.bakiye yapardik.
        System.out.println("Yeni bakiye:"+bakiye);
    }
    
    public void paraCekme(double miktar){          // para cekme methodu
        if(miktar>1500)              
            System.out.println("Tek seferde 1500 tl den fazla cekemezsiniz...");
        else if(bakiye-miktar < 0)                 // bakiyeden buyuk para cekilmesin diye.
            System.out.println("Yeterli bakiye yok...");
        else{
            bakiye-=miktar;                        // para cekince kalan para icin
            System.out.println("Bakiyeniz:"+bakiye);
        }    
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
}
