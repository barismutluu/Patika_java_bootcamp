import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        int k;
        int sum = 0; // Toplamı saklamak için değişken
        int count = 0; // Toplamda kaç adet sayı olduğunu tutmak için değişken


        Scanner inp= new Scanner(System.in);

        System.out.println("Sayı Giriniz :");
        k=inp.nextInt();


        for (int i=1;i<=k;i++){
            if (i % 3==0 && i % 4==0){
                System.out.println(i);
                sum += i; // Her uygun sayıyı toplama ekle
                count++; // Her uygun sayı için sayaç artır
            }
        }

        if (count > 0) {
            double average = (double) sum / count; // Ortalama hesapla
            System.out.println("Sayıların Ortalaması: " + average);
        } else {
            System.out.println("Girilen aralıkta 3 ve 4'e tam bölünebilen sayı yok.");
        }
    }
}