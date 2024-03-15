package org.acme;

import javax.websocket.server.ServerEndpointConfig;
import javax.websocket.server.ServerContainer;
import javax.websocket.server.ServerEndpoint;
import javax.websocket.DeploymentException;
import org.eclipse.jetty.websocket.jsr356.server.deploy.WebSocketServerContainerInitializer;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class FruitWebSocketServer {

    private static final int PORT = 8080;

    public static void start() {
        Server server = new Server(PORT);

        try {
            // Initialisation du conteneur WebSocket
            ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
            context.setContextPath("/");
            server.setHandler(context);
            ServerContainer container = WebSocketServerContainerInitializer.configureContext(context);

            // Enregistrement de l'endpoint WebSocket
            container.addEndpoint(FruitWebSocketServerEndpoint.class);

            server.start();
            System.out.println("WebSocket server started successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to start WebSocket server.");
        }
    }
}
