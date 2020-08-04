import java.util.Scanner;

public class ex22 {
    static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a b c d");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(max(min(a,b),min(c,d)));


    }
    static int min(int x, int y){
        if (x>y){
            return(y);
        }
        else{
            return(x);
        }

    }
    static int max(int x, int y){
        if (x>y){
            return(x);
        }
        else{
            return(y);
        }

    }

}
