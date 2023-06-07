package Ch05_if_else_Ternary;

import java.util.Scanner;

public class hoca2 {


    public static void main(String[] args) {

        // TASK-> girilen yasın 18 den buyuklugunu kontrol eden code create ediniz
        //    18 den kuçuk ise ehliyet alamazsınız print ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("yasini gir");

        int yas = input.nextInt();

        if (yas >= 18) {//yasin 18 ve daha buyul olup olmadigi kontrol edildi
            // 18) den sonra süslü parantez var dikkat edersen if bittikten ; koydyktan sonra bi daha var biri açmalı parantez
            // diğeri kapatan parantez olmalı else de parantezden sonra yazılıyor (ay)
            // birde >= arasında boşluk olursa büyük eşittir olmaz hata verir (ay)
            System.out.println("ehliyet alma sansiniz var");
        } else {//yularida sarttan sonra else yas 18 den kucuk use calisir
            System.out.println("ehliyet alamazsınız");
        }
    }
}
