import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenler Tanımlandı

        int n1,n2,select;

        //Kullanıcıdan değerler talep edildi

        Scanner input=new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        n1=input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        n2=input.nextInt();

        System.out.println("1- Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select=input.nextInt();

        //İşlem numarasına göre kıyaslama yapılarak sonuç hesaplandı

        if (select==1){
            System.out.println("Toplam: "+(n1+n2));
        } else if (select==2) {
            System.out.println("Çıkartma: "+(n1-n2));
        } else if (select==3) {
            System.out.println("Çarpma: "+(n1*n2));
        } else if (select==4) {
            if (n2 !=0){

            System.out.println("Bölme: "+(n1/n2));
            }
            else {
                System.out.println("Bir sayı 0'a bölünemez !");
            }
        }
        else {
            System.out.println("Yanlış seçim yaptınız. Tekrar Deneyiniz.");
        }

    }
}