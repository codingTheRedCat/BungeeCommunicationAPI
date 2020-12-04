package me.theredcat.bungeecommunication.api.server;

import net.md_5.bungee.api.ProxyServer;

public interface BungeeCommunicationServerEngine {

    static BungeeCommunicationServerEngine getInstance(){
        try{
            return (BungeeCommunicationServerEngine) ProxyServer.getInstance().getPluginManager().getPlugin("BungeeCommunication");
        } catch (RuntimeException e){
            e.printStackTrace();
        }
        return null;
    }

    MessageServer getHostedServer();

    MessageChannel registerChannel(String name);

}
