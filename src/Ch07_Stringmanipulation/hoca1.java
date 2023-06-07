package Ch07_Stringmanipulation;

public class hoca1 {
    public static void main(String[] args) {

    /**
        concat() methodu içine(parametee) aldığı string variable'ı çalıştşğı stringin sonuna ekler..
        java'da + işlemi yapılırken eğer en az bir string variable varsa java toplama değil concat yapar.
         */

        String name = "Batu" ;
        String title = "SDET QA";
        int age = 30 ;

        System.out.println(name + title);
        System.out.println("name.concat(title) = " + name.concat(title));
        // name. dediğimde çıkan methodlardan concat ın (string) parantezinin içinde string yazıyordu yani parametre alıyo
        // name.concat(title)yazdığımda bu parantezin içine name ile birleştirmek istediğim şeyi yazmış oldum


        System.out.println("age = " + age);//age = 30
        System.out.println(age);//30

        //String i int e nasil ceviririrz
        String number = "123456";
        System.out.println("number = " + number+1);//number = 1234561
        // burada concat olmuş oldu +1 ekled String bu

        //output 123457 olmali
        System.out.println("Integer.parseInt(number+1) = " + ( Integer.parseInt(number + 1) + 1));//Integer.parseInt(number+1) = 1234562
        // burada parantez koymayınca stringden sonra olunca concat ediyor
        System.out.println("name.concat(true+ \" :) \") = " + name.concat(true + " :) "));//name.concat(true+ " :) ") = Batutrue :)
        //   name.concat(true +":)"). bunuyazdımsoutvdedim  bu kadar

        // true lerin önündeki str ler bu arada şey String str yazıyoruz ya o. intellij le alakalı.str Stringi temsil ediyor
        // önemli bir şey değil yani oradki değerin ne olduğunu gösteriyor string olduğunu

        System.out.println("name.concat(100+ \" :) \") = " + name.concat(100 + " :) "));//name.concat(true+ " :) ") = Batu100 :)

        System.out.println("title.concat(false + \"Kasim\") = " + title.concat(false + "Kasim"));

    }
}
