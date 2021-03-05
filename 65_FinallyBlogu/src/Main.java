public class Main {  // mutlaka yapılması gereken bir işlem-kod varsa finally bloğuna yaz.
  
    public static void main(String[] args) {
        
        try {
            int a = 30 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Bir sayı 0'a bölünemez..");
        }
        try {
            int b = 15 / 0;
        }
        catch (NullPointerException e) {
            System.out.println("Null Referans Hatası.... ");
        }
        
        finally {  // Buna yazılanlar mutlaka çalışır.Yukarda hataya ait bir catch yoksa bile çalışır.
            System.out.println("Finally bloğu çalışıyor....");
        }
        System.out.println("Burası Çalışıyor....");    // Yukarda hataya ait bir catch yoksa bu çalışmaz mesela.  
    }
}
