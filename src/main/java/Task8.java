import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        System.out.println("Введити длину последовательности, но не более 100, нажмите enter");
        Scanner in = new Scanner(System.in);
        int length = Integer.valueOf(in.nextLine());

        if (length <= 100) {
            int[] array = new int[length];
            for (int anArray : array) {
                if (isPalindrome(anArray)) {
                    System.out.println(anArray);
                }
            }
        } else {
            System.out.println("Превышена длина последовательности");
        }
    }

    public static boolean isPalindrome(Integer number) {

        String str = String.valueOf(number);
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse) & reverse.length() > 1;
    }
}
