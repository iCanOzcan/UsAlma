import java.util.Scanner;
public class Power {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("ussu alınacak sayiyi giriniz :");
        int a =input.nextInt();
        System.out.print("us olacak sayiyi giriniz :");
        int b =input.nextInt();
        int total =1;
        for(int i =1; i<=b; i++){
            total*=a;
        }
        System.out.println("a^b="+total);
    }
}
