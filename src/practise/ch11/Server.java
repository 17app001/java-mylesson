package practise.ch11;

class ServerTimeoutException extends Exception {
    private int port;
    private String message;

    ServerTimeoutException(String message, int port) {
        this.port = port;
        this.message = message;
    }

    public int getPort() {
        return port;
    }

    @Override
    public String toString() {
        return "ServerTimeoutException{" +
                "port=" + port +
                ", message='" + message + '\'' +
                '}';
    }
}

public class Server {
    private int timeDelay;

    public void connect(String ip, int port) throws ServerTimeoutException {

        while (true) {
            if (++timeDelay >= 1000) {
                throw new ServerTimeoutException(ip + "處理逾時....", port);
            }
        }
    }
}
