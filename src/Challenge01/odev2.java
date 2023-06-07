package Challenge01;

import java.util.Scanner;

public class odev2 {

    /* Task ->
     * Girilen Y/N  degerlerini
     * print eden code create ediniz..
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("y veya n giriniz");

        String yesNo = sc.nextLine();
        if (yesNo.equalsIgnoreCase("y")){
            System.out.println("yes");

        } else if (yesNo.equalsIgnoreCase("n")) {
            System.out.println("no");
        }else System.out.println("hatalı giriş");


    }

}
