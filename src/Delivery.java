import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Количество клиентов: ");
        int clients = input.nextInt();
        System.out.println(factorial(clients));
    }
    static int factorial(int a){ //не рекомендуется использовать рекурсию из-за перегрузки оперативной памяти
        if (a==0){
            return 1;
        }
        return a * factorial(a-1);
    }
}
