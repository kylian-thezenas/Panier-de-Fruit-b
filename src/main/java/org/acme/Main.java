package org.acme;

import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;
import org.java_websocket.WebSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;

public class Main extends WebSocketServer {
    private static Scanner scanner;
    private GameLogic game;

    public Main(int port) {
        super(new InetSocketAddress(port));
        scanner = new Scanner(System.in);
        game = new GameLogic();
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

        // Exemple : Si le message est "placer_fruit_pomme", placer une pomme dans le panier
        if (message.equals("placer_fruit_pomme")) {
            game.placerFruitDansPanier("pomme");
        }
    }

    @Override
    public void onError(WebSocket conn, Exception ex) {
        System.err.println("Une erreur s'est produite sur la connexion " + conn.getRemoteSocketAddress() + ": " + ex);
    }

    public void sendToAll(String message) {
        broadcast(message);
    }

    @Override
    public void onStart() {
        System.out.println("Serveur WebSocket démarré sur le port " + getAddress().getPort());
    }

    public void startGame() {
        for (int i = 0; i < 10; i++) {
            game.ajouterFruitSurTapisRoulant();
        }
        while (game.obtenirFruitsSurTapisRoulant().size() > 0) {
            game.printPremierFruit();
            Fruit fruit = game.obtenirPremierFruitSurTapisRoulant();
            sendToAll("Un nouveau fruit (" + fruit.getType() + ") a été ajouté sur le tapis roulant !");
            String choix = scanner.nextLine();
            if (choix.equals("d")) {
                game.placerFruitDansPanier("pomme");
            } else if (choix.equals("g")) {
                game.placerFruitDansPanier("banane");
            } else if (choix.equals("f")) {
                game.placerFruitDansPanier("caca");
            }
        }
    }

    public static void main(String[] args) {
        int port = 8080; // Port sur lequel le serveur WebSocket écoute
        Main server = new Main(port);
        server.start();
        server.startGame();
    }
}
