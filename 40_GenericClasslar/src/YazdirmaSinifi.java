public class YazdirmaSinifi<E> {         // Generic class    
                                         // <E> : farkli degiskenler gelecegi icin.Ayni harfi metoda da yaz.
    public void yazdir(E[] dizi){  // E nin amaci ne gelirse ona gore islem yapsin diye.(Stringdizi,intdizi,chardizi,...)

        for (E e : dizi) {   //for each dongusu. 
            System.out.println(e);           
        }
    }
}
