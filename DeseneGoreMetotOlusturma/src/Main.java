import java.util.Scanner;

public class Main {
    public static void output(int number) {

        if (number <= 0) {

            System.out.print(number + " ");
            return;
        }
        // Sayıyı Ekrana Yazdır ve 5 Azalt
        System.out.print(number + " ");
        output(number - 5);
        // Yeniden Sayıyı Ekrana Yazdırılıyor
        System.out.print(number + " ");
    }

    // kullanıcıdan değer alınır
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısı :");
        int number = input.nextInt();
        output(number);

    }
}