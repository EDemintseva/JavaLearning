package calculatorOOP;

import java.util.Scanner;

import static calculatorOOP.operations.Operations.*;

public class CalculatorOOP {
    public static void main(String[] args){
        Float result = 0.0f;
        String resultType = "";
        Scanner scanner = new Scanner (System.in);
        //Ввод первого числа
        System.out.println("Enter the first number: ");
        float firstNumber = scanner.nextFloat();
        //Ввод второго числа
        System.out.println("Enter the second number: ");
        float secondNumber = scanner.nextFloat();
        //Ввод операции
        System.out.println("Choose an operation: ");
        String mathOperation = scanner.next();
        switch (mathOperation) {
            case "+":
                result = sum(firstNumber, secondNumber);
                resultType = "Sum";
                break;
            case "-":
                result = sub(firstNumber, secondNumber);
                resultType = "Difference";
                break;
            case "*":
                result = mult(firstNumber, secondNumber);
                resultType = "Product";
                break;
            case "/":
                result = div(firstNumber, secondNumber);
                resultType = "Quotient";
                break;
            default:
                System.out.println("Invalid operation");
        }
        System.out.printf(resultType + " is: %.4f", result);
        scanner.close();
    }
}
