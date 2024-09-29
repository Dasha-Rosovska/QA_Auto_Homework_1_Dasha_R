import java.util.Scanner;

public class CoffeShopVisit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість еспресо:");
        int espressoCount = scanner.nextInt();
        int espressoPrice = 3;

        System.out.println("Введіть кількість лате:");
        int latteCount = scanner.nextInt();
        int lattePrice = 4;

        System.out.println("Введіть кількість капучіно:");
        int cappuccinoCount = scanner.nextInt();
        int cappuccinoPrice = 5;

        int totalCost = (espressoCount * espressoPrice) + (latteCount * lattePrice) + (cappuccinoCount * cappuccinoPrice);

        System.out.println("Загальна вартість вашого замовлення: " + totalCost + " доларів.");
    }
}
