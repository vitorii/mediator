// Pacote: mediator
package mediator;

import colleague.User;

/**
 * A interface Mediator define o contrato para a comunicação
 * entre os objetos User (Colleagues).
 */
public interface ChatMediator {

    void sendMessage(String message, User user);

    void addUser(User user);
}