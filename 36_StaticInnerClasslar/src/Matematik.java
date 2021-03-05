public class Matematik {   //ust class
    
    private static double PI =  Math.PI;   //bu ozellik static olmasaydi metodda direk kullanamazdik.
    
    public static class Alan {      //static bir inner class
        
        public static void daire_alan(int yaricap) {   //metod. static olmayan metod da olur buraya.
            
            System.out.println("Dairenin Alanı: " + (yaricap * yaricap * PI));
            
        }
    }   
}
