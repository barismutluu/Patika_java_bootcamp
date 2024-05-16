import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        int[] array = {56, 34, 1, 8, 101, -2, -33};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the target number: ");
        int targetNumber = scanner.nextInt();

        int closestSmaller = findClosestSmaller(array , targetNumber);
        int closestLarger = findClosestLarger(array ,targetNumber);

        System.out.println("Closest number smaller than the entered number: " + closestSmaller);
        System.out.println("Closest number larger than the entered number: " + closestLarger);

    }

    static int findClosestSmaller(int[] array, int target) {
        int minValue = Integer.MIN_VALUE;
        for (int number : array) {
            if (number < target && number > minValue) {
                minValue = number;
            }
        }
        return minValue;
    }

    static  int  findClosestLarger(int[] array, int target) {
        int maxValue = Integer.MAX_VALUE;
        for (int number : array) {
            if (number > target && number < maxValue){
                maxValue = number;
            }

        }
        return maxValue;
    }

}