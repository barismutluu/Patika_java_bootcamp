import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan değer alınması için Scanner tanımlanıyor
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan dizi boyutunun değeri alınıyor
        System.out.print("Dizinin boyutu n :");
        int diziBoyutu = input.nextInt();
        //Dizi tanımı yapılıyor
        int[] numbers = new int[diziBoyutu];
        //Kullanıcından aldığımız dizi boyutu kadar eleman tanımlanması isteniyor
        for (int i = 0; i < diziBoyutu; i++) {
            System.out.print(i + 1 + ". Elemanı :");
            numbers[i] = input.nextInt();
        }
        // Kullanıcıdan alınan verilerle oluşturulan dizi küçükten büyüğe sıralanıyor ve ekrana yazdırılıyor
        Arrays.sort(numbers);
        System.out.println("Sıralama :" + Arrays.toString(numbers));
    }
}