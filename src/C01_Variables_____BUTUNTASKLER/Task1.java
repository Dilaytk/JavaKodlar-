package C01_Variables_____BUTUNTASKLER;

public class Task1 {
    public static void main(String[] args) {
        /* java escape special characters -> https://www.w3schools.com/java/java_strings_specchars.asp

	          \n  (or \r): starts from a new line : metni bir alt satırdan itibaren yazdırır.
	          \t:  horizontal tab : metni yatayda 1 tab miktarı  kaydırır.
	          \\: prints a back slash :\ (ters slash) yazdırır
	          \': prints single quote :' tek tırnak yazdırır.
	          \": prints double quote :"" Çift tırnak yazdırır.
	 */

        //System.out.println(isim +     " isimli personelin yasi = "+yas+ " maasi = "+maas);
        //amac tek bir sout icinde alt alta yazilabilir mi? variables
        String isim="zafer";
        int yas=33;
        double maas=15.000;

        System.out.println(isim  +     " isimli personelin yasi = "+yas);//output zafer isimli personelin yasi = 33

        System.out.println(isim  +     " \n isimli personelin yasi = "+yas);//output //zafer
        //isimli personelin yasi = 33
        //task maas ve yas i alt alta tek sout icinde print ediniz
        System.out.println("yas = " + yas + "\n" +maas);//\n icin ayri bir  "" cift tirnak acmak ve \n i icine yazamaniz gerekir

        System.out.println("efsane \n java \n gunleri \n basladi ");

        System.out.println(isim  +     " \n isimli personelin yasi = "+yas   + "/*     */ ");


        //output "zafer" olacak sekilde yazdiriniz
        System.out.println("\"" +isim  +"\"" );   //     \": prints double quote :"" Çift tırnak yazdırır.
        //tricky point special chars. mutlaka "" cift tirnak icin yazilmali
        //main method yoksa sout yazdiginizda System.out.println() gelmez



        // task1 konsola tırnak işareti içinde hello world yazdır şunu yani "Hello " . " world \ / "
        // konsola bir şeyi tırnak içinde yazdırmak için şunu yapman lazım \ BUNUN İÇİNE YAZMAN LAZIM TIRNAK İŞARETLİ KELİMEYİ
        System.out.println("\"Hello \", \"world \\ /\"");


       // task 2 pazartesi kelimesini  her harfini ayrı bir satıra gelecek şeklide yaz

        //1.yol
        System.out.println("p");
        System.out.println("a");
        System.out.println("z");
        System.out.println("a");
        System.out.println("r");
        System.out.println("t");
        System.out.println("e");
        System.out.println("s");
        System.out.println("i");

        // 2.yol
        System.out.println("p\na\nz\na\nr\nt\ne\ns\ni");

        //  task 3  "Java" ile hayat çok 'afilli' yaz
        System.out.println("\" Java \" ile hayat çok \'afilli \'");

       // task 4   "Basari" gayreti 'sever'  yazdırınız sonraki "Clarusway ile java cok kolay ..."
        // ifadesi  3 satır sonra ve satır basından 1 tab ileride yazılsın.

        System.out.println(" \"Basarı\" gayreti \'sever\' \n\n\n  \t \" Clarusway ile java çok kolay... \" ") ;

          /*
        TASk 5
		 * Sadece System.out.println kullanarak bu işlemleri yapınız.
         *    Herhangi bir değişken kullanmayın.
         * 1. Adım : İsim ve Soyismiminizi ekrana yazdırın.
         * 2. Adım : Satır atlayarak boyunuzu ekrana yazdırın.
         * 3. Adım : Satır atlayarak kilonu ekrana yazdırın.
         * 4. Adım : Satır atlayarak hobilerinizi ekrana yazdırın.
​
	             OUTPUT :
	             zafer e
	             165
	             65
	             Yuzme FUTBOL Java ...
		 */

        System.out.println("Faruk");
        System.out.println("177");
        System.out.println("77");
        System.out.println("kitap okumak \nşarkı dinlemek \nkoşmak");




    }
}
