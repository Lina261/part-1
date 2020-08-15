import java.util.Scanner;

public class cukl2 {
    static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите зачение а");
        double a = sc.nextDouble();
        System.out.println("Введите зачение b");
        double b = sc.nextDouble();
        System.out.println("Введите зачение h");
        double h = sc.nextDouble();

        for( double c=a; c<b; c=c+h ){
            if(c>2){
                System.out.println(c);
            }
            else {
                System.out.println(-c);
            }


        }


}

}
