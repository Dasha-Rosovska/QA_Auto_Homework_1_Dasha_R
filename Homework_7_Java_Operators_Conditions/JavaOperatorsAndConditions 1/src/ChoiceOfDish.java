import java.util.Scanner;

public class ChoiceOfDish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберіть тип страви від 1 до 9:");
        int dish = scanner.nextInt();

        switch (dish) {
            case 1:
                System.out.println("Ви обрали основну страву:Борщ червоний.");
                break;
            case 2:
                System.out.println("Ви обрали основну страву: Борщ зелений.");
                break;
            case 3:
                System.out.println("Ви обрали основну страву: Дируни.");
                break;
            case 4:
                System.out.println("Ви обрали основну страву: Вареникі з м'ясом.");
                break;
            case 5:
                System.out.println("Ви обрали закуски: Котлета по-київськи.");
                break;
            case 6:
                System.out.println("Ви обрали десерт: Наполеон.");
            case 7:
                System.out.println("Ви обрали десерт: Медовик.");
            case 8:
                System.out.println("Ви обрали напій: Pepsi.");
            case 9:
                System.out.println("Ви обрали десерт: Fanta.");
                break;
            default:
                System.out.println("Неправильний вибір. Введіть число від 1 до 9.");
        }
    }
}

