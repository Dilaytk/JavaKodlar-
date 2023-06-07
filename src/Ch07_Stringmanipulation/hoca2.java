package Ch07_Stringmanipulation;

public class hoca2 {
    public static void main(String[] args) {
         /**
        length() methodu girilrn string'in uzunluğunu:içinde bulunan karakter sayısını return eder
        butun karakterleri(boşluk vs) sayıp adedini verir boşlık da dahi yani
         */

        String str = "clarusway ile java";
        System.out.println("str.length() = " + str.length());//str.length() = 18
        //method parantesi bos ise bu method parametresiz demektir
        // sonucu int olarsk veriyor çünkü uzunluğunu veriyor yani doğal int olması
        // boşlukları da sayıcak karakter sayarken
        // length olduğu için 1 den başladı
        // index olsa 0 dan başlayacaktı

        int lengthOfStr= str.length();
        System.out.println("lengthOfStr = " + lengthOfStr);

        String str1 = "" ;
        System.out.println("str1.length() = " + str1.length()); // 0
        //bunu şöyle yazdım str1.length().soutv

        String str2 = " " ;
        System.out.println("str2.length() = " + str2.length());// 1
        // boşluk  bir karakterdir

        String str3 = null ;
        /** null la 0 ın farkı
        0 tuvalet kağıdı takacağında askısında bitmiş rulo
        null tuvalet kağıdı takacağında bitmiş rulo bile yok
         */
        // null yapıp run ettiğimizde hata aldık
        //RTE  System.out.println("str3.length() = " + str3.length());
        //Method invocation 'length' will produce 'NullPointerException'
        //Exception in thread "main" java.lang.NullPointerException

        //RTE  System.out.println("str3.concat(str2) = " + str3.concat(str2));
        //Exception in thread "main" java.lang.NullPointerException

        String str4 = "null" ;
        System.out.println("str4.length() = " + str4.length());// str4.length() = 4
        String str5 ;//atama yapilmamis bir variablle kulanilamaz
        //CTE System.out.println("str4.concat(str5) = " + str4.concat(str5));

    }
}
