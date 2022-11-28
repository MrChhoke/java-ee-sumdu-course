package ua.bondar.client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

public class Messenger {

    protected Socket socket;
    protected SenderClientMessage senderClientMessage;
    protected List<String> messages = new LinkedList<>();

    public Messenger() {

    }

    /**
     * Метод для з'єднання месенджера з сокетом
     * та налаштування усіх необхідних полів пов'язаних з
     * об'єктом месенджер
     *
     * @return повертає true - якщо з'єднання успішне,
     * та false, якщо сервер не працює
     */
    public boolean connect() {
        try {
            socket = new Socket();
            socket.connect(new InetSocketAddress("localhost", 8887), 2000);

            Thread threadSenderClient = new Thread(new ReceiverClientMessage(socket, this));
            threadSenderClient.setDaemon(true);
            threadSenderClient.start();

            senderClientMessage = new SenderClientMessage(socket, this);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public void sendMessage(String message) {
        if (socket == null) {
            throw new IllegalStateException("Спочатку під'єднайтеся до серверу [method Connect]");
        }

        try {
            senderClientMessage.sendMessage(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
