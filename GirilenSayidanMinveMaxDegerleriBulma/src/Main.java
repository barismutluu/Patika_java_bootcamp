import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler tanımlanmıştır.
        int max=0,min=0;
        //Kullanıcıdan kaç adet sayı girileceği verisi alındı
        Scanner klavye = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        int n = klavye.nextInt();

        //Kullanıcından istenen sayı adeti kadar değer alınır.

        for (int i=1;i<=n;i++){
            System.out.print(i+". Sayıyı giriniz:");
            int s= klavye.nextInt();

            //Kullanıcıdan max ve min değerler tespit edilir.
            if (i==0) {
                max = s;
                min = s;
            } else {
                if (s > max) {
                    max = s;
                }

                if (s < min) {
                    min = s;
                }
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
