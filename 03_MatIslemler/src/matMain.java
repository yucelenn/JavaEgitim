public class matMain {
    
    public static void main(String[] args) {
        
        System.out.println(3+4.2);
        System.out.println(3-5f);           // float ozelligi
        System.out.println(10/4);           // bolumu verir
        System.out.println(10/4.0);
        System.out.println(10%3);           // kalani verir
        System.out.println(3*5.5);
        
        int a=5;
        a=a+2;
        
        System.out.println(a);    // a=7 oldu
        
        ++a;                      // 1 artirir. (soldaysa + lar , direk artirir.)
        System.out.println(a);    // a=8 oldu
        System.out.println(a++);  // a=8 hala ...sagdaysa + lar , bir sonraki satirda 1 artiracak 
        System.out.println(a);    // a=9 oldu
        System.out.println(++a);  // a=10 oldu direk               
    }
}
