// Pacote: colleague
package colleague;

import mediator.ChatMediator;

/**
 * A classe abstrata Colleague. Define um usuário que pode
 * se comunicar através de um Mediator.
 */
public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void sendMessage(String message);

    public abstract void receiveMessage(String message);
    
    public String getName() {
        return name;
    }
}