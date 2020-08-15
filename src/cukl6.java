import java.util.Scanner;

public class cukl6 {
    static void run() {
        for(int a = 1; a<127; a++) {
            String str = Integer.toOctalString(a);
            int dec = Integer.parseInt(str, 8);
            System.out.println("Знак ASCII будет " +  (char) dec);
        }
}}

