import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        String pattern = "[-+]?[\\d]+([\\d]+)?";

        enterNumbers();
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split("\\s");
        int a, b;

        if (str.length == 2 && (str[0] + str[1]).matches(pattern)) {

            a = Integer.valueOf(str[0]);
            b = Integer.valueOf(str[1]);

            System.out.println("1-ое число - "+ a + "\n2-ое число - "+ b);

            System.out.println("сумма двух чисел = " + sum(a, b));
            System.out.println("разность двух чисел = " + subtraction(a, b));
            System.out.println("НОК = " + gcd(a, b));
            System.out.println("НОД = " + lcm(a, b));

        } else {
            System.out.println("введены не корректные данные");
        }
        in.close();
    }


    private static void enterNumbers() {
        System.out.println("Введите 2 целых числа через пробел и нажмите enter");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a-b;
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}
