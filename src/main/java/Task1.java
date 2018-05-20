import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        enterNumber();
        Scanner in = new Scanner(System.in);
        String pattern = "[-+]?[\\d]+([\\d]+)?";

//        while (!in.hasNext(pattern)) {
//            System.out.println("Не корректные данные");
//            enterNumber();
//            in = new Scanner(System.in);
//
        while (!in.hasNext(pattern)) {
            System.out.println("Не корректные данные");
            enterNumber();
            in = new Scanner(System.in);
        }

        Integer input = Integer.valueOf(in.nextLine());

        if (isEven(input)){
            System.out.print(input + " - целое, четное,");
        }else {
            System.out.print(input + " - целое, не четное,");
        }


        if (isPrime(input)){
            System.out.println(" простое число");
        } else {
            System.out.println(" составное число");
        }

        in.close();
    }

    private static void enterNumber() {
        System.out.println("Введите целое число, нажмите enter");
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static boolean isPrime(int a) {

        for (int i = 2; i < a; i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
}
