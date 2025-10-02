// Pacote: mediator
package mediator;

import colleague.User;

/**
 * A interface Mediator define o contrato para a comunicação
 * entre os objetos User (Colleagues).
 */
public interface ChatMediator {

    void sendMessage(String message, User user); 
    //Declara que o mediador deve ser capaz 
    //de enviar uma mensagem em nome de um usuário.

    void addUser(User user); 
    //Declara que o mediador deve permitir 
    //que novos usuários entrem na comunicação.
}