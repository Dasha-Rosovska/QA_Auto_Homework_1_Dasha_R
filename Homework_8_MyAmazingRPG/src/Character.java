public class Character {
    String name;
    int health;
    int strength;
    int defense;
    static int characterCount = 0;

    public Character(String name, int health, int strength, int defense) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        characterCount++;
    }

    public void attack(Character other) {
        int damage = this.strength - other.defense;
        if (damage < 0) {
            damage = 0;
        }
        System.out.println(this.name + " нападає " + other.name + " та завдає шкоди: " + damage + " очок!");
        other.takeDamage(damage);
    }
    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }
    public boolean isAlive() {
        return this.health > 0;
    }
    public void displayStatus() {
        System.out.println(this.name + ": Здоров'я = " + this.health + ", Сила = " + this.strength + ", Захист = " + this.defense);
    }
}
