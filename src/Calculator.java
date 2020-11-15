public class Calculator {
    public static void main(String[] args) {
        calculate(10, 15, 20);
    }
    static void calculate(int a, int b, int c){
        System.out.println(div(a));
        System.out.println(div(b));
        System.out.println(div(c));
    }
    static int div(int a){
        return a/5;
    }
}
