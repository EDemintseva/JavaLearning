import java.util.Random;

/**
 * @author Ekaterina Demintseva
 * В классе MinMaxOfArray реализован поиск максимального отрицательного и минимального положительного значений массива и замена их местами.
 */

public class MinMaxOfArray {
    public static void main(String[] args) {
        //Создание массива
        int arr[] = new int[20];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20) - 10;
        }
        //Вывод массива до изменений
        System.out.println("Array before changes:");
        for (int values : arr) System.out.print(values + " ");
        //Поиск максимального отрицательного и минимального положительного значений массива
        int maxElement = -10;
        int minElement = 10;
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && arr[i] > maxElement) {
                maxElement = arr[i];
                indexMax = i;
            } else if (arr[i] >= 0 && arr[i] < minElement) {
                minElement = arr[i];
                indexMin = i;
            }
        }
        //Замена элементов массива
        int temp = arr[indexMax];
        arr[indexMax] = arr[indexMin];
        arr[indexMin] = temp;
        //Вывод массива после изменений
        System.out.println("\r\nArray after changes:");
        for (int values : arr) System.out.print(values + " ");
        //Вывод максимального отрицательного и минимального положительного значений массива
        System.out.println("\r\nMax negative element of array: " + maxElement + " Index: " + indexMax);
        System.out.println("Min positive element of array: " + minElement + " Index: " + indexMin);
    }
}