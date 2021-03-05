public class Test {
    
    public static void main(String[] args) {
        
        Sayisal sayisal1 = new Sayisal(30, 40, 20, 30);   //sayisal1 obje
        Sayisal sayisal2 = new Sayisal(25, 45, 2, 35);    //sayisal2 obje
        
        Sayisal birinci = birinci(sayisal1, sayisal2);   //birinci objeye generic metodun sonucunu atadik.
        
        EsitAgirlik esitagirlik1 = new EsitAgirlik(30, 20, 40, 2);
        EsitAgirlik esitAgirlik2 = new EsitAgirlik(40, 10, 50, 0);
        
        EsitAgirlik birinci2 = birinci(esitagirlik1,esitAgirlik2);  //birinci2 objeye generic metodun sonucunu atadik.
        
        System.out.println("Birinci Sayısal Öğrencinin Puanı: " + birinci.puanHesapla());
        System.out.println("Birinci Eşit Ağırlık Öğrencinin Puanı: " + birinci2.puanHesapla());             
                
        /*Character[] char_dizi = {'J','A','V','A'};
        Integer[] integer_dizi = {1,2,3,4,5,6};
    
        String[] string_dizi = {"Java","Python","C++","Php"};
    
        Ogrenci[] ogrenci_dizi = {new Ogrenci("Mustafa"),new Ogrenci("Mehmet"),new Ogrenci("Merve")};
        
        yazdir(char_dizi);
        yazdir(string_dizi);
        yazdir(integer_dizi);
        yazdir(ogrenci_dizi);*/
    }
    
    public static <E extends Aday> E birinci(E e1,E e2) {    //Generic metod  E yerine farkli obje,degisken alinablir.
                                                             //bu yüzden E extends Aday yazdik cunku genellemeyi daraltmak icin.
        if (e1.puanHesapla() > e2.puanHesapla()) {           //sadece puanHesapla metodunu icerenleri alsin degisken olarak diye.
            return e1;
        }
        else {
            return e2;
        }
    }
   /* public static <E> void yazdir(E[] dizi) {   // <E> E yerine her degisken gelir anlaminda.  E[]: her diziyi alsin anlaminda.
        for (E e : dizi) {
            System.out.println(e);
        }        
    }*/   
}
