import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        int i, j;
        Random r = new Random();
        i = 1 + r.nextInt(6);
        j = 1 + r.nextInt(6);
        System.out.println("Rolling the dice...");
        System.out.println("Die 1:" + i);
        System.out.println("Die 2:" + j);
        System.out.println(i + j);
    }
}