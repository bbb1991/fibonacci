import java.util.Scanner;
import java.util.InputMismatchException;

public class FibonacciNumber {

    static int fibonacci(int n) {
        return (n <= 2 ? 1 : fibonacci(n - 1) + fibonacci(n - 2));
    }


    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество цифр, которую нужно вывести:");


        try {
            int max = scanner.nextInt();

            for (int n = 1; n <= max; n++) {
                System.out.print(fibonacci(n)+", ");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Введите целое число!");
        }
    }
}
