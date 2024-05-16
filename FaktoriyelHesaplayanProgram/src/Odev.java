import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {

        System.out.println("Kombinasyon formülü C(n,r) ");
        Scanner scan = new Scanner(System.in);
        System.out.print("n değeri için değer giriniz : ");
        int n = scan.nextInt();
        System.out.print("r değeri için değer giriniz : ");
        int r = scan.nextInt();
        double total = 1,total2 = 1,total3 = 1;

        for (int i=1; i <= n; i++){
            total = total * i;
        }
        for (int j=1; j <= r; j++){
            total2 = total2 * j;
        }
        int t=n-r;
        for (int k=1; k <= t; k++){
            total3 = total3 * k;
        }

        System.out.println(total/(total2*total3));
    }
}
