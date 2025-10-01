// Pacote: colleague
package colleague;

import mediator.ChatMediator;

/**
 * A implementação concreta de um Colleague (Usuário).
 */
public class ChatUser extends User {

    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("-> " + this.name + " enviando a mensagem: \"" + message + "\"");
        // O usuário não envia diretamente para outros usuários,
        // ele entrega a mensagem ao MEDIADOR.
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("<- " + this.name + " recebeu a mensagem: \"" + message + "\"");
    }
}