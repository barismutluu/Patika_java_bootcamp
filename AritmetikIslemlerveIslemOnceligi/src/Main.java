import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // Değişkenler oluşturuldu

        int a,b,c,total;


        // Scanner snıfı tanımlandı
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değer alınıyor
        System.out.print("a değerini giriniz : ");
        a = input.nextInt();

        System.out.print("b değerini giriniz : ");
        b = input.nextInt();

        System.out.print("c değerini giriniz : ");
        c = input.nextInt();
        // Hesaplama işlemi yapıldı
        total=a+b*c-b;
        //Ekrana yazdırıldı
        System.out.println(a+"+"+b+"*"+c+"-"+b+" İşleminin sonucu = " +total);
    }
}