import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // Değişkenler oluşturuldu
        double a,b,c,Alan;


        // Scanner snıfı tanımlandı
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değer alınıyor
        System.out.print("a değerini giriniz : ");
        a = input.nextDouble();

        // Kullanıcıdan değer alınıyor
        System.out.print("b değerini giriniz : ");
        b = input.nextDouble();

        c=(a*a+b*b);
        Alan=(a*b)/2;

        System.out.println("Hipotenüs = "+Math.sqrt(c));
        System.out.print("Alanı = "+Alan);
    }
}