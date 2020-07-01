import java.util.Scanner;

public class ex4 {
    static void run()
    {
        Scanner sc = new Scanner(System.in);
        double a= sc.nextDouble();
        String astr= Double.toString(a);
        double t = Double.parseDouble(astr.substring(4) + "."+ astr.substring(0, 3));
        System.out.println(" " + t);
    }
}
