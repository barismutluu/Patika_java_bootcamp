import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        // Değişkenler oluşturuldu
        int mat,fizik,kimya,turkce,tarih,muzik;

        // Scanner sınıfı tanımlandı
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değer alınıyor
        System.out.println("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.println("Türkçe Notunuz : ");
        turkce = input.nextInt();

        System.out.println("Tarih Notunuz : ");
        tarih = input.nextInt();

        System.out.println("Müzik Notunuz : ");
        muzik = input.nextInt();

        int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc =toplam/6.0;
        System.out.println("Ortalamanız : "+sonuc);

        String msg = sonuc > 60
                ? "Sınıfı Geçti"
                :"Sınıfta Kaldı";
        System.out.println(msg);




    }
}