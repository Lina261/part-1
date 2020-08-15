public class cukl5 {
    public static void run() {
        f(0.3);

    }

    static void f(double e) {
        double sum = 0;
        double i = 1.0;
        do {
            sum += (1/Math.pow(2.0, i) + 1/Math.pow(3.0, i));
            i++;
            System.out.println(sum);
        } while (Math.abs((1/Math.pow(2.0, i) + 1/Math.pow(3.0, i))) < e);

        System.out.println(sum);
    }

}
