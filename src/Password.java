import java.util.Random;

public class Password {
    public static int genRandom() {
        Random rand = new Random();
        int n = rand.nextInt(90000) + 10000;
        return n;
    }

}
