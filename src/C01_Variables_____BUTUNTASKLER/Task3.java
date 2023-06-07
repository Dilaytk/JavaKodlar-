package C01_Variables_____BUTUNTASKLER;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

         /*    Bir String oluşturun.
          Konsol'a isminizi girin.
          İsminizi yazdırın.  */

        Scanner input = new Scanner(System.in);
        System.out.println("Adınızı yazınız...");
        String name = input.nextLine();
        System.out.println("name = " + name);



         /*    Bir int oluşturun.
          Konsol'a herhangi bir sayı giriniz.
          Bu sayıyı yazdırın.   */


        System.out.println("Bir sayı giriniz...");
        int sayi = input.nextInt();
        System.out.println("sayi = " + sayi);


        /*   Bir String oluşturun.
          Konsol'a sevdiğiniz bir meyveyi yazın.
          O meyveyi yazdırınız.   */

        System.out.println("En sevdiğiniz meyveyi yazınız...");
        String meyve = input.nextLine();
        System.out.println("meyve = " + meyve);


    /*    Bir int oluştur.
          Konsol'a arabanızdaki kapı sayısını girin.
          Bu int'i yazdırın.  */


        System.out.println("Arabanızdaki kapı sayısını giriniz...");
        int kapıSayısı = input.nextInt();
        System.out.println("kapıSayısı = " + kapıSayısı);


        /*    Bir String oluştur.
          Konsol'a 10 sene önceki yaşadığın şehri yazın.
          Bu String'i yazdırın.   */


        System.out.println("10 sene önce yasadıgınız sehri giriniz...");
        String sehir = input.nextLine();
        System.out.println("sehir = " + sehir);


         /*    Bir string oluşturunuz.
          Doğum gününüzü konsola giriniz.
          String'i yazdırınız.  */


        System.out.println("Dogum gununuzu giriniz...");
        String dogumGunu = input.nextLine();
        System.out.println("dogumGunu = " + dogumGunu);



         /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */


        System.out.println("Banka hesabınız var mı...(true or false olarak cevaplayınız)");
        boolean varMı = input.nextBoolean();
        System.out.println("varMı = " + varMı);


        /*    Bir float oluşturunuz.
          Konsola boyunuzu giriniz.
          Float'ı yazdırınız.   */


        System.out.println("Boyunuzu giriniz...");
        float boy = input.nextFloat();
        System.out.println("boy = " + boy);



    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */

       System.out.println("kilonuzu giriniz...");
        byte kılo = input.nextByte();
        System.out.println("kılo = " + kılo);


            /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */

        System.out.println("Write your mid-term grade");
        int midtermGrade = input.nextInt();
        System.out.println("midtermGrade = " + midtermGrade);

        System.out.println("Write your final grade");
        int finalGrade = input.nextInt();
        System.out.println("finalGrade = " + finalGrade);


        System.out.println("Write your project grade");
        int projectGrade = input.nextInt();
        System.out.println("projectGrade = " + projectGrade);

        System.out.println("Your grade is : " + (midtermGrade*0.3 + finalGrade*0.2 + projectGrade*0.5));




        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
        */

        System.out.println("Boyunuzu cm olarak giriniz...");
        float boy1 = input.nextFloat();
        System.out.println("Kilonuzu kg olarak giriniz...");
        float kilo = input.nextFloat();
        System.out.println("Boyunuz : " + boy1 + "\n" +
                "Kilonuz : " + kilo + "\n" +
                "Vucut Kitle Endeksiniz : " + (kilo/(boy1*boy1/10000)));




        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */

        System.out.println("Gunde kac saat uyudugunuzu giriniz...");
        int uykuSuresi = input.nextInt();
        System.out.println("Ayda " + (30*uykuSuresi/24) + ", Yılda " + (365*uykuSuresi/24) + ", 40 Yılda " +
                (365*40*uykuSuresi/24) + " gununuz uykuda geciyor.");



         /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        System.out.println("Adınızı, soyadınızı giriniz...");
        String adsoyad = input.nextLine();
        System.out.println("Yasınızı giriniz...");
        int yas = input.nextInt();
        System.out.println("Kilonuzu giriniz...");
        int kilo1 = input.nextInt();
        System.out.println("Boyunuzu giriniz...");
        int boy2 = input.nextInt();
        System.out.println("Kaç ay devam edeceksiniz...");
        int ay = input.nextInt();

        System.out.println("Ad-Soyad : " + adsoyad + "\n" +
                "Yasınız : " + yas + "\n" +
                "Kilonuz : " + kilo1 + "\n" +
                "Boyunuz : " + boy2 + "\n" +
                "Salon ucreti : " + (ay*20) + " dolardır.");


        // kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz

        System.out.println("Bir sayi giriniz...");
        int num1 = input.nextInt();
        System.out.println("Farklı bir sayi giriniz...");
        int num2 = input.nextInt();
        System.out.println("Toplam = " + (num1+num2) + "\n" +
                "Cıkarma = " + (num1-num2) + "\n" +
                "Bolum = " + (num1/num2) + "\n" + "Carpım = " + (num1*num2));



        /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */


        // System.out.println("hipotenüs = " + hipotenüs);

        System.out.println("Ucgenin dik kenarını giriniz...");
        int kenar1 = input.nextInt();
        System.out.println("Ucgenin diger dik kenarını giriniz...");
        int kenar2 = input.nextInt();

        float hipotenus = (float) Math.sqrt(kenar1*kenar1 + kenar2*kenar2);
        System.out.println("hipotenus = " + hipotenus);

         /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */

        System.out.println("Gideceginiz mesafeyi giriniz...");
        float mesafe = input.nextFloat();
        System.out.println("Saatteki hızınızı giriniz...");
        float hız = input.nextFloat();
        float sure = (float) (mesafe/hız);
        System.out.println("Gideceginiz mesafe : " + mesafe + "\n" +
                "Hızınız : " + hız + "\n" +
                "Süre : " + sure + "saattir.");



        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        System.out.println("Vize1 notunuzu giriniz");
        float vize1 = input.nextFloat();
        System.out.println("Vize2 notunuzu giriniz");
        float vize2 = input.nextFloat();
        System.out.println("Final notunuzu giriniz");
        float finalNotu = input.nextFloat();
        float gecmeNotu = ((((vize1 + vize2)/2) * 30) / 100) + ((finalNotu * 70) / 100);

        System.out.println("gecmeNotu = " + gecmeNotu);


         /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        System.out.println("a sayısını giriniz...");
        int a = input.nextInt();
        System.out.println("b sayısını giriniz...");
        int b = input.nextInt();
        System.out.println("c sayısını giriniz...");
        int c = input.nextInt();

        System.out.println("sonuc : " + ((a*a - b*b))/(c*3));




        // Write a Java program to convert temperature from Fahrenheit to Celsius degree.
        // c = (f-32)*5/9

        System.out.println("Sıcaklıgı Fahrenheit cinsinden giriniz...");
        float f = input.nextFloat();
        float celcius = (f-32)*5/9;
        System.out.println("celcius = " + celcius);

    }

    }

