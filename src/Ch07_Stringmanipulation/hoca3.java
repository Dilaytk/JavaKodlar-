package Ch07_Stringmanipulation;

import java.util.Scanner;

public class hoca3 {
    public static void main(String[] args) {

        /*
        charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
        index değeri 0'dan başlar
         */

        String city = "Istanbul";

        //city variable inin biirinci karakterini bulun yazdirin
        System.out.println("city.charAt(0) = " + city.charAt(0)); //city.charAt(0) = I

        //city variable inin biirinci indexte ki elemani bulun yazdirin
        System.out.println("city.charAt(1) = " + city.charAt(1));//city.charAt(1) = s
        char cityBirinciIndexElemani = city.charAt(1);
        System.out.println("cityBirinciIndexElemani = " + cityBirinciIndexElemani);//cityBirinciIndexElemani = s


        //task son karakteri alin atama ile  yazdiran kod yaziniz
        int sonHarfIndexi = city.length() - 1;
        // city.length()-1 bize her zmn son karakteri verir
        // Bunu charAt(city.length()-1) charAt parametresinin içinde kullanırsan her zmn son harfi verir
        System.out.println("sonHarfIndexi = " + sonHarfIndexi);//sonHarfIndexi = 7

        System.out.println("city.charAt(sonHarfIndexi) = " + city.charAt(sonHarfIndexi));//

        //alinan son karakteri uygun bir variable a atama yaparak uazdirin
        char sonHarf = city.charAt(sonHarfIndexi);
        System.out.println("sonHarf = " + sonHarf);//sonHarf = l

        //RTE   System.out.println("city.charAt(21) = " + city.charAt(21));
        //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 21
        // city nin 21. indexine gitmeye çalıştı ama öyle bir index yok (hata verdi)


         // Task-> istanbul izmir  girilen kelimenin kelimesinin ortadaki karakteri
        // print eden code create ediniz...
        Scanner input = new Scanner(System.in);
        System.out.println("bir sehir ismi gir");
        String city2 = input.nextLine();
        // nextline ı unutma strinde kullanılıyor  me
        // buraya kadar tamam bundan sonra kullanıcı her şeyi girebilir ortası olmayan bir şehir girebilir me

        if (city2.length() % 2 == 0) { // if te ; yok
            //harf sayisi iki nin tam kati ise ortanca harf yoktur yani ikiye bölümünden kalan yok ortası yok
            System.out.println("senin sehrin ortasi yok");
        } else {//girlen ifadenin length i tek sayili ise else caliscak
            //bu length i 2 ye bolerek ortada ki index bulunur
            /* mesela konya girildi konya 5 harf old için if çalışmayacak else gececek else de 2 ye bölcek ne olur 2.5
            ondalıklı oldu ama biz int kullandık double değil
            2 gelecek charAt old için de index olarak kullanacaak 0 1 2  n
          ya da 2. örn hakkari 7 harf length i 7 if yine çalışmaz else 3.5 int old için 3 alır başını alır
          char at indexi alır 0 1 2 3 h a k k
             */
            System.out.println("city2.charAt(city2.length() / 2 ) = " + city2.charAt(city2.length() / 2));
        }

    }
}