import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /* 2x2 dizi boyutundan düşük olmayacak şekilden kullanıcıdan değer alınıyor. Kullanıcı 2 değerinin aldında
     bir değer girer ise tekrardan kullanıcından değer talep ediyor.*/
        Scanner scanner = new Scanner(System.in);
        int row, column;
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz !");
        do {
            System.out.print("Satır sayısını giriniz: ");
            row = scanner.nextInt();
            if (row < 2) {
                System.out.println("Girilen Satır değeri 2'den büyük olmalıdır. Lütfen Tekrar Deneyiniz !");
            }
        } while (row < 2);

        do {
            System.out.print("Sütun sayısını giriniz: ");
            column = scanner.nextInt();
            if (column < 2) {
                System.out.println("Girilen Sütun değeri 2'den büyük olmalıdır. Lütfen Tekrar Deneyiniz !");
            }
        } while (column < 2);

        MineSweeper mine = new MineSweeper(row, column);
        mine.run();
    }
}