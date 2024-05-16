import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        // Değişkenler oluşturuldu
        int r,aci;
        double Alan, pi = 3.14;


        // Scanner snıfı tanımlandı
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değer alınıyor
        System.out.print("Yarı çapı değerini giriniz : ");
        r = input.nextInt();
        System.out.print("Merkez açısının ölçüsü  değerini giriniz : ");
        aci = input.nextInt();

        Alan=(pi*(r*r)*aci)/360;

        System.out.println("Dairenin Alanı = "+ Alan);
    }
}
