public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Güvenli Evdesiniz ! ");
        System.out.println("Canınız yenilendi ! ");
        this.getPlayer().setHealth(this.getPlayer().getOrjinalHealth());
        return true;
    }
    //Bölgedeki düşmanlar temizlenirse oyun kazanılıyor
    public boolean finish(){
        if (this.getPlayer().getInventory().isFood()&&this.getPlayer().getInventory().isWater()&&this.getPlayer().getInventory().isFirewood()){
            System.out.println("Tebrikler oyunu bitirdiniz.");
            return true;
        }
        return false;
    }
}
