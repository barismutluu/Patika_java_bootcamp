import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n sayısını giriniz :");
        int n = input.nextInt();
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result += (1.02 / i);
        }
        System.out.println(result);
    }
}