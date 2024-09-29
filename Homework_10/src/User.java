import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User implements UserInterface {
    private String name;
    private Set<User> contacts;
    private List<Message> messages;

    public User(String name) {
        this.name = name;
        this.contacts = new HashSet<>();
        this.messages = new ArrayList<>();
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public Set<User> getContacts() {
        return contacts;
    }
    @Override
    public List<Message> getMessages() {
        return messages;
    }
    @Override
    public void addContact(User user) {
        contacts.add(user);
    }
    @Override
    public void sendMessage(User recipient, String text) {
        if (!contacts.contains(recipient)) {
            System.out.println("User " + recipient.getName() + " is not in your contact list.");
            return;
        }
        Message message = new Message(this, recipient, text);
        recipient.receiveMessage(message);
        System.out.println("Message sent from " + this.name + " to " + recipient.getName() + ": " + text);
    }
    @Override
    public void receiveMessage(Message message) {
        message.setStatus(MessageStatus.RECEIVED);
        messages.add(message);
        System.out.println("Message received by " + this.name + " from " + message.getSender().getName());
    }
    public void readMessages() {
        for (Message message : messages) {
            if (message.getStatus() == MessageStatus.RECEIVED) {
                message.setStatus(MessageStatus.READ);
                System.out.println("Message from " + message.getSender().getName() + " read by " + this.name);
            }
        }
    }
}

