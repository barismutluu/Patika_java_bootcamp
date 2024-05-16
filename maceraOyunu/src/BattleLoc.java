import java.util.Random;

public class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;

    public BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacleNumber();

        System.out.println("Şuan buradasınız : " + this.getName());
        System.out.println("Dikkat Ol! Burada " + obsNumber + " tane " + this.getObstacle().getName() + " yaşıyor !");
        System.out.print("<S>avaş veya <K>aç : ");
        String selectCase = input.nextLine();
        selectCase = selectCase.toUpperCase();
        if (selectCase.equals("S") && combat(obsNumber)) {

            System.out.println(this.getName() + " tüm düşmanları yendiniz !");
            awardMethod();
            return true;

        }
        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("Öldünüz !");
            return false;
        }
        return true;
    }

    private void awardMethod() {
        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(56);
        int num3 = random.nextInt(101);
        if (getObstacle().getName().equalsIgnoreCase("yılan")) {
            getObstacle().setMoney(10);

        }
        while (num1 < 55) {
            //Para Kazanma ihtimali
            if (num2 < 25) {
                if (this.award.equalsIgnoreCase("Supriz") && num3 < 20) {
                    getObstacle().setMoney(10);
                    getPlayer().setMoney(getObstacle().getMoney() + getPlayer().getMoney());
                    break;
                } else if (this.award.equalsIgnoreCase("Supriz") && num3 < 50) {
                    getObstacle().setMoney(5);
                    getPlayer().setMoney(getObstacle().getMoney() + getPlayer().getMoney());
                    break;
                } else if (this.award.equalsIgnoreCase("Supriz") && num3 < 100) {
                    getObstacle().setMoney(1);
                    getPlayer().setMoney(getObstacle().getMoney() + getPlayer().getMoney());
                    break;
                }
                //Zırh kazanma ihtimali
            } else if (num2 < 40) {
                if (this.award.equalsIgnoreCase("Supriz") && num3 < 20) {
                    getPlayer().getInventory().setArmor(Armor.getArmorObjByID(1));
                    System.out.println(getPlayer().getInventory().getArmor().getName());
                    break;
                } else if (this.award.equalsIgnoreCase("Supriz") && num3 < 50) {
                    getPlayer().getInventory().setArmor(Armor.getArmorObjByID(2));
                    System.out.println(getPlayer().getInventory().getArmor().getName());
                    break;
                } else if (this.award.equalsIgnoreCase("Supriz") && num3 < 100) {
                    getPlayer().getInventory().setArmor(Armor.getArmorObjByID(3));
                    System.out.println(getPlayer().getInventory().getArmor().getName());
                    break;
                }
            }
            //Silah kazanma ihtimali
            else if (num2 < 55) {
                if (this.award.equalsIgnoreCase("Supriz") && num3 < 20) {
                    getPlayer().getInventory().setWeapon(Weapon.getWeaponObjByID(1));
                    System.out.println(getPlayer().getInventory().getWeapon().getName());
                    break;
                } else if (this.award.equalsIgnoreCase("Supriz") && num3 < 50) {
                    getPlayer().getInventory().setWeapon(Weapon.getWeaponObjByID(2));
                    System.out.println(getPlayer().getInventory().getWeapon().getName());
                    break;
                } else if (this.award.equalsIgnoreCase("Supriz") && num3 < 100) {
                    getPlayer().getInventory().setWeapon(Weapon.getWeaponObjByID(3));
                    System.out.println(getPlayer().getInventory().getWeapon().getName());
                    break;
                }
            } else {
                System.out.println("Birşey kazanamadınız. ");
            }
        }

        if (this.award.equalsIgnoreCase("food") && this.getPlayer().getInventory().isFood() == false) {
            System.out.println(this.award + " kazandınız.");
            getPlayer().getInventory().setFood(true);
        } else if (this.award.equalsIgnoreCase("water") && this.getPlayer().getInventory().isWater() == false) {
            System.out.println(this.award + " kazandınız.");
            getPlayer().getInventory().setWater(true);
        } else if (this.award.equalsIgnoreCase("firewood") && this.getPlayer().getInventory().isFirewood() == false) {
            System.out.println(this.award + " kazandınız.");
            getPlayer().getInventory().setFirewood(true);
        }
    }

    public boolean combat(int obsNumber) {
        for (int i = 1; i <= obsNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOrjinalHealth());
            playerStats();
            obstacleStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                System.out.print("<V>ur veya <K>aç : ");
                String selectCombat = input.nextLine().toUpperCase();
                System.out.println();
                if (selectCombat.equals("V")) {
                    int randomValue = (int) (Math.random() * 2) + 1;
                    if (randomValue == 1) {
                        System.out.println("Siz vurdunuz !");
                        this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();
                        if (this.getObstacle().getHealth() > 0) {
                            System.out.println();
                            System.out.println("Canavar Size Vurdu !");
                            int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                            if (obstacleDamage < 0) {
                                obstacleDamage = 0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                            afterHit();
                        }
                    } else if (randomValue == 2) {
                        if (this.getObstacle().getHealth() > 0) {
                            System.out.println("Canavar Size Vurdu !");
                            int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                            if (obstacleDamage < 0) {
                                obstacleDamage = 0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                            afterHit();
                            System.out.println("Siz vurdunuz !");
                            this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                            afterHit();
                        }
                    }
                } else {
                    return false;
                }
            }
            if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
                System.out.println("Düşmanı Yendiniz ! ");
                System.out.println(this.getObstacle().getAward() + " para kazandınız !");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                System.out.println("Güncel Paranız : " + this.getPlayer().getMoney());
            } else {
                return false;
            }
        }
        return true;
    }

    private void afterHit() {
        System.out.println("Canınız : " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " Canı : " + this.getObstacle().getHealth());
        System.out.println();
    }


    private void playerStats() {
        System.out.println("Oyuncu Değerleri");
        System.out.println("-------------------------------------------");
        System.out.println("Sağlık : " + this.getPlayer().getHealth());
        System.out.println("Silah : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
        System.out.println("Zırh : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Blokalama : " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Para : " + this.getPlayer().getMoney());

    }

    private void obstacleStats(int i) {
        System.out.println(i + ". " + this.getObstacle().getName() + " Değerleri");
        System.out.println("-------------------------------------------");
        System.out.println("Sağlık : " + this.getObstacle().getHealth());
        System.out.println("Hasar : " + this.getObstacle().getDamage());
        System.out.println("Ödül : " + this.getObstacle().getAward());
    }

    public int randomObstacleNumber() {
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
