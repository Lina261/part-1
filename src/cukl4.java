import java.math.BigInteger;

public class cukl4 {
    static void run() {

        BigInteger sum = BigInteger.ONE;

        for(int i = 1; i < 200; i++) {
            sum = sum.multiply(BigInteger.valueOf(i*i));
        }

        System.out.println(sum);


    }

}
