import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
// Dosyadan okuma
        try (BufferedReader br = new BufferedReader(new FileReader("metin.txt"))) {
            String line;
            int sum=0;
            while ((line = br.readLine()) != null) {
                int number = Integer.parseInt(line.trim());
                sum+=number;

            }
            System.out.println("Sayıların toplamı : "+sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}