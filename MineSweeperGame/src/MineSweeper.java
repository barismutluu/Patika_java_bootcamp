import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    /*MineSweeper sınıfı içerisinde kullanılacak değişkenler tanımlandı.*/
    int rowNumber, colNumber, size;
    String[][] adminMap;
    String[][] userMap;
    char[][] board;
    int areaCount, bombCount = 0;
    Random random = new Random();
    Scanner input = new Scanner(System.in);

    /*Sınıf içerisinde yapıcı metotları çağırdığımız kod blogu*/
    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.adminMap = new String[rowNumber][colNumber];
        this.userMap = new String[rowNumber][colNumber];
        this.board = new char[rowNumber][colNumber];
        this.size = rowNumber * colNumber;
    }

    /*Programı çalıştırabilmek için diğer metotların çağırıldı methot tanımlandı. */
    public void run() {
        System.out.println("Mayınların Konumu");
        bombGame();
        System.out.println("=======================================================");
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        gameMap();
        bombCount = 0;
    }

    /*Kullanıcından alınan değerler çapılıp 4'te biri kadar mayın rasgele yerleştirildiği ve mayınların yerlerini gösterilmesini sağlayan kod blogu */
    public void bombGame() {
        int randRow, randCol, count = 0;
        for (int i = 0; i < adminMap.length; i++) {
            for (int j = 0; j < adminMap[0].length; j++) {
                adminMap[i][j] = "-";
            }
        }
        while (count != (size / 4)) {
            randRow = random.nextInt(rowNumber);
            randCol = random.nextInt(colNumber);
            if (adminMap[randRow][randCol] != ("*")) {
                adminMap[randRow][randCol] = "*";
                count++;
            }
        }
        for (int i = 0; i < adminMap.length; i++) {
            for (int j = 0; j < adminMap[0].length; j++) {
                System.out.print(adminMap[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    /*Kullanıcının açtırmış olduğu hücrenin etrafındaki mayınları sayıp açılan hücre içerisine yazılmasını sağlayan kod bloğu*/
    public void check(int row, int column) {
        if (userMap[row][column].equals("-")) {
            if ((column < colNumber - 1) && (adminMap[row][column + 1].equals("*"))) {
                bombCount++;

            }
            if ((row < rowNumber - 1) && (adminMap[row + 1][column].equals("*"))) {
                bombCount++;
            }
            if ((row > 0) && (adminMap[row - 1][column].equals("*"))) {
                bombCount++;
            }
            if ((column > 0) && (adminMap[row][column - 1].equals("*"))) {
                bombCount++;
            }
            if ((row < rowNumber - 1) && (column < colNumber - 1) && (adminMap[row + 1][column + 1].equals("*"))) {
                bombCount++;
            }
            if ((column > 0) && (row < rowNumber - 1) && (adminMap[row + 1][column - 1].equals("*"))) {
                bombCount++;
            }
            if ((row > 0) && (column > 0) && (adminMap[row - 1][column - 1].equals("*"))) {
                bombCount++;
            }
            if ((row > 0) && (row < rowNumber - 1) && (column < colNumber - 1) && (adminMap[row - 1][column + 1].equals("*"))) {
                bombCount++;
            }
            userMap[row][column] = String.valueOf(bombCount);
            bombCount -= bombCount;

        }

    }

    //Kullanıcının oynamış olduğu mayın tarkası haritasını gösteren ve açılmasını istediği hücreyi soran kod blogu.
    //bu kod blogunda oyun alanı dışında bir değer girilmesini engelliyor. Daha önce girilmiş değerleri tekrar girilmemesi için ekrana uyarı veren
    //ve oyun bittiğinde yerniden oynanılması istenirse oyunu yeniden başlatan kod blogudur.
    public void gameMap() {
        areaCount = size - (size / 4);

        for (int i = 0; i < userMap.length; i++) {
            for (int j = 0; j < userMap[0].length; j++) {
                userMap[i][j] = "-";
                System.out.print(userMap[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        while (true) {
            System.out.print("Satır Giriniz : ");
            int callRow = input.nextInt();
            System.out.print("Sutün Giriniz : ");
            int callCol = input.nextInt();
            if (callRow <= rowNumber - 1 && callCol <= colNumber - 1) {
                if (adminMap[callRow][callCol].equals("*")) {
                    System.out.println("Game Over !!");
                    System.out.println("=======================================================");
                    int select;
                    do {
                        System.out.print("Yeniden oynamak istermisin ?\n 1. Evet\n 2. Hayır\n Seçiminiz : ");
                        select = input.nextInt();
                        if (select != 1 && select != 2) {
                            System.out.println("Hatalı seçim yaptınız.");
                        }
                        if (select == 1) {
                            run();
                        }
                        if (select == 2) {
                            System.out.println("Görüşürüz !!");

                        }
                    } while (select != 1 && select != 2);
                    break;
                }
                if (userMap[callRow][callCol].equals("-")) {
                    check(callRow, callCol);
                    areaCount--;
                } else {
                    System.out.println("Kordinatı daha önce girdiniz !");
                    continue;
                }

                if (areaCount == 0) {
                    System.out.println("Oyunu Kazandınız !");
                    break;
                }

            } else {
                System.out.println("Girdi diziden büyük olamaz !");

            }
            for (int i = 0; i < userMap.length; i++) {
                for (int j = 0; j < userMap[0].length; j++) {
                    System.out.print(userMap[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}

