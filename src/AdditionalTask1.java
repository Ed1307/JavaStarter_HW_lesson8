import java.util.Scanner;

public class AdditionalTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = input.nextInt();
        System.out.println(sumNumbers(number));
    }
    static int sumNumbers(int a){
        if(a<10){
            return a;
        }
        int b = a/10*10;
        int c = a - b;
        return c + sumNumbers(b/10);
    }
}
