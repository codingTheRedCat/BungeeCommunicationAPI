package me.theredcat.bungeecommunication.api.client;

import me.theredcat.bungeecommunication.api.MessageDeliveryException;

import java.util.List;

public interface Client {

    boolean init();

    void listen();

    void sendMessage(short channelID, byte[] message) throws MessageDeliveryException;

    List<? extends MessageChannel> getChannelList();

    default MessageChannel getChannel(short id){
        return getChannelList().get(id);
    }

    default MessageChannel getChannel(String name){
        for(MessageChannel channel : getChannelList()){
            if(channel.getName().equals(name))
                return channel;
        }

        return null;
    }

}
