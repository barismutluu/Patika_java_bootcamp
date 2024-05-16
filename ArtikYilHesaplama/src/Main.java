import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler tanımlandı
        int yil,cz;
        // Kullanıcıdan değer alındı
        Scanner inp = new Scanner(System.in);

        System.out.print("Yıl Giriniz :");
        yil = inp.nextInt();

        if (yil%4==0 && (yil%100!=0)||(yil%400==0)){
            System.out.println(yil + " Bir artık yıldır !");
        }
        else {
            System.out.println(yil + " Bir artık yıldır değildir !");
        }
    }
}