package racing.utils;

import java.util.Random;

public class RandomValueGenerator {

    private static Random random = new Random();

    public static int generate(int bound) {
        return random.nextInt(bound);
    }
}
