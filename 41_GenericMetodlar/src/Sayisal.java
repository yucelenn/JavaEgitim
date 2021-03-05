public class Sayisal extends Aday{

    public Sayisal(int turkce, int matematik, int edebiyat, int fizik) { //constructor
        super(turkce, matematik, edebiyat, fizik);
    }

    @Override
    public int puanHesapla() {   //abstract metod 
        return getTurkce() * 5 + getMatematik() * 5 + getFizik() * 4 + getEdebiyat() * 1;    
    }   
}
