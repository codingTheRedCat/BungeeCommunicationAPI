package me.theredcat.bungeecommunication.api;

import me.theredcat.bungeecommunication.api.MessageDeliveryException;

import java.security.GeneralSecurityException;

public class MessageEncryptionException extends MessageDeliveryException {

    public MessageEncryptionException(GeneralSecurityException cause) {
        super("Message was not encrypted or decrypted correctly.",cause);
    }
}
