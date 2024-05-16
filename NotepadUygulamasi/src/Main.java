import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Dosya yolunu tanımla
        String filePath = "notepad.txt";

        // Kullanıcıdan metin girişi al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Metin girin: ");
        String userInput = scanner.nextLine();

        // Metni dosyaya kaydet
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(userInput);
            fileWriter.close();
            System.out.println("Metin  " + filePath + " dosyasına kaydedildi.");
        } catch (IOException e) {
            System.out.println("Metin dosyaya kaydedilirken hata oluştu: " + e.getMessage());
        }

        // En son kaydedilen metni dosyadan oku ve ekrana yazdır
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String lastSavedText = bufferedReader.readLine();
            bufferedReader.close();
            System.out.println("En son kaydedilen metin: " + lastSavedText);
        } catch (IOException e) {
            System.out.println("Metin dosyasından okunurken hata oluştu: " + e.getMessage());
        }
    }
}
