import java.util.Scanner;

public class cukl7{
    static void run(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Введите промежуток m-n");
    int m= sc.nextInt();
    int n= sc.nextInt();
for(int a=m; a<n;a++){
    System.out.println("Делители числа "+a);
    int k=0;
    for(int i=2;i<a;i++){
        if(a%i==0){
            System.out.println(i);
            k=1;}
            }
    if(k==0){
        System.out.println("У числа "+a+" нет делителей кроме 1 и "+a);
    }

}
    }

}
