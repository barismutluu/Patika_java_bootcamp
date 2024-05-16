public class Main {
    public static void main(String[] args) {

        //2,3,5,7 sayıları asal olduğu için ekrana yazdırıyor.
        System.out.print("2 3 5 7 ");

        //2-100 arasından tüm asıları tespit etmesi için 2,3,5,7 olarak modlarını alıyor.
        for(int i =2;i<=100;i++){
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0){
                System.out.print(i+" ");
            }
        }
    }
}
