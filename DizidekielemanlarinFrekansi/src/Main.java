import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        System.out.println("Dizi: " + Arrays.toString(list));

        int[] count = new int[list.length];
        Arrays.fill(count, -1); // Initialize count array with -1

        for (int i = 0; i < list.length; i++) {
            int sayac = 1; // Tekrar sayısını tutacak değişken
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    sayac++; // Tekrar sayısını artır
                    count[j] = 0; // Zaten sayıldığı için tekrar sayacını sıfırla
                }
            }
            if (count[i] != 0) {
                count[i] = sayac; // Tekrar sayısını sakla
            }
        }

        for (int i = 0; i < list.length; i++) {
            if (count[i] != 0) {
                System.out.println(list[i] + " sayısı " + count[i] + " kere tekrar edildi.");
            }
        }
    }
}
