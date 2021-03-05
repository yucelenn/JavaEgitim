public class Problem {  //ust class
    
    public static class Matematik{    //Problem classin inner classi Matematik classi
        
        public static void daireAlan(int yaricap) {   //metod
            System.out.println("Dairenin Alanı :" + (Math.PI * yaricap * yaricap));
        }
        
        public static void ucgenCevresi(int kenar1,int kenar2,int kenar3) {
            System.out.println("Üçgenin Çevresi : " + (kenar1 + kenar2 + kenar3));
        }
    }
    
    public static class Fizik {    //Problem classin inner classi Fizik classi
        
        public static void icCarpim(Vec vec1,Vec vec2) {   //metod            
            int iccarpim = vec1.getI() * vec2.getI() + vec1.getJ() * vec2.getJ() + vec1.getK() * vec2.getK();
            System.out.println(vec1.getIsim() + " ile " + vec2.getIsim() + " in iç çarpımı =  " + iccarpim);
        }
    }   
}
