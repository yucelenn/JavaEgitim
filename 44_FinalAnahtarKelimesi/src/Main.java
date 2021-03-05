
public class Main {
    
    public static void main(String[] args) {
        FinalTest f1 = new FinalTest("Obje1");  //f1 objesini olusturduk
        FinalTest f2 = new FinalTest("Obje2");  //f2 objesini olusturduk
        
        System.out.println("Obje Sayısı: " + f1.obje_sayisi);    //f1 in objesayisini verir.
        System.out.println("Obje Sayısı: " + f2.obje_sayisi);    //f2 nin objesayisini verir.

        System.out.println("Database İsmi : " + Database.databaseIsmi);
        System.out.println("UserName : " + Database.userName);
        System.out.println("Password : " + Database.password);
        
        //Database.userName = "root2";    //degismeye izin vermez hata verir.        
    }
}
