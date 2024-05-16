import java.util.Scanner;

public class Main {
    //total metodunda üslü sayılardaki özel durumlar belirtildi. Ve for içerisindeki upper değeri 1 azaltılarak işleme devam edildi.
    public static int total(int base, int upper) {
        int result;
        if (upper == 0) {
            return 1;
        } else {

            return result= base * total(base, upper - 1);

        }


    }

    // Main metodunda kullanıcıdan değer ve üst alma işlemi gerçekleştirildi.
    public static void main(String[] args) {

        int base, upper;
        Scanner input = new Scanner(System.in);
        System.out.println("Taban değeri giriniz :");
        base = input.nextInt();
        System.out.println("Üs değerini giriniz :");
        upper = input.nextInt();

        System.out.println(total(base,upper));

    }

}



