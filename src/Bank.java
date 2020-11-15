import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ваш долг составляет: ");
        int credit = input.nextInt();

        System.out.println("Ваш долг составляет: " + credit);

        pay(credit);
    }
    static void pay(int credit){
        System.out.println("Вы хотите внести: ");
        Scanner input = new Scanner(System.in);
        int sum = input.nextInt();
        if(sum==credit){
            System.out.println("Ваш долг составляет: " + credit);
            System.out.println("Вы хотите внести: " + sum);
            System.out.println("Кредит погашен");
        }
        else if(sum>credit){
            System.out.println("Ваш долг составляет: " + credit);
            System.out.println("Вы хотите внести: " + sum);
            System.out.println("Кредит погашен. на счету осталось " + (sum - credit));
        }
        else{
            System.out.println("Ваш долг составляет: " + credit);
            System.out.println("Вы хотите внести: " + sum);
            credit -= sum;
            System.out.println("Сума долга составляет: " + credit);
            pay(credit);
        }
    }
}
