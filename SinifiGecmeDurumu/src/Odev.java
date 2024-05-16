import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        //Değişkenler tanımlandı
        int mat, fizik, turkce, kimya, muzik;

        // Kullanıcıdan değer alındı
        Scanner inp = new Scanner(System.in);

        System.out.print("Matametik Notunuz :");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = inp.nextInt();

        System.out.print("Türkçe Notunuz :");
        turkce = inp.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = inp.nextInt();

        System.out.print("Müzik Notunuz :");
        muzik = inp.nextInt();

        if (mat<0 ||fizik<0||turkce<0||kimya<0||muzik<0||mat>100 ||fizik>100||turkce>100||kimya>100||muzik>100 ) {
            System.out.println("Hatalı not ortalaması girildi.");
        return;
        }

        double avarage=(mat+fizik+turkce+kimya+muzik)/5;
        if (avarage<=55){
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");

        }else {
            System.out.println("Tebrikler, Sınıf geçtiniz !");
        }

        System.out.println("Ortalamanız : "+ avarage);

    }
    }
