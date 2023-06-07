package C02_DataTypes_WrapperClass;

import java.util.Scanner;

public class orn3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen adınızı giriniz");
        String name = input.nextLine();
        char ilkHarf=name.charAt(0);
        System.out.println("ilkHarf = " + ilkHarf);
        System.out.println("name.length() = " + name.length());
        char sonHarf  = name.charAt(name.length() -1);


    }

}
