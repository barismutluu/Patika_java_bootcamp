import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // Değişkenler oluşturuldu
        int r;
        double Alan,cevre,pi=3.14;


        // Scanner snıfı tanımlandı
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değer alınıyor
        System.out.print("Yarı çapı değerini giriniz : ");
        r = input.nextInt();

        Alan=pi*r*r;
        cevre=2*pi*r;

        System.out.println("Alan = "+Alan);
        System.out.println("Çevre = "+cevre);


    }
}