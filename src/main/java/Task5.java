import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        System.out.println("Введите предложение, нажмите enter");
        Scanner text = new Scanner(System.in);
        List<String> list = Arrays.asList(text.nextLine().split("[,]*\\s"));

        System.out.println("Введите искомое слово, нажмите enter");
        Scanner inWord = new Scanner(System.in);
        String word = inWord.nextLine();
        System.out.println(word);

        int count = 0;
        for (String words : list) {
            if (words.equalsIgnoreCase(word)){
                count++;
            }
        }
        System.out.println("Слово <" + word + "> используется " + count + " раз");
        text.close();
        inWord.close();
    }
}
