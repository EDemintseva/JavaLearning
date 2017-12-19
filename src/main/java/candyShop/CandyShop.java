package candyShop;

import java.util.Scanner;

/**
 * @author Ekaterina Demintseva
 * В классе CandyShop реализован сбор подарка и вывод информации о составе, общей стоимости и общем весе.
 */

public class CandyShop {
    public static void main(String[] args) {
        //Ввод информации о сладостях
        Sweets cupcake = new Sweets();
        cupcake.setName("Cupcake");
        cupcake.setWeight(15.5f);
        cupcake.setPrice(49.99f);
        cupcake.setUnique("Version 1.5");

        Sweets donut = new Sweets();
        donut.setName("Donut");
        donut.setWeight(30.0f);
        donut.setPrice(60.35f);
        donut.setUnique("Version 1.6");

        Sweets eclair = new Sweets();
        eclair.setName("Eclair");
        eclair.setWeight(23.7f);
        eclair.setPrice(52.90f);
        eclair.setUnique("Version 2.0");

        //Ввод количества сладостей в подарке
        System.out.println("Enter amount of sweets:");
        Scanner scanner = new Scanner(System.in);
        String arr[] = new String[scanner.nextInt()];
        //Ввод видов сладостей
        System.out.println("Enter sweets name:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next();
        }
        scanner.close();
        //Подсчёт веса и стоимости. Вывод информации о подарке.
        float price = 0.0f;
        float weight = 0.0f;
        for (String value:arr) {
            if (value.equals(cupcake.getName())) {
                price += cupcake.getPrice();
                weight += cupcake.getWeight();
                System.out.println(cupcake.getName()+": " +"weight - "+ cupcake.getWeight() + "; price - "+cupcake.getPrice()+"; unique - " + cupcake.getUnique());
            } else if (value.equals(donut.getName())) {
                price += donut.getPrice();
                weight += donut.getWeight();
                System.out.println(donut.getName()+": " +"weight - "+ donut.getWeight() + "; price - "+donut.getPrice()+"; unique - " + donut.getUnique());
            } else if (value.equals(eclair.getName())) {
                price += eclair.getPrice();
                weight += eclair.getWeight();
                System.out.println(eclair.getName()+": " +"weight - "+ eclair.getWeight() + "; price - "+eclair.getPrice()+"; unique - " + eclair.getUnique());
            }
        }
        System.out.println("Total price of the gift: " + price);
        System.out.println("Total weight of the gift: " + weight);
    }
}