
import javax.activation.UnsupportedDataTypeException;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        String pattern = "[-+]?[\\d]+([.][\\d]+)?";

        char numbers[] = new char[3];
        Scanner in = null;

        try {
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Введите " + (i + 1) + "-ую цифру, нажмите enter");
                in = new Scanner(System.in);
                if (in.hasNext(pattern)) {
                    numbers[i] = in.nextLine().charAt(0);
                } else {
                    throw new UnsupportedDataTypeException();
                }
            }

            System.out.println("Все возможные комбинации 3-ех значных чисел");

            int increase[] = new int[3 + 1];
            increase[0] = 1;

            for (int i = 1; i <= 3; i++) {
                increase[i] = increase[i - 1] * numbers.length;
            }

            for (int i = 0; i < increase[3]; i++) {
                char temp[] = new char[3];
                for (int j = 0; j < 3; j++) {
                    temp[j] = numbers[(i / increase[j]) % numbers.length];
                }

                for (char ch : temp) {
                    System.out.print(ch);
                }
                System.out.println();
            }

        } catch (UnsupportedDataTypeException e) {
            System.out.println("Не корректные данные! \nпрограмма завершена");
        }finally {
            assert in != null;
            in.close();
        }
    }
}
