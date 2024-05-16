import java.util.Scanner;

public class Odev {
    public static void main(String[] args)
    {

        // Değişkenler oluşturuldu
        double tutar;
        double KDV1=0.18;
        double KDV2=0.08;

        // Scanner snıfı tanımlandı
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değer alınıyor
        System.out.print("Toplam tutarı giriniz : ");
        tutar = input.nextDouble();
        if ((!(tutar > 0)) || (!(tutar <= 1000))) {
        double kdvf=KDV2*tutar+tutar;
        double kdvt=KDV2*tutar;
        System.out.println("KDV'siz Fiyat =" + tutar);
        System.out.println("KDV'li Fiyat ="+ kdvf);
        System.out.printf("KDV tutarı = "+"%2.1f\n",kdvt);

    } else {
        double kdvf=KDV1*tutar+tutar;
        double kdvt=KDV1*tutar;
        System.out.println("KDV'siz Fiyat =" + tutar);
        System.out.println("KDV'li Fiyat ="+ kdvf);
        System.out.printf("KDV tutarı = "+"%2.1f\n",kdvt);

    }
    }
}