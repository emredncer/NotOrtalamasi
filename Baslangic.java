package Giris;
import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        System.out.println("Bu program sizin not ortalamanızı hesaplayacak ve sınıf geçme durumunuzu sorgulayacaktır.");
    int mat, fzk, kimya, turkce, tarih, muzik;
    Scanner input = new Scanner(System.in);
        System.out.print("matematik notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.print("fizik notunuzu giriniz: ");
        fzk = input.nextInt();
        System.out.print("kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        double ortalama = (mat+fzk+kimya+turkce+tarih+muzik)/6;
        System.out.println("Not ortalamanız :" + ortalama);
        boolean sonuc = ortalama >= 60 ;
        String son = sonuc ? "Tebrikler" : "Sınıf tekrarı";
        System.out.println(son);

    }
}
