import javax.activation.UnsupportedDataTypeException;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        String pattern = "[-+]?[\\d]+([.][\\d]+)?";
        double[] sides = new double[3];
        Scanner in = null;

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Введите " + (i + 1) + "-ую длину (погрешность 2 знака после запятой), нажмите enter");
                in = new Scanner(System.in);
                if (in.hasNext(pattern)) {
                    sides[i] = Double.valueOf(in.nextLine());
                } else {
                    throw new NumberFormatException();
                }
            }

            double a = sides[0];
            double b = sides[1];
            double c = sides[2];

            if (isTriangle(a, b, c)) {
                if (checkTriangle(a, b, c) || checkTriangle(b, a, c) || checkTriangle(c, a, b)) {
                    System.out.println("треугольник прямой");
                } else {
                    System.out.println("треугольник не прямой");
                }
            } else {
                System.out.println("Треугольник построить невозможно");
            }
        } catch (NumberFormatException e) {
            System.out.println("Не корректные данные");
        } finally {
            assert in != null;
            in.close();
        }
    }

    public static boolean checkTriangle(double a, double b, double c) {

        double hypotenuse = (Math.pow(b, 2) + Math.pow(c, 2));
        double hypotenuseRounded = Math.round(Math.sqrt(hypotenuse) * 100d) / 100d;
        return a == hypotenuseRounded;
    }

    public static boolean isTriangle(double a, double b, double c) {

        return (a + b > c & a + c > b & b + c > a);
    }
}
