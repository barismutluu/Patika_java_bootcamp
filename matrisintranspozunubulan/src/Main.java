public class Main {
    public static void main(String[] args) {

        //Dizi değerleri tanımlandı
        int[][] array = {
                //{1, 2, 3},
               // {4, 5, 6},
                {2,3,4},
                {5,6,4},

        };

        // Matris ekrana yazılması için for oluşturuldu.
        System.out.println("Matris :");
        //satır belirlendi ve en son satıra kadar gitmesi için her döndüğünde i artmaktadır.
        for (int i = 0; i < 2; i++) {
            //sütun belirtilmiştir döngü halinde "j" artmaktadır
            for (int j = 0; j < 3; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Transpoze :");
        //sütun belirtilmiştir döngü halinde "i" artmaktadır
        for (int i = 0; i < 3; i++) {
            //satır belirlendi ve en son satıra kadar gitmesi için her döndüğünde j artmaktadır.
            for (int j = 0; j < 2; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();//new line
        }
    }
}

