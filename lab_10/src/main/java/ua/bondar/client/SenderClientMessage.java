package ua.bondar.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderClientMessage {

    protected Socket clientSocket;
    protected Messenger messenger;

    public SenderClientMessage(Socket clientSocket, Messenger messenger) {
        this.clientSocket = clientSocket;
        this.messenger = messenger;
    }

    public void sendMessage(String messageToServer) throws IOException {
        PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true);
        pw.println(messageToServer);
    }
}