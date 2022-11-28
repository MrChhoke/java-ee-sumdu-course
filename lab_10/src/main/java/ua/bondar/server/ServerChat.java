package ua.bondar.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class ServerChat implements Runnable {

    protected Map<Integer, Socket> clientSockets;
    protected int numClient;

    public ServerChat() {
        clientSockets = new HashMap<>();
    }

    @Override
    public void run() {
        try (ServerSocket server = new ServerSocket(8887)) {
            System.out.println("Сервер почав роботу");

            while (true) {
                Socket socket = server.accept();

                Thread clientThread = new Thread(new ClientServer(socket, this, ++numClient));
                clientThread.setDaemon(true);
                clientThread.start();

                clientSockets.put(numClient, socket);

                System.out.printf("Підключено клієнта %d%n", numClient);
                printMessageToClient(
                        String.format("Вас підключено як клієнта №%d", numClient),
                        numClient
                );
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void printMessageInServerConsole(String message, int numSenderClient) {
        System.out.printf("Клієнт %d: %s%n", numSenderClient, message);
    }

    public void printMessageToClient(String message, int numReceiverClient) {
        Socket clientSocket = clientSockets.get(numReceiverClient);

        if (clientSocket == null) {
            return;
        }

        try {
            PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true);
            pw.println(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void printMessageToConnectedClients(String message, int numSenderClient) {
        clientSockets.forEach((key, value) -> {
            try {
                PrintWriter pw = new PrintWriter(value.getOutputStream(), true);
                pw.printf("Клієнт %d: %s%n", numSenderClient, message);
            } catch (Exception ignored) {
            }
        });
    }

    public void removeClient(int numClient) {
        Socket clientSocket = clientSockets.remove(numClient);

        if (clientSocket == null) {
            return;
        }

        try {
            clientSocket.close();
            System.out.printf("Відключено клієнта %d%n", numClient);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
