package me.theredcat.bungeecommunication.api.client;

import me.theredcat.bungeecommunication.api.MessageDeliveryException;

public interface MessageChannel {

    void sendMessage(byte[] message) throws MessageDeliveryException;

    void setHandler(MessageHandler handler);
    MessageHandler getHandler();

    short getID();
    String getName();

}
