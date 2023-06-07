package C02_DataTypes_WrapperClass;

public class orn2 {
    public static void main(String[] args) {
        String name = "helin";
        String soyad = "çar";
        int a = 7;
        int b = 11;
        System.out.println(name + soyad + a+ b);

        System.out.println(a+name+soyad+b);

        System.out.println(a+b+name+ soyad);

        System.out.println(name+ soyad +(a+b));

        System.out.println(name + ( a-b ) + (a-b));

        System.out.println(name+ (  ( a-b) + (a-b) ));

        char num = '1';

        System.out.println(name+num);

        System.out.println(a+num+name);

        System.out.println(name+ (num+b));

        System.out.println(a+name+num);


    }
}
