package candyShop2;

/**
 * @author Ekaterina Demintseva
 * В классе CandyShop реализован сбор подарка и вывод информации о составе, общей стоимости и общем весе.
 */

public class CandyShop {
    public static void main(String[] args) {
        //Ввод информации о сладостях
        Sweets cupcake = new Cupcake("Cupcake", 150.0f, 5.99f, "Vanilla");
        Sweets donut = new Donut("Donut", 130.8f, 4.49f, 'M');
        Sweets eclair = new Eclair("Eclair", 100.3f, 7.99f, "Chocolate");

        Sweets arr[] = {cupcake, donut, eclair};
        //Вывод видов сладостей
        for (Sweets gift : arr) {
            System.out.println(gift.toString());
        }
        //Подсчёт веса и стоимости. Вывод информации о подарке.
        float price = 0.0f;
        float weight = 0.0f;
        for (Sweets value : arr) {
            price += value.getPrice();
            weight += value.getWeight();
        }
        System.out.printf("Total price of the gift: %.2f", price);
        System.out.printf("\r\nTotal weight of the gift: %.2f", weight);
    }
}