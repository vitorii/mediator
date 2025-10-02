// Pacote: main
package main;

import colleague.ChatUser;
import colleague.User;
import mediator.ChatMediator;
import mediator.ChatRoom;

public class Application {

    public static void main(String[] args) {
        // 1. Cria o objeto Mediator (a sala de chat)
        ChatMediator chatRoom = new ChatRoom();

        // 2. Cria os Colleagues (usuários), associando-os ao mediator
        User user1 = new ChatUser(chatRoom, "João");
        User user2 = new ChatUser(chatRoom, "Maria");
        User user3 = new ChatUser(chatRoom, "Carlos");

        // 3. Adiciona os usuários à sala de chat (o mediador agora os conhece)
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        System.out.println(" Início da Simulação ");
        
        // 4. Simula a comunicação: João envia uma mensagem
        // Note que João só precisa chamar seu próprio método de envio.
        user1.sendMessage("Olá a todos!");

        System.out.println("\n Nova Mensagem");

        // 5. Simula outra comunicação: Carlos envia uma mensagem
        user3.sendMessage("Oi, pessoal! Tudo bem e vocês?");
        
        System.out.println("\nFim da Simulação");
    }
}