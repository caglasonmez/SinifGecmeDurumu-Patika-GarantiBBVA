package CaglaSonmez;

import java.util.Scanner;
public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matematik, fizik, turkce, kimya, muzik;
        int toplam = 0, ders = 0;

        System.out.print("Matematik notunu giriniz: ");
        matematik = input.nextInt();
        if (matematik >= 0 && matematik <= 100) {
            toplam += matematik;
            ders++;
        }

        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            ders++;
        }

        System.out.print("Türkçe notunu giriniz: ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            ders++;
        }

        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            ders++;
        }

        System.out.print("Müzik notunu giriniz: ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            ders++;
        }

        double average = (matematik + fizik + turkce + kimya + muzik) / 5;

        if (average <= 55) {
            System.out.println("Sınıfı Geçemediniz!");;
        } else {
            System.out.println("Sınıfı Geçtiniz!");
        }

        System.out.println("Ortalamanız: " + average);


    }
}
