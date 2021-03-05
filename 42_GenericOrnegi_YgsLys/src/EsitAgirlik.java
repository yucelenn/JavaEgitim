public class EsitAgirlik extends Aday {

    public EsitAgirlik(int turkce, int matematik, int edebiyat, int fizik,String isim) { //constructor.
        super(turkce, matematik, edebiyat, fizik,isim);
    }

    @Override
    public int puanHesapla() {    //abstract metodu doldurduk
        return getTurkce() * 5 + getMatematik() * 5 + getFizik() * 1 + getEdebiyat() * 4;
    }   
}
