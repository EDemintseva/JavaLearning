import java.util.Scanner;

/**
 * @author Ekaterina Demintseva
 * В классе CalculatorAndArray реализованы простые операции калькулятора и поиск самого длинного элемента массива.
 */

public class CalculatorAndArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Выбор режима работы программы
        System.out.println("Enter 1 - Calculator or 2 - Array");
        int operation = scanner.nextInt();
        if (1 == operation) {
            calculator();
        } else if (2 == operation){
            myArray();
        } else {
            System.out.println("Invalid operation");
        }
        scanner.close();
    }
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        //Ввод первого числа
        System.out.println("Enter the first number: ");
        float firstNumber = scanner.nextFloat();
        //Ввод второго числа
        System.out.println("Enter the second number: ");
        float secondNumber = scanner.nextFloat();
        //Выбор операции и вывод результата
        System.out.println("Enter the operation to execute (+, -, * or /): ");
        String mathOperation = scanner.next();
        switch (mathOperation) {
            case "+":
                System.out.printf("Sum is: %.4f", firstNumber + secondNumber);
                break;
            case "-":
                System.out.printf("Difference is: %.4f", firstNumber - secondNumber);
                break;
            case "*":
                System.out.printf("Product is: %.4f", firstNumber * secondNumber);
                break;
            case "/":
                System.out.printf("Quotient is: %.4f", firstNumber / secondNumber);
                break;
            default:
                System.out.println("Invalid operation");
        }
        scanner.close();
    }
    public static void myArray() {
        //Ввод длины массива
        System.out.println("Enter length of array:");
        Scanner scanner = new Scanner(System.in);
        String arr[] = new String [scanner.nextInt()];
        //Ввод элементов массива
        System.out.println("Enter elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next();
        }
        String lWord = "";
        //Поиск самого длинного элемента массива
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > lWord.length())
                lWord = arr[i];
        }
        System.out.println("Element with max length is " + lWord);
        scanner.close();
    }
}