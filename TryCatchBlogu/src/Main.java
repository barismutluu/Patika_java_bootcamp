import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[10];

        array[0] = 55;
        array[1] = 0;
        array[2] = 5;
        array[3] = 224;
        array[4] = 5;
        array[5] = 3;
        array[6] = 24;
        array[7] = 20;
        array[8] = 35;
        array[9] = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir indek değeri giriniz : ");

        try {
            int index = input.nextInt();
            System.out.println("array[" + index + "] = " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}