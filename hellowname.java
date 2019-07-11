import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    }

}
