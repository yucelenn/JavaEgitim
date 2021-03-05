public class Main {
    public static void main(String[] args) {
        int i=1;
        
        while (true) {                  // kosul true da olabilir sonsuz dongu icin falan       
            
            if (i==3) {    
                break;                  // break donguyu tamamen bitirir alt satiri okumaz donguden cikarir
            }   
            System.out.println("i:"+i);    //i=3 olunca donguyu komple bitirecek
            ++i;
        }
        System.out.println("sonuc olarak i:"+i+" de kaldi dongu kirildi.");
        
        for (int j = 0; j < 5; j++) {
            
            if (j==3) {
                continue;               // continue gorunce dongudeki alt satirlara gecmeden dongu basindan devam eder.
            }
            System.out.println("j:"+j);   //j=3 olunca burayi basmayacak continue yuzunden
        }    
   }
}
