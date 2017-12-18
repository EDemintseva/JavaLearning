import java.util.Random;

/**
 * @author Ekaterina Demintseva
 * В классе MinMaxOfArray реализован поиск максимального и минимального значений массива.
 */

public class MinMaxOfArray {
    public static void main(String[] args) {
        //Создание массива
        int arr[] = new int[20];
        Random random = new Random ();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20) - 10;
        }
        int maxElement = -10;
        int minElement = 10;
        //Поиск максимального и минимального значений массива
        for (int values: arr) {
            if (values > maxElement)
                maxElement = values;
            else if (values < minElement)
                minElement = values;
        }
        for (int values: arr) System.out.print(values+" ");
        System.out.println("\r\nMax element of array " + maxElement);
        System.out.println("Min element of array " + minElement);
    }
}