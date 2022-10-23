import java.util.Random; // random değer çağırmak için kullanılan bir ııftıt
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args)
    {
        Random rand = new Random(); // sınıfı bir nesne oluşturduk
        int number = rand.nextInt(100);
        int girisHakki=0;
        int secim;
        int[] yanlis=new int[5];
        boolean iswrong=false;
        // bu nesnenin içinde bulunan metotlardan nexInt ilei de 0 ilie 100 arası bir değerüretmnemsini sağladık

        //int number = (int)(Math.random()*100);
       //math.random bize double olrak random bir sayı üretirken burda double değeri int a çevirdik

        Scanner input =new Scanner(System.in);
        System.out.println(number);
        System.out.println("========Sayı Tahmin Oyununa Hoşgeldiniz========");

        while (girisHakki<5) {
            System.out.println("Lutfen tahmininizi giriniz:\t");
            secim = input.nextInt();

            if (secim < 0 || secim > 100)
            {
                System.out.println("Lutfen 0-100 ahrasında bir değer giriniz.");

                if(iswrong)
                {
                    System.out.println("Çoko fazla hatalı giriş yaptınız kalan hakkınız:"+(5-(++girisHakki)));

                }
                else
                {
                    iswrong=true;
                    System.out.println("Bir daha ki hatalı tahminde canınız ekksilecektir.");
                }

            }
            else {

                if (secim == number) {
                    System.out.println("Tebrikler, Doğru tahmin\nTahmin edilen sayi :" + number);
                    break;
                }
                else
                {
                    yanlis[girisHakki]=secim;
                    girisHakki++;
                    System.out.println("Yanlış tahmin ettniz :(");

                    if(secim > number) System.out.println(secim +" Gizli sayıdan buyuktur");
                    else if (secim < number) System.out.println(secim +" Gizli sayıdan kucuktur");
                    System.out.println("Kalan tahmin hakkınız:\t"+(5-girisHakki));
                    System.out.println("------------------>\n");
                    if (girisHakki == 5)
                    {
                        System.out.println("Tahmin hakkınıız dolmuştur");
                        System.out.println("Yanlış tahmin edilen sayılar : "+Arrays.toString(yanlis));
                    }
                }

            }

        }





    }

}