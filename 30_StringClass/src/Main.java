public class Main {
    public static void main(String[] args) {
     
        String a = new String("Yucelen");  // Y : 0.index , u : 1.index , c : 2.index , .... , n : 6.index
        System.out.println(a);
        
        System.out.println("Harf sayisi: "+a.length());   //.length uzunluk icin
        
        System.out.println("0. index: "+a.charAt(0));     //.charAt(0) harfi bulmak icin(0. indexteki harf)
        
        System.out.println("sonuncu index: "+a.charAt(a.length()-1));  // sondan index icin ic ice yazdik.
        
        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }
                           //endsWith() da aynidir.
        System.out.println(a.startsWith("Yu"));   // kelime "Yu" ile basliyor mu onu kontrol eder.(true-false)
        
        System.out.println("u nun indexi: " + a.indexOf('u'));  // u harfinin indexini verir.Yoksa harf -1 basar.
        
        System.out.println(a.toLowerCase());   // kelimedeki buyuk harfleri kucuk yapar.
        System.out.println(a.toUpperCase());   // kelimedeki kucuk harfleri buyuk yapar.
        
        String c = "1991";
        int d = Integer.parseInt(c);   // String c yi int yapip d ye atadik.
        ++d;
        System.out.println(d);
        
        int c1 = 1923;
        String d1 = String.valueOf(c1); //int c1 i String yapip d1 atadik.
        System.out.println(d1);
    }
}
