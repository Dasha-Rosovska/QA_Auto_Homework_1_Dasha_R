public class Main {
    public static void main(String[] args) {

    User user1 = new User("Андрій");
    User user2 = new User("Сергій");
    User user3 = new User("Дмитро");

    user1.addContact(user2);
    user2.addContact(user1);
    user2.addContact(user3);
    user3.addContact(user2);

    user1.sendMessage(user2, "Привіт, Сергій!");
    user2.sendMessage(user3, "Привіт, Дмитро!");

    System.out.println("\nПовідомлення для Сергія:");
    for (Message msg : user2.getMessages()) {
        System.out.println(msg.getText() + " (Статус: " + msg.getStatus() + ")");
    }

    System.out.println("\nПовідомлення для Дмитра:");
    for (Message msg : user3.getMessages()) {
        System.out.println(msg.getText() + " (Статус: " + msg.getStatus() + ")");
    }

    System.out.println("\nСергій прочитав повідомлення:");
    user2.readMessages();

    System.out.println("\nДмитро прочитав повідомлення:");
    user3.readMessages();

    System.out.println("\nПовідомлення від Сергія (після прочитання):");
    for (Message msg : user2.getMessages()) {
        System.out.println(msg.getText() + " (Статус: " + msg.getStatus() + ")");
    }

    System.out.println("\nПовідомлення від Дмитра (після прочитання):");
    for (Message msg : user3.getMessages()) {
        System.out.println(msg.getText() + " (Статус: " + msg.getStatus() + ")");
    }
}
}
