package me.theredcat.bungeecommunication.api.server;

import java.util.List;

public interface ChannelRegistry {

    MessageChannel registerChannel(String name);

    MessageChannel getChannel(String name);
    MessageChannel getChannel(short id);

    List<? extends MessageChannel> getChannelList();

    short getID(String name);


}
