import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int basValue = 0;
        int result = 0;



        while (number != 0) {
            basValue = number % 10;

                number /= 10;
                result=result+basValue;
        }
        System.out.println(result);
    }
}
