import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        //Değişkenler tanımlandı
        int a,b,c;
        // Kullanıcıdan değer alındı
        Scanner inp = new Scanner(System.in);

        System.out.print("1.Sayi :");
        a = inp.nextInt();

        System.out.print("2.Sayi :");
        b = inp.nextInt();

        System.out.print("3.Sayi :");
        c = inp.nextInt();
        // Küçükten Büyüğe sıralama işlemi yapıldı
        if ((a<b) && (a<c)){
            if (b<c){
                System.out.println("a < b < c");
            }else {
                System.out.println("a < c < b");
            }
        } else if ((b<a) &&(b<c)) {
            if (a<c){
                System.out.println("b < a < c");
            }else {
                System.out.println("b < c < a");
            }

        } else if ((c<b)&&(c<a)) {
            if (a<b){
                System.out.println("c < a < b");
            }else {
                System.out.println("c < b < a");
            }
        }


    }
}