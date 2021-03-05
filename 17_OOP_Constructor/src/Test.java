public class Test {
    public static void main(String[] args) {
   
        Account account1 = new Account();
        Account account2 = new Account("234234",1000.0,"Yucelen Ustun","yucelenn@hotmail.com","05385056770");
        // bilgileri isledi constructor a  
        
        account2.paraCekme(2000);
        account2.paraCekme(950);           // methodu kullanarak bilgileri denedik.
        account2.paraYatir(1234);
        System.out.println(account2.getIsim());
        System.out.println(account2.getTelNo());
    }
    
}
