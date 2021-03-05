public class Main {    // herhangi class tanimlama olmadan obje olusturulabilir.Interface veya abstract classtan 
                       // herhangi bir class turetmeden direk obje uretmek istiyosak anonim inner class kullaniiriz.
    public static void main(String[] args) {  //Interface veya abstract classin metodlarini implent ederek o objeyi class tanimlamadan
                                              //kullanabiliyoruz.
        IOgrenci ogrenci = new IOgrenci() { //interfaceden obje olusturduk
            @Override                       //metodlari implement ettik artik ogrenci objesinde kullanabiliriz metodlari.
            public void ders_calis() {
                System.out.println("Ders çalışıyorum....");
            }

            @Override
            public void derse_gir() {
                System.out.println("Derse giriyorum...."); 
            }
        };
        ogrenci.ders_calis();
        ogrenci.derse_gir();
        
        System.out.println("******************************************************");
                                       // constructor sayesinde bilgiler girdik.(getter setter da lazim.)
        AOgrenci ogrenci2 = new AOgrenci("Yücelen Üstün",501) {  //abstract classtan ogrenci2 objesini olusturduk.
            @Override
            void kayit_yaptir() {               
                System.out.println("Kayıt Yapılıyor...." + " İsim :" + getIsim() + " Numara: " + getNumara());
            }
        };
        ogrenci2.kayit_yaptir();
        ogrenci2.selamla();         
    }
    
    public static abstract class AOgrenci {   // abstract class. static olacak govdeli metod icerdigi icin.
        
        private String isim;
        private int numara;

        public AOgrenci(String isim, int numara) {    //constructor
            this.isim = isim;
            this.numara = numara;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNumara() {
            return numara;
        }

        public void setNumara(int numara) {
            this.numara = numara;
        }
        
        abstract void kayit_yaptir();   //abstract metod.
        
        public void selamla() {       //metod.
            System.out.println("Selamlar...");
        }
    }
    
    public interface IOgrenci{   //interface
        
        void ders_calis();
        void derse_gir();
    }
}
