package calculatorOOP;

import java.util.InputMismatchException;
import java.util.Scanner;

import calculatorOOP.operations.Operations;
import calculatorOOP.operations.UnknownOperation;

public class CalculatorOOP {
    public static void main(String[] args){

        try {
            Float result;
            Scanner scanner = new Scanner(System.in);
            Operations calc = new Operations();

            //Ввод первого числа
            System.out.println("Enter the first number: ");
            calc.setVar1(scanner.nextFloat());
            //Ввод второго числа
            System.out.println("Enter the second number: ");
            calc.setVar2(scanner.nextFloat());
            //Ввод операции
            System.out.println("Choose an operation: ");
            result = calc.operation(scanner.next());
            scanner.close();
            System.out.printf(calc.getResultType() + " is: %.4f", result);
        }catch(InputMismatchException e){
            System.out.println("Not a number exception: " + e);
        }catch(UnknownOperation e){
            System.out.println("Invalid operation: " + e.getOperation());
        }
    }
}
