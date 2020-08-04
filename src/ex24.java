import java.util.Scanner;

public class ex24 {
           static void run() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите стороны кирпича");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
               System.out.println("Введите стороны отверстия");
               int d = sc.nextInt();
               int l = sc.nextInt();
               if( ((b <= d) && (k <= l)) || ((a <= d) && (k <= l)) || ((a <= d) && ( b <= l))){
                   System.out.println("Кирпич вошел в отверстие");
               }
               else{
                   System.out.println("Кирпич слишком большой");
               }
           }


}
