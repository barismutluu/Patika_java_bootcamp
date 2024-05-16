import java.util.Random;

public class Snake extends Obstacle{

    public Snake() {
        super(4, "Yılan",getRandomValue(), 12, 0);
    }

    private static int getRandomValue(){
        Random random = new Random();
        return random.nextInt(4) + 3; // 3 ile 6 arasında rastgele bir değer

    }
}
