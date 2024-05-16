import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Macera Oyununa Hoşgeldiniz !");
        System.out.println("Lütfen bir isim giriniz : ");
        //String playerName = input.nextLine();
        Player player = new Player("Barış");
        System.out.println("Sayın " + player.getName() + " bu karanlık ve sisli adaya hoşgeldiniz ! ");
        System.out.println("Burda yaşananların hepsi gerçek !");
        System.out.println("Lütfen bir karakter seçiniz !");
        player.selectChar();
        Location location = null;
        while (true) {
            player.printInfo();
            System.out.println();
            System.out.println("############################### Bölgeler ###############################");
            System.out.println();
            System.out.println("1 - Güvenli Ev ---> Burası sizin için güvenli bir ev, düşman yoktur !");
            System.out.println("2 - Eşya Dükkanı ---> Silah veya Zırh satın alabilirsiniz ! ");
            System.out.println("3 - Mağara ---> Ödül <Yemek> , Dikkatli ol karşına zombi çıkabilir ! ");
            System.out.println("4 - Orman ---> Ödül <Odun> , Dikkatli ol karşına vampir çıkabilir ! ");
            System.out.println("5 - Nehir ---> Ödül <Su> , Dikkatli ol karşına ayı çıkabilir ! ");
            System.out.println("6 - Maden ---> Ödül <Para, Silah veya Zırh> , Dikkatli ol karşına yılan çıkabilir ! ");
            System.out.println("0 - Çıkış Yap ---> Oyunu Sonlandır. ");
            System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz : ");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                case 6:
                    location = new Mining(player);
                    break;
                default:
                    System.out.println("Lütfen geçerli bir bölge giriniz !");
            }

            if (selectLoc == 3 && new Cave(player).getPlayer().getInventory().isFood()) {
                System.out.println("Bölge Temizlendi. Düşman yok ");
                continue;
            }
            if (selectLoc == 4 && new Forest(player).getPlayer().getInventory().isFirewood()) {
                System.out.println("Bölge Temizlendi. Düşman yok ");
                continue;
            }
            if (selectLoc == 5 && new River(player).getPlayer().getInventory().isWater()) {
                System.out.println("Bölge Temizlendi. Düşman yok ");
                continue;
            }

            if (new SafeHouse(player).finish()){
                break;
            }

            if (location == null) {
                System.out.println("Bu karanlık ve sisli adadan çabuk vazgeçtin !");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("GAME OVER!");
                break;
            }
        }

    }
}
