import java.util.Scanner;

public class cukl8 {
    static void run(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите два числа");
        int m= sc.nextInt();
        int n= sc.nextInt();
        String c= Integer.toString(m);
        String d= Integer.toString(n);
        char k='a';
        int o=0;
        for(int i=0;i<c.length();i++){
            for(int j=0;j<d.length();j++){
            if((c.charAt(i)==d.charAt(j)&&(c.charAt(i)!=k)))
            {

                k = c.charAt(i);
                 o=1;
                System.out.println("У чисел совпадает цифра "+c.charAt(i));
            }

        }
}
        if(o==0){
            System.out.println("У чисел нет совпадающих цифр");
        }
}}
