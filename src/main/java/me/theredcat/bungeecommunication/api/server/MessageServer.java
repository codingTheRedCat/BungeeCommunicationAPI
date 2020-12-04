package me.theredcat.bungeecommunication.api.server;

import me.theredcat.bungeecommunication.api.MessageDeliveryException;
import net.md_5.bungee.api.config.ServerInfo;

import java.io.Closeable;
import java.net.Socket;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public interface MessageServer extends Closeable {

    boolean isActive();

    Map<ServerInfo, ClientConnection> getConnections();

    void sendMessage(ServerInfo serverInfo,short channelID, byte[] message) throws MessageDeliveryException;

    void reportIncoming(short channelID, byte[] message,ServerInfo serverInfo);

    default ClientConnection getConnection(ServerInfo serverInfo){
        return getConnections().get(serverInfo);
    }

    default Collection<Socket> getSockets(){
        Set<Socket> sockets = new HashSet<Socket>();

        getConnections().values().forEach(clientConnection -> sockets.add(clientConnection.getSocket()));

        return sockets;
    }

    ChannelRegistry getChannelRegistry();

}
