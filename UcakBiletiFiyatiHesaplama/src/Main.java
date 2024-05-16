import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler tanımlandı
        int yas,yt,km;
        double total,yi,yti;
        // Kullanıcıdan değer alındı
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcıdan Mesafe (KM) Giriniz :");
        km = inp.nextInt();

        System.out.print("Yaşınızı Giriniz :");
        yas = inp.nextInt();

        System.out.print("1- Tek Yön\n2- Gidiş-Dönüş \nYolculuk tipini belirtiniz  :");
        yt = inp.nextInt();
        // mesafe ücreti hesaplandı
        total=km*0.10;
        // mesafeye,yaş ve yolculuk tipi hatalı giriş yapılırsa hata bilgisi verecek
        if (km <= 0 || yas <= 0 || (yt != 1 && yt != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }
        // yas şartlarına göre ücretler hesaplandı.

        if (yas <= 12 ) {
            yi = total - (total * 0.5);
            if (yt==1){
                System.out.println("Toplam Tutar =" + yi);
            } else  {
                yti = yi * 0.2;
                System.out.println("Toplam Tutar =" + (yi - yti)*2);
            }
        }
        else if (yas > 12 && yas < 24) {
            yi = total - (total * 0.1);
            if (yt==1){
                System.out.println("Toplam Tutar =" + yi);
            } else  {
                yti = yi * 0.2;
                System.out.println("Toplam Tutar =" + (yi - yti)*2);
            }
        }
        else if (yas > 24 && yas < 65) {

            if (yt==1){
                System.out.println("Toplam Tutar =" + total);
            } else  {
                yti = total * 0.2;
                System.out.println("Toplam Tutar =" + (total - yti)*2);
            }
        }
        else if (yas > 65) {
            yi = total - (total * 0.3);
            if (yt==1){
                System.out.println("Toplam Tutar =" + yi);
            } else  {
                yti = yi * 0.2;
                System.out.println("Toplam Tutar =" + (yi - yti)*2);
            }
        }

    }
}
