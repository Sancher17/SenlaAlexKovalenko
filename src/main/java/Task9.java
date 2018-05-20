import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        System.out.println("Введити длину последовательности, нажмите enter");
        Scanner in = new Scanner(System.in);
        int length = Integer.valueOf(in.nextLine());

//        List <Integer> list = Arrays.asList(3, 22, 55, 47, 101, 404, 75); //for test
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;

        if (list.size() >= length) {
            for (int i = 0; i < length; i++) {
                if (list.get(i) % 2 == 0) {
                    sum += list.get(i);
                    System.out.print(list.get(i) + " ");
                }
            }
            System.out.println("\nСумма четных чисел: " + sum);
        }else{
            System.out.println("Длина последовательности короче ввиденного числа");
        }
    }
}

