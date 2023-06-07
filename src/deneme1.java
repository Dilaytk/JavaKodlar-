import java.util.Scanner;

public class deneme1 {


    public static void main(String[] args) {
        String str= "çalıştıkça daha çok şey bilmediğimi farkediyorum";
        System.out.println("str.substring(0,4) = " + str.substring(0, 4));


        int sonOnİki = str.length()-12;

        System.out.println("sonOnİki = " + sonOnİki);

        System.out.println("str.charAt(sonOnİki) = " + str.charAt(sonOnİki));

        System.out.println("str.substring(sonOnİki) = " + str.substring(sonOnİki));

        System.out.println("str.substring(0,10) = " + str.substring(0, 11));


        System.out.println("str.substring(0,1) = " + str.substring(0, 1));

        Scanner input = new Scanner(System.in);

        System.out.println(" 4 harfli bir kelime gir");

        String str5 =input.next();
        if (str5.length() !=4){
            System.out.println("yanlış kelime girdin 4 harfli gir");

        }else{
            System.out.print("str5.substring(str5.length() -1 ) = " + str5.substring(str5.length() - 1));
            System.out.print(str5.charAt(str5.length()-2));
            System.out.print(str5.substring(   (str5.length() -3)  , (str.length() -2)  ));


        }



    } }








