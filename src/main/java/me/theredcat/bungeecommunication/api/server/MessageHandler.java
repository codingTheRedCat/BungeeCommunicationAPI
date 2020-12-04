package me.theredcat.bungeecommunication.api.server;

import net.md_5.bungee.api.config.ServerInfo;

public interface MessageHandler {

    void handle(MessageChannel channel, ServerInfo server, byte[] message);

}
