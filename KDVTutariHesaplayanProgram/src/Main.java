import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        // Değişkenler oluşturuldu
        double tutar;
        double KDV=0.18;

        // Scanner snıfı tanımlandı
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değer alınıyor
        System.out.print("Toplam tutarı giriniz : ");
        tutar = input.nextDouble();

            double kdvf=KDV*tutar+tutar;
            double kdvt=KDV*tutar;
            System.out.println("KDV'siz Fiyat =" + tutar);
            System.out.println("KDV'li Fiyat ="+ kdvf);
            System.out.printf("KDV tutarı = "+"%2.1f\n",kdvt);

    }
}