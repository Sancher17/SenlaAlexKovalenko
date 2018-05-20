import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        System.out.println("Введити длину последовательности, нажмите enter");
        Scanner in = new Scanner(System.in);
        int length = Integer.valueOf(in.nextLine());

        int[] array = new int[length];
        int sum = 0;

        for (int anArray : array) {
            if (anArray % 2 == 0) {
                sum += anArray;
                System.out.print(anArray + ", ");
            }
        }
        System.out.println("\nСумма четных чисел: " + sum);
    }
}

