public class Odev {
    void print(int[] numbers) {
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += 1.0 / numbers[i];

        }
        double harmonicMean = total;
        System.out.println("Harmonik Ortalama: " + harmonicMean);
    }

}
