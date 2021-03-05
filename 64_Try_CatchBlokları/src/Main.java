                        // Unchecked Exception:program çalışana kadar javanın uyaramadığı hatalar
public class Main {     // catch olmasa hatadan dolayı program hiç çalışmaz
    public static void main(String[] args) {
    /*  try {
            // Exception Oluşturabilecek Kodlar buraya yazılır.
        }
        catch(Exception_Türü e) {
            // Exception Durumunda Yapılacak İşlemler buraya yazılır.Hata çıkarsa buraya girecek.Çıkmazsa girmez. 
        }*/
       // int a = 30 / 0; //ArithmeticException (Unchecked Exception)
        
       // int[] a = {1,2,3,4,5};
       // System.out.println(a[7]); //ArrayOutOfBoundsException (Unchecked Exception)
        
        try {
            int[] a = {1,2,3,4,5};
            System.out.println(a[7]); // bu hata çıkaracak ve alttaki işlemi yapmadan uygun bir catch e gidecek,catch yoksa hata verir
            int b = 30 / 12;
            System.out.println("****" + b); // üstte hata varsa bunu basmayacak.
        }
        // hata yoksa zaten catch lere hiç girmez.
        catch (ArithmeticException e) {  //ArithmeticException yerine Exception yazsak da olur çünkü üst classı
            System.out.println("Bir sayı 0'a bölünemez...");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Arrayin boyunu aştınız...");
            System.out.println("***************************");
        }
        try {
           int r=2/0; 
        } 
        catch (Exception e) {
            System.out.println("Bir hata oluştu...");
            e.printStackTrace();   // hatanın ne hatası ve nerede olduğunu söyler.
        }
        System.out.println("Burası Çalışıyor....");
    }    
}
