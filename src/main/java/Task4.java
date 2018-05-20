import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        System.out.println("Введите предложение, нажмите enter");
        Scanner in = new Scanner(System.in);

        List<String> list = Arrays.asList(in.nextLine().split("[,]*\\s"));
        System.out.println("Количество слов - " + String.valueOf(list.size())+"\n");
        list.sort(String::compareToIgnoreCase);

        for (String words : list) {
            System.out.println(words);
        }
        in.close();
    }
}
