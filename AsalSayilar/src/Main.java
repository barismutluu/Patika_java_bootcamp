import java.util.Scanner;

public class Main {
    public static int result(int number) {
        if (number == 2) {
            System.out.println(number + "sayısı ASALDIR !");

        } else if (number == 3) {
            System.out.println(number + "sayısı ASALDIR !");

        } else if (number == 5) {
            System.out.println(number + "sayısı ASALDIR !");

        } else if (number == 7) {
            System.out.println(number + "sayısı ASALDIR !");

        } else if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
            System.out.println(number + "sayısı ASALDIR !");

        } else {
            System.out.println(number + "sayısı ASAL değildir !");

        }
        return 1;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Değer giriniz :");
        int number = input.nextInt();
        result(number);

    }
}