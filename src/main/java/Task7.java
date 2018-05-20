
import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        System.out.println(" Введити длину массива не более 100, нажмите enter");
        Scanner in = new Scanner(System.in);
        int length = Integer.valueOf(in.nextLine());
        in.close();

        int array[] = new int[length];

        int min = 10;
        int max = 100;
        max -= min;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * max) + min;
        }
        Arrays.sort(array);
        System.out.println("Наименьшее число массива " + array[0]);
        System.out.println("Наибольшее число массива " + array[array.length - 1]);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
