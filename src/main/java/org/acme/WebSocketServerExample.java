package org.acme;

import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;
import org.java_websocket.WebSocket;
import java.net.InetSocketAddress;

public class WebSocketServerExample extends WebSocketServer {

    public WebSocketServerExample(int port) {
        super(new InetSocketAddress(port));
    }

    @Override
    public void onOpen(WebSocket webSocket, ClientHandshake clientHandshake) {
        System.out.println("Nouvelle connexion: " + webSocket.getRemoteSocketAddress());
    }

    @Override
    public void onClose(WebSocket conn, int code, String reason, boolean remote) {
        System.out.println("Connexion fermée: " + conn.getRemoteSocketAddress());
    }

    @Override
    public void onMessage(WebSocket conn, String message) {
        System.out.println("Message reçu de " + conn.getRemoteSocketAddress() + ": " + message);
        // Traitez le message ici et envoyez une réponse si nécessaire
    }

    @Override
    public void onError(WebSocket conn, Exception ex) {
        System.err.println("Une erreur s'est produite sur la connexion " + conn.getRemoteSocketAddress() + ": " + ex);
    }

    @Override
    public void onStart() {
        System.out.println("Serveur WebSocket démarré sur le port " + getAddress().getPort());
    }


    public static void main(String[] args) {
        int port = 8080; // Port sur lequel le serveur WebSocket écoute
        WebSocketServerExample server = new WebSocketServerExample(port);
        server.start();
        System.out.println("Serveur WebSocket démarré sur le port " + port);
    }
}
