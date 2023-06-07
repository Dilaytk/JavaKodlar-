package Ch05_if_else_Ternary;

import java.util.Scanner;

public class hoca3 {
    public static void main(String[] args) {
          /*
        Task01
           girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi gir");

        int sayi = input.nextInt();

        if (sayi > 0){//sayinin pozitif olup olmadigi kontrol edildi
            System.out.println("pozitif bir sayidir");
        } else if (sayi < 0 ) {//sayi negatif mi kontrol edildi
            System.out.println("negatif sayidir");
        }else {
            System.out.println("girdigin sayi sifir dir");
        }  //else if değilde else yazdığında şart bitiyor artık başka bir şart koyamazsın else if yaparsan 2. bi şart koycağım dedin say


    }
}
