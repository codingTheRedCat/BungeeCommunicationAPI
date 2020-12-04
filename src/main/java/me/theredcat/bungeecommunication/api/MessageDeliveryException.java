package me.theredcat.bungeecommunication.api;

import java.io.IOException;

public class MessageDeliveryException extends RuntimeException{

    public MessageDeliveryException(IOException cause){
        super("The message was not transferred through socket correctly.",cause);
    }

    protected MessageDeliveryException(String message, Throwable cause){
        super(message,cause);
    }

}
