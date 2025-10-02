// Pacote: mediator
package mediator;

import colleague.User;
import java.util.ArrayList;
import java.util.List;

// A classe ChatRoom "assina o contrato" e promete seguir as regras de ChatMediator
public class ChatRoom implements ChatMediator {

    // A sala de chat precisa de uma lista para saber quem está participando.
    // É o "radar" da nossa torre de controle.
    private List<User> users;

    public ChatRoom() {
        // Quando a sala é criada, a lista de usuários começa vazia.
        this.users = new ArrayList<>();
    }

    // Implementação da REGRA 2: Adicionar um usuário.
    @Override
    public void addUser(User user) {
        // Simplesmente adicionamos o usuário à nossa lista de participantes.
        this.users.add(user);
    }

    // Implementação da REGRA 1: Enviar uma mensagem.
    @Override
    public void sendMessage(String message, User sender) {
        // Esta é a lógica principal!
        // A sala de chat vai olhar cada usuário em sua lista...
        for (User user : this.users) {
            // ...e vai se perguntar: "Este usuário é a mesma pessoa que enviou a mensagem?"
            if (user != sender) {
                // Se NÃO for, a sala de chat entrega a mensagem para ele.
                user.receiveMessage(message);
            }
        }
    }
}