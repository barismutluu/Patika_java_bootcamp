import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        int n;
        Scanner input =new Scanner(System.in);
        System.out.print("Sınır Sayısını giriniz :");
        n = input.nextInt();

        System.out.println("4'ün Kuvvetleri\t5'in Kuvvetleri");
        for (int i = 1, j = 1; i <= n || j <= n; i *= 4, j *= 5) {
            if (i <= n) {
                System.out.print(i + "\t\t\t");
            } else {
                System.out.print("\t\t\t\t\t\t");
            }
            if (j <= n) {
                System.out.println(	"\t" +j);
            }
        }
    }
}
