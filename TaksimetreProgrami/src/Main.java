import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // Değişkenler oluşturuldu
        double km,total,startprice=10;


        // Scanner snıfı tanımlandı
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değer alınıyor
        System.out.print("Gidilen mesafeye (KM) değerini giriniz : ");
        km = input.nextDouble();

        total=startprice+km*2.20;
        total=(total<=20)?20:total;
        System.out.println("Ödenecek Tutar = "+ total+" TL");
        }
    }