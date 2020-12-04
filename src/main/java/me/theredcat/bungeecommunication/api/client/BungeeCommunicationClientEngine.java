package me.theredcat.bungeecommunication.api.client;

import org.bukkit.Bukkit;

public interface BungeeCommunicationClientEngine {

    Client getClient();

    default MessageChannel getChannel(String name){
        return getClient().getChannel(name);
    }

    static BungeeCommunicationClientEngine getInstance(){
        try{
            return (BungeeCommunicationClientEngine) Bukkit.getServer().getPluginManager().getPlugin("BungeeCommunication");
        } catch (RuntimeException e){
            e.printStackTrace();
        }

        return null;
    }

}
