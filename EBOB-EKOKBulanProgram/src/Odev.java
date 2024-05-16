import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("n1 sayısı giriniz : ");
        int n1 =input.nextInt();

        System.out.print("n2 sayısı giriniz : ");
        int n2 =input.nextInt();
        int ebob=1;
        int k = n1,i=1;

        while (k >= 1){
            if (n1 % k == 0 && n2 % k == 0){
                ebob = k;
                System.out.println("Ebob : "+ebob);
                break;

            }
            k--;
        }
        while (i<=(n1*n2)){
            if (i % n1 == 0 && i % n2 == 0){
                System.out.println("Ekok :"+i);
                break;
            }
            i++;
        }


}
}