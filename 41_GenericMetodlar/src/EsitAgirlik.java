public class EsitAgirlik extends Aday{

    public EsitAgirlik(int turkce, int matematik, int edebiyat, int fizik) {  //construtor
        super(turkce, matematik, edebiyat, fizik);
    }

    @Override 
    public int puanHesapla() {        //abstract metod 
        return getTurkce() * 5 + getMatematik() * 5 + getFizik() * 1 + getEdebiyat() * 4;
    }
}
