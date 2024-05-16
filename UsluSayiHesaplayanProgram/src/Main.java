import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,k;
        Scanner input=new Scanner(System.in);
        System.out.print("Üssü alınacak sayı :");
        n=input.nextInt();
        System.out.print("Üs olacak sayı :");
        k=input.nextInt();

        //3^4 =3 * 3 * 3 * 3
        int total=1;
        int i=1;
        while (i<=k){
            total *=n;
            i++;

        }
        System.out.println("Cevap : "+total);
    }
}