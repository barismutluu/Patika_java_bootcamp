public class Employee {
    // değişkenler tanımlanmıştır.
    String name;
    double salary;
    int workHours;
    int hireYear;

    //Constructor yapısı oluşturuldu.
    public Employee(String name, Double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    //Maaş hesaplama fonksiyonu yazıldı.
    public double raiseSalary() {
        int nowYear = 2021;
        double experience = nowYear - hireYear;
        if (experience == 0 || experience < 10) {
            return this.salary * 0.05;
        }
        if (experience > 9 && experience < 20) {
            return this.salary * 0.10;

        } else {
            return this.salary * 0.15;

        }
    }

    // Bonus hesaplama fonksiyonu yazıldı.
    public double bonus() {

        if (workHours > 40) {
            double bonus = (workHours - 40) * 30;
            return bonus;
        }
        return 0.0;

    }

    //Vergi hesaplama fonksiyonu yazıldı
    public double tax() {
        if (salary <= 1000) {
            return 0.0;
        } else {
            double tax = salary * 0.03;
            return tax;
        }
    }

    //Ekrana yazdırma fonksiyonu yazıldı.
    public void printScore() {
        System.out.println("Adı :" + this.name);
        System.out.println("Maaşı :" + this.salary);
        System.out.println("Çalışma Saati :" + this.workHours);
        System.out.println("Başlangıç Yılı :" + this.hireYear);
        System.out.println("Vergi :" + tax());
        System.out.println("Bonus :" + bonus());
        System.out.println("Maaş Artışı :" + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :" + (this.salary + bonus() - tax()));
        System.out.println("Toplam Maaş :" + (this.salary + bonus() - tax() + raiseSalary()));

    }
}