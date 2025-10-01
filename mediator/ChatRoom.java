// Pacote: mediator
package mediator;

import colleague.User;
import java.util.ArrayList;
import java.util.List;

/**
 * A implementação concreta do Mediator. Esta sala de chat gerencia
 * a comunicação entre os usuários.
 */
public class ChatRoom implements ChatMediator {

    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        // Envia a mensagem para todos os usuários, exceto para quem enviou.
        for (User user : this.users) {
            if (user != sender) {
                user.receiveMessage(message);
            }
        }
    }
}