import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Kullanıcıdan Metin bilgileri girmesi talep edilir.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Metni girin:");
        String text = scanner.nextLine();
        //Metodlar çalıştırılır.
        WordCount wordCount = new WordCount();
        wordCount.metniIsle(text);
        wordCount.findthemostfrequentword();
    }
}