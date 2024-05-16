import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {

        // Değişkenler oluşturuldu
        double a, b, c, Alan ,cevre,u;


        // Scanner snıfı tanımlandı
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değer alınıyor
        System.out.print("a değerini giriniz : ");
        a = input.nextDouble();

        System.out.print("b değerini giriniz : ");
        b = input.nextDouble();

        System.out.print("c değerini giriniz : ");
        c = input.nextDouble();

        u=(a+b+c)/2;
        cevre= u * 2;
        Alan=u*(u-a)*(u-b)*(u-c);
        System.out.println("Alan = " + Math.sqrt(Alan));
        System.out.print("Çevre = "+ cevre);
    }
}