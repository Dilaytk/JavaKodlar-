package Ch07_Stringmanipulation;

import java.util.Scanner;

public class hoca4 {
    public static void main(String[] args) {

         /*
        String icersinde istenen stringin varlığını kontrol eder boolean return eder..
        bu bunu içeriyor mu? diye sorar

         */

        String str = "java ile gunler";

        System.out.println("str = " + str);
        // methodlara nasıl gidiyorduk variable isminden gidiyordduk str.
        // contains parametresine String bir değer alır ve boolean verir yani bunu içeriyor mu diye soruldu true false

        //CTE  System.out.println("str.contains('java') = " + str.contains('j'));  parametere String olmali

        System.out.println("str.contains(\"java\") = " + str.contains("java"));//str.contains("java") = true
        // çok karışık gözüküyor ama sadece sunu yazdık str.contains("java").soutv
        // true çünkü java orada yazıyor

        System.out.println("str.contains(\"Java\") = " + str.contains("Java"));//str.contains("Java") = false
        //case sensitive oldugu buyuk kucuk harf e dikkat edilmeli

        System.out.println("str.contains(\" \") = " + str.contains(" "));//str.contains(" ") = true
        // (" ") bu bosluk bir karakterdir. çünkü space bu bir karakter yani bir tuş bir yer işgal ediyor hiçlik yer işgal etmiyor

        System.out.println("str.contains(\"\") = " + str.contains(""));//str.contains("") = true
        // ("") hiçlik. hiçlik karakter değildir. her iki karakter arası bir hiçliktir j ile a arası bir hiçlik
        // her string bir hiçlik içerir. java ile günler 14 karakter o zmn burada 14 hiçlik var

        System.out.println("\"\".length() = " + "".length());//"".length() = 0


        // task-> girilen urunun var olup olmaidgini kontrol eden bir code create ediniz -> ternary kullanınız
        String buzDolap = "elma peynir yumurta zeytin bal kaymak";
        Scanner input = new Scanner(System.in);

        System.out.println("urun gir");
        String urun = input.nextLine();

        String result = buzDolap.contains(urun) ? "evet bu urun dolap ta var" : "bu urun dolab da yok";

        System.out.println("result = " + result);

        //TASK giirlen sifrenin dogru ise erisim izni verin yanlis ise vermeyin
        // ternary ile switch ile if ile yapiniz
        //contains methodu sifre kontrol islemlerinde KULLANILMAMALI

        String password = "123456789";//baslangicta banka da olan sifre atandi

        System.out.println("sifreni gir");
        String sifre = input.nextLine();

        if (sifre.contains(password)) {   // if nasıl çalışır true olduğun değil mi şart sağlandığında
            System.out.println("you can log in");
        } else System.out.println(" you can not log in");

        //burada ki BUG i bulunuz
        /* burada contains kullanılmaz kullanıcı
        k1234567890fr vs de girse erişim sağlanır çünkü şifreyi girmiş oluor girdiği şeyn içinde şifre var yani ama başka şyler de var
        fazlalık var .contains (icermek) anlamında olduğğu için şifredeki herhangi bir karakteri içeren herhangi
        bir şifre kabul edilir.hata budur
         */
        //+ - karakter girildiginde de kabul eder
        //1234567890 olarak girersem de sifreyi kabul eder ama contains old için
        //1  girsem  erişim sağlarım


        String result2 = sifre.contains(password) ? "you can log in with ternary" : "bye bye happeness";
        System.out.println("result2 = " + result2);

        switch (sifre) {
            case "123456789":
                System.out.println("you can log in via switch case");
                break;
            default:
                System.out.println("you entered wrong value");
                break;

        }
    }
}
