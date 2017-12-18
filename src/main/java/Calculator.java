import java.util.Scanner;

/**
 * @author Ekaterina Demintseva
 * В классе Calculator реализовано сложение дробных чисел, которые пользователь вводит в консоль.
 */

public class Calculator {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        //Ввод первого слагаемого
        System.out.println("Enter the first number: ");
        float firstNumber = scanner.nextFloat();
        //Ввод второго слагаемого
        System.out.println("Enter the second number: ");
        float secondNumber = scanner.nextFloat();
        //Вывод результата
        float result = firstNumber + secondNumber;
        System.out.printf("Sum is: %.4f", result);
        scanner.close();
    }
}