package me.theredcat.bungeecommunication.api.server;

import me.theredcat.bungeecommunication.api.MessageDeliveryException;
import net.md_5.bungee.api.config.ServerInfo;

import java.io.Closeable;
import java.net.Socket;

/**
 * Represents a connection between BungeeCommunication server (BungeeCord plugin) and client (Spigot plugin).
 *
 * @author TheRedCat
 */
public interface ClientConnection extends Closeable {

    boolean init();

    boolean isReady();

    void sendMessage(short channelID, byte[] message) throws MessageDeliveryException;

    void listen();

    ServerInfo getMinecraftHost();

    Socket getSocket();
}
