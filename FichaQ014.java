import java.util.Scanner;

public class FichaQ014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira um numero inteiro!");
        int num1 = in.nextInt();
        System.out.println("Insira outro numero inteiro!");
        int num2 = in.nextInt();

        if (num1 > num2){
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }

    }
}
