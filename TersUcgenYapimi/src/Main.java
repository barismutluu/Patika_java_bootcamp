import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenlerin yaratılması
        int n;

        Scanner input = new Scanner(System.in);
        //Kullanıcı veri girişi
        System.out.print("Üçgen için Basamak sayısı giriniz : ");
       n = input.nextInt();

            System.out.println("Basamak Sayısı : "+n);
        for (int i = n; i >= 1; i--) {
            // Boşlukları ekle
            for (int j = 1; j <= n - i; j++) {
            }
            // Yıldızların Alt Kısmı Tanımlanıyor
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}