public class Main {
    public static void dizi_bastir(int[] dizi){    //method.
        for (int i=0 ; i<dizi.length ; i++) {      //dizi uzunluguna gore ayarladik donguyu. 
            System.out.println((i+1)+". eleman: "+dizi[i]);            
        }        
    }
    public static void main(String[] args) {
   
        int[] a = new int[3];  // a dizisinde 3 yer var demektir.
        a[0]=3453;  // a dizisinin 1. elemanina 3453 degerini verdik.
        a[1]=234;   // a dizisinin 2. elemanina 234 degerini verdik.
        a[2]=33;    // a dizisinin 3. elemanina 33 degerini verdik.  
        for(int i=0;i<3;i++)
            System.out.println("a["+i+"]:"+a[i]);
        
        int[] b = {23,54,24,33};    //b dizisinin elemanlari 23,54,24,33 . direk deger verme bu.
        System.out.println("b dizisinin uzunlugu:" + b.length);        //diziadi.length methodu dizi uzunlugunu verir.
        
        dizi_bastir(b);   
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
}
