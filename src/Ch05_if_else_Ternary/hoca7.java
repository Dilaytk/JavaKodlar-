package Ch05_if_else_Ternary;

import java.util.Scanner;

public class hoca7 {
    public static void main(String[] args) {

         /*
		 Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın.
		  Eğer urun miktarı 100 den fazla ise %33  indirim yapıp
          ödemesi gereken toplam miktarı print eden code create ediniz.
		 */
            Scanner input = new Scanner(System.in);
        System.out.println("urun miktari gir");
        int urunMiktar = input.nextInt();

        System.out.println("urun birim fiyati gir");
        int urunFiyat = input.nextInt();

        double fatura = urunMiktar > 100 ? (urunFiyat*urunMiktar*0.67)  : (urunFiyat*urunMiktar) ;
        System.out.println("fatura = " + fatura);


    }


}
