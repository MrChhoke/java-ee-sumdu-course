package ua.bondar.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class ClientServer implements Runnable {

    public static final String EXIT_MESSAGE = "exit";

    protected Socket socket;
    protected ServerChat serverChat;
    protected int numClient;

    public ClientServer(Socket socket, ServerChat serverChat, int numClient) {
        this.numClient = numClient;
        this.serverChat = serverChat;
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String message = bufferedReader.readLine();

                if (EXIT_MESSAGE.equals(message)) {
                    serverChat.removeClient(numClient);
                    break;
                }

                serverChat.printMessageInServerConsole(message, numClient);
                serverChat.printMessageToConnectedClients(message, numClient);
            }
        } catch (IOException ignored) {
        }

    }
}
