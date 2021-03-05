import java.util.ArrayList;       // turden bagimsiz classlardir generic classlar.(ya da metod)   <E>
                                  // Generic classlara her tur degiskeni gondrebilirsin.
public class Main {               // amelelikten kurtulmak icin .
    
    public static void main(String[] args) {
        
        Character[] char_dizi = {'J','A','V','A'};
        Integer[] integer_dizi = {1,2,3,4,5,6};
    
        String[] string_dizi = {"Java","Python","C++","Php"};
      // Ogrenci dizisine Ogrenci classtan 3 obje gonderdik.
        Ogrenci[] ogrenci_dizi = {new Ogrenci("Mustafa"),new Ogrenci("Mehmet"),new Ogrenci("Merve")};
       
      //GenericClass<DegiskenTuru> objeAdi = new GenericCalss<DegiskenTuru>();
        YazdirmaSinifi<Character> yazdir_char = new YazdirmaSinifi<Character>(); //yazdir_char obje
        YazdirmaSinifi<String> yazdir_string = new YazdirmaSinifi<String>();     //yazdir_string obje
        YazdirmaSinifi<Integer> yazdir_int = new YazdirmaSinifi<Integer>();      //yazdir_int obje
        YazdirmaSinifi<Ogrenci> yazdir_ogrenci = new YazdirmaSinifi<Ogrenci>();  //yazdir_ogrenci obje
        
        yazdir_char.yazdir(char_dizi);
      //obje.GenericClassMetodu(); 
        System.out.println("******************************");

        yazdir_string.yazdir(string_dizi);
        System.out.println("******************************");

        yazdir_int.yazdir(integer_dizi);
        System.out.println("******************************");

        yazdir_ogrenci.yazdir(ogrenci_dizi);     
    }  
}
