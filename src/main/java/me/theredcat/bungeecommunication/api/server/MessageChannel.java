package me.theredcat.bungeecommunication.api.server;

import me.theredcat.bungeecommunication.api.MessageDeliveryException;
import net.md_5.bungee.api.config.ServerInfo;

public interface MessageChannel {

    void sendMessage(ServerInfo server, byte[] message) throws MessageDeliveryException;

    void setHandler(MessageHandler handler);
    MessageHandler getHandler();

    short getID();
    String getName();


}
