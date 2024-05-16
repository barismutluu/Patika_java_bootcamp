public class Odev {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {3, 7, 3, 8, 3, 2, 9, 10, 21, 1, 33, 9, 1, 2, 12, 10, 8};
        int[] dublicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (list[i] % 2 == 0) {
                        if (!isFind(dublicate, list[i])) {
                            dublicate[startIndex++] = list[i];
                        }
                        break;
                    }
                }
            }
        }
        for (int value : dublicate) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
    }

}
