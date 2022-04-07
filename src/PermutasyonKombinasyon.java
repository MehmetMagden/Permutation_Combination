import java.util.Scanner;

public class PermutasyonKombinasyon {

     /*  Problem Tanımı
            Verilen iki sayının kombinasyonunu bulan kodu yazınız.
            Hatırlatma C(n,r) = n! / (r!(n-r)!)

            Verilen iki sayının permütasyonunu bulan kodu yazınız.
            Hatırlatma P(n,r) = n! / (n-r)!

            Ekran Çıktısı
            Birinci sayıyı giriniz: 15
            Ikinci sayıyı giriniz: 4
            Kombinasyon: 1365
            permütasyon: 32760

            Birinci sayıyı giriniz: 5
            Ikinci sayıyı giriniz: 3
            Kombinasyon: 10
            permütasyon: 60
          */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);;
        System.out.println("1. sayiyi giriniz");
        int sayi1 =scan.nextInt();
        System.out.println("2. sayiyi giriniz");
        int sayi2 = scan.nextInt();

        System.out.println(""+sayi1+" ve "+sayi2+"'nin kombinasyonu = "+kombinasyon(sayi1, sayi2));
        System.out.println(""+sayi1+" ve "+sayi2+"'nin permutasyonu = "+permutasyon(sayi1, sayi2));


    }

    private static double kombinasyon(int sayi1, int sayi2) {
        double sonuc=1;
        sonuc = factorial(sayi1)/(factorial(sayi2)*factorial(sayi1-sayi2));


        return sonuc;
    }

    private static Double permutasyon(int sayi1, int sayi2) {
        double sonuc=1;
        sonuc=factorial(sayi1)/factorial(sayi1-sayi2);

        return sonuc;
    }

    private static double factorial(int sayi1) {
        double sonuc=1;
        for (int i = 1; i <=sayi1 ; i++) {
            sonuc*=i;
         }
        return sonuc;
    }
}
