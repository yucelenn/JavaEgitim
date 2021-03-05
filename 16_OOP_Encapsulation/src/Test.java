public class Test {
    public static void main(String[] args) {
   
        Araba araba1 = new Araba();   //araba1 referans oldu.
        araba1.setMarka("Audi");      //Araba objesine ulasti ve ona bilgi girdi
        araba1.setKapi(5);            //Araba objesinin araba1 referansinin kapi sayisini 5 yaptik.
        araba1.setTeker(0);           // 
        
        System.out.println("arabanin markasi:" + araba1.getMarka());
        System.out.println("arabanin kapi sayisi:" + araba1.getKapi());
        System.out.println("arabanin teker sayisi:"+araba1.getTeker());  //burayi anlamadim neden ??
        
    }
    
}
