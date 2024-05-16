import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
    //Değişkenler tanımlandı
    int month, day;
    String burc = "";
    boolean isError = false;

    // Kullanıcıdan değer alındı
    Scanner inp = new Scanner(System.in);

        System.out.print("Doğduğunuz ay :");
    month = inp.nextInt();

        System.out.print("Doğduğunuz gün :");
    day = inp.nextInt();

    if (month==1){
        String mesaj = (day < 22 && month==1) ? "Oğlak" : "Kova";
        System.out.println("Burcunuz : "+mesaj);
    }else if (month==2){
        String mesaj = (day < 20 && month==2) ? "Kova" : "Balık";
        System.out.println("Burcunuz : "+mesaj);
    }else if (month==3){
        String mesaj = (day < 21 && month==3) ? "Balık" : "Koç";
        System.out.println("Burcunuz : "+mesaj);
    }else if (month==4){
        String mesaj = (day < 21 && month==4) ? "Koç" : "Boğa";
        System.out.println("Burcunuz : "+mesaj);
    }else if (month==5){
        String mesaj = (day < 22 && month==5) ? "Boğa" : "İkizler";
        System.out.println("Burcunuz : "+mesaj);
    }else if (month==6){
        String mesaj = (day < 23 && month==6) ? "İkizler" : " Yengeç";
        System.out.println("Burcunuz : "+mesaj);
    }else if (month==7){
        String mesaj = (day < 23 && month==7) ? "Yengeç" : " Aslan";
        System.out.println("Burcunuz : "+mesaj);
    }else if (month==8){
        String mesaj = (day < 23 && month==8) ? "Aslan" : " Başak";
        System.out.println("Burcunuz : "+mesaj);
    }else if (month==9){
        String mesaj = (day < 23 && month==9) ? "Başak" : " Terazi";
        System.out.println("Burcunuz : "+mesaj);
    }else if (month==10){
        String mesaj = (day < 23 && month==10) ? "Terazi" : " Akrep";
        System.out.println("Burcunuz : "+mesaj);
    }else if (month==11){
        String mesaj = (day < 22 && month==11) ? "Akrep" : " Yay";
        System.out.println("Burcunuz : "+mesaj);
    }else if (month==12){
        String mesaj = (day < 22 && month==12) ? "Yay" : " Oğlak.";
        System.out.println("Burcunuz : "+mesaj);
    }















}
}
