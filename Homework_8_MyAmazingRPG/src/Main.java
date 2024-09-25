public class Main {
    public static void main(String[] args) {
        Character warrior = new Character("Дієго", 100, 30, 10);
        Character mage = new Character("Дрейк", 100, 30, 5);

        warrior.displayStatus();
        mage.displayStatus();

        while (warrior.isAlive() && mage.isAlive()) {
            warrior.attack(mage);
            mage.displayStatus();
            if (mage.isAlive()) {
                mage.attack(warrior);
                warrior.displayStatus();
            }
        }

        if (warrior.isAlive()) {
            System.out.println(warrior.name + " Виграв!");
        } else {
            System.out.println(mage.name + " Виграв!");
        }

        System.out.println("Загальна кількість створених персонажів: " + Character.characterCount);
    }
}
