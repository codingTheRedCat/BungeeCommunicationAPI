package me.theredcat.bungeecommunication.api.client;

public interface MessageHandler {

    void handle(MessageChannel channel, byte[] message);

}
