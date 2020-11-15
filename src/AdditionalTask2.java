import java.util.Scanner;

public class AdditionalTask2 {
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
        int b = a;
        while(b>=10){
            b/=10;
        }
        int c = b;
        do {
            c *= 10;
        }
        while((a / 10) > c);
        return b + (sumNumbers((a-c)))*10;
    }
}
