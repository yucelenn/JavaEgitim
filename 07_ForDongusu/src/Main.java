public class Main {                                  //   for(bas.degeri ; kosul ; artirma,azaltma,mat islem)
    public static void main(String[] args) {
        for(int a=1 ; a<=5 ; a=a*2){                      
           System.out.println("a: "+a);              //kosul saglandigi surece donecek dongu
        }
        int i=0;                                     // degisken ice ya da disa tanimlanabilir.
        int j=5;
        for(; i<5 && j>0  ;i++,j--){                 // baslangic degerleri belliyse donguyeye yazmaya gerek yok
            System.out.println("i:"+i+" j:"+j);
        }  
    }
}
