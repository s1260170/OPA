import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class hellowname {
    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("What is your name?");
        System.out.print(">");
        String str = null;
        try {
            str = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Hellow," + str);
        int i, j, k;
        Random r = new Random();
        for (k = 0; k < 3; k++) {
            i = 1 + r.nextInt(6);
            j = 1 + r.nextInt(6);
            System.out.println("Rolling the dice...");
            System.out.println("Die 1:" + i);
            System.out.println("Die 2:" + j);
            System.out.println("total value: " + (i + j));
            if ((i + j) > 7) {
                System.out.println(str + " win");
            } else {
                System.out.println(str + " lose");
            }
        }
    }
}
