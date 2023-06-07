package Ch06_SwitchStatement;

import java.util.Scanner;

public class hoca5 {
    public static void main(String[] args) {

        // girilen ayın hangi mevsimde oldugunu print eden code create ediniz...
        // girdiğimiz ayın numarası  (input) çıktımız mevsim (output)

        Scanner input = new Scanner(System.in);
        System.out.println("ay numarasi gir");
        int ayNo = input.nextInt();

        switch (ayNo){
            default:
                System.out.println("ay rakami gir 1 ile 12 arainda");
                break;
            case 12 :
            case 1 :
            case 2 :
                System.out.println("kis mevsimi");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("ilkbahar mevsimi");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("yaz mevsimi");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("sonbahar mevsimi");
                break;
        }
        //kodu geri getiren tuslar ctrl + z
    }
}
