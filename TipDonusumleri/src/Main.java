import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.print("Tam Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        System.out.print("Ondalıklı Bir Sayı Giriniz :");
        double k = klavye.nextDouble();

        double myDouble = n;
        System.out.println(myDouble);

        int myInt = (int) k;
        System.out.println(myInt);
    }
}