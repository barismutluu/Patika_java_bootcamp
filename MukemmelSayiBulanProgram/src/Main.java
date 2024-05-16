import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan değer alınıyor
        int  n;
        int total = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        n = scanner.nextInt();
        //negatif yazı girişi yapıldıysa uyarı veriyor.
        if (n <= 0) {
            System.out.println("Negatif veya sıfır bir sayı mükemmel sayı olamaz.");
        } else {
        //kullanıcan alınan sayının çarpanlarına ayrılması yapılııyor
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    total += i;
                }
            }
            //çarpanlara ayrılan sayıyı mükel sayı olup olmadığı belirtiliyor.
            if (total == n) {
                System.out.println(n + " Mükemmel Sayıdır.");
            } else {
                System.out.println(n + " Mükemmel Sayı Değildir.");
            }
        }
    }
}