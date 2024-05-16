import java.util.Scanner;

public class Odev {
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

        switch (select){
            case 1:
                System.out.println("Toplam: "+(n1+n2));
                break;
            case 2:
                System.out.println("Çıkartma: "+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpma: "+(n1*n2));
                break;
            case 4:
                if (n2 !=0){

                    System.out.println("Bölme: "+(n1/n2));
                }
                else {
                    System.out.println("Bir sayı 0'a bölünemez !");
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar Deneyiniz.");
        }
}
}