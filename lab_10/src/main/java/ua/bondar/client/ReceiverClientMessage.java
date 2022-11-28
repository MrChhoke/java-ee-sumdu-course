package ua.bondar.client;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ReceiverClientMessage implements Runnable {

    protected Socket clientSocket;
    protected Messenger messenger;

    public ReceiverClientMessage(Socket clientSocket, Messenger messenger) {
        this.clientSocket = clientSocket;
        this.messenger = messenger;
    }

    @Override
    public void run() {
        try (Scanner scanner = new Scanner(clientSocket.getInputStream())) {
            while (true) {
                String messageFromServer = scanner.nextLine();
                messenger.messages.add(messageFromServer);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
